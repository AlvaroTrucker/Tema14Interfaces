package modeloVistaControlador;

public class Modelo {
	private int contador = 0;

	/**
	 * @param contador
	 */
	public Modelo(int contador) {
		this.contador = contador;
	}
	
	public void incrementarContador(){
		this.contador++;
	}
	
	public int getContador(){
		return contador;
	}
}
