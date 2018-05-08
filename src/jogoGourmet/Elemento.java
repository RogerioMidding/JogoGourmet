package jogoGourmet;

public class Elemento {

	public Elemento() {}
	
	public Elemento(Tipo tipo, String valor) {
		super();
		this.tipo = tipo;
		this.valor = valor;
	}
	
	private Tipo tipo;
	private String valor;
	
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
}
