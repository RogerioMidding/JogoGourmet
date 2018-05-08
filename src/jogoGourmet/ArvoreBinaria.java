package jogoGourmet;

public class ArvoreBinaria {

	private Elemento elemento;
	private ArvoreBinaria arvoreEsquerda;
	private ArvoreBinaria arvoreDireita;
	
	public Elemento getElemento() {
		return elemento;
	}
	public void setElemento(Elemento elemento) {
		this.elemento = elemento;
	}
	public ArvoreBinaria getArvoreEsquerda() {
		return arvoreEsquerda;
	}
	public void setArvoreEsquerda(ArvoreBinaria arvoreEsquerda) {
		this.arvoreEsquerda = arvoreEsquerda;
	}
	public ArvoreBinaria getArvoreDireita() {
		return arvoreDireita;
	}
	public void setArvoreDireita(ArvoreBinaria arvoreDireita) {
		this.arvoreDireita = arvoreDireita;
	}
	
}
