package JComboBox;

public class Ciudad {
	private String nombre;
	private int codigoPostal;
	
	/**
	 * @param nombre
	 * @param codigoPostal
	 */
	public Ciudad(String nombre, int codigoPostal) {
		this.nombre = nombre;
		this.codigoPostal = codigoPostal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return nombre;
	}
	
	
	
	
	
}
