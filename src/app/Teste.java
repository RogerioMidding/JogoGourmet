package app;

import jogoGourmet.ArvoreBinaria;
import jogoGourmet.Elemento;
import jogoGourmet.Jogar;
import jogoGourmet.JogoGourmet;
import jogoGourmet.Tipo;

public class Teste {
	
	public static void main(String[] args) {
		Elemento origem = new Elemento(Tipo.CARACTERISTICA, "massa");
		Elemento bolo = new Elemento(Tipo.PRATO, "Bolo de Chocolate");
		Elemento lasanha = new Elemento(Tipo.PRATO, "Lasanha");
		
		ArvoreBinaria direita = new ArvoreBinaria();
		ArvoreBinaria esquerda = new ArvoreBinaria();
		ArvoreBinaria raiz = new ArvoreBinaria();
		
		esquerda.setElemento(bolo);
		direita.setElemento(lasanha);

		raiz.setElemento(origem);
		raiz.setArvoreEsquerda(esquerda);
		raiz.setArvoreDireita(direita);
		
		Jogar jogo = new JogoGourmet(raiz);
		jogo.iniciar();
	}
	
}
