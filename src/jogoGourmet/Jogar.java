package jogoGourmet;

public interface Jogar {

	public void iniciar();
	public void adivinhar(ArvoreBinaria arvore, ArvoreBinaria referencia);
	public void inserir(Elemento car, Elemento pal, ArvoreBinaria referencia);
	public void desistir(ArvoreBinaria arvore, ArvoreBinaria referencia);
	
}
