package jogoGourmet;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class JogoGourmet implements Jogar {

	private ArvoreBinaria raiz;
	private boolean resposta = false;
	
	public JogoGourmet() {}
	
	public JogoGourmet(ArvoreBinaria raiz) {
		super();
		this.raiz = raiz;
	}

	public void iniciar() {
		JOptionPane option = new JOptionPane();
		option.setMessage("Pense em um prato que você gosta");
		
		JDialog dialog = option.createDialog("Jogo Gourmet");
		dialog.setVisible(true);
		
		adivinhar(raiz, raiz);
	}
	
	public void adivinhar(ArvoreBinaria arvore, ArvoreBinaria referencia) {
		Integer opcao = null;
		opcao = JOptionPane.showConfirmDialog(null, "O prato que você pensou é " + arvore.getElemento().getValor() + "?", 
				"Confirm", JOptionPane.YES_NO_OPTION);
		
		if (arvore.getElemento().getTipo().equals(Tipo.CARACTERISTICA)) {
			if (opcao == JOptionPane.YES_OPTION) {
				resposta = true;
				adivinhar(arvore.getArvoreDireita(), arvore);
			}
			else {
				resposta = false;
				adivinhar(arvore.getArvoreEsquerda(), arvore);
			}
		}
		else if (arvore.getElemento().getTipo().equals(Tipo.PRATO)) {
			if (opcao == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Acertei de novo!", "Jogo Gourmet", JOptionPane.INFORMATION_MESSAGE);
				iniciar();
			}
			else
				desistir(arvore, referencia);
		}
    }
	
	public void inserir(Elemento caracteristica, Elemento prato, ArvoreBinaria referencia) {
		ArvoreBinaria arvoreCaracteristica = new ArvoreBinaria();
		arvoreCaracteristica.setElemento(caracteristica);
		
		ArvoreBinaria arvorePalpite = new ArvoreBinaria();
		arvorePalpite.setElemento(prato);
		
		arvoreCaracteristica.setArvoreDireita(arvorePalpite);
		
		if (resposta) {
			arvoreCaracteristica.setArvoreEsquerda(referencia.getArvoreDireita());
			referencia.setArvoreDireita(arvoreCaracteristica);
		}
		else {
			arvoreCaracteristica.setArvoreEsquerda(referencia.getArvoreEsquerda());
			referencia.setArvoreEsquerda(arvoreCaracteristica);
		}
		
		iniciar();
	}
	
	public void desistir(ArvoreBinaria arvore, ArvoreBinaria referencia) {
		String termo = "";
		
		termo = JOptionPane.showInputDialog(null, "Qual prato você pensou?", "Desisto", JOptionPane.QUESTION_MESSAGE);
		Elemento prato = new Elemento(Tipo.PRATO, termo);
		
		termo = JOptionPane.showInputDialog(null, termo + " é ___________ mas " + arvore.getElemento().getValor() + " não.", 
				"Complete", JOptionPane.QUESTION_MESSAGE);
		Elemento caracteristica = new Elemento(Tipo.CARACTERISTICA, termo);
		
		inserir(caracteristica, prato, referencia);
	}

}
