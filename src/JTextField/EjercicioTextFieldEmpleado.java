package JTextField;

import java.time.LocalDate;

public class EjercicioTextFieldEmpleado {
	private String nombre;
	private String apellidos;
	private String direccion;
	private int codigo_postal;
	private LocalDate edad;
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param direccion
	 * @param codigo_postal
	 * @param edad
	 */
	public EjercicioTextFieldEmpleado(String nombre, String apellidos, String direccion, int codigo_postal,
			LocalDate edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.codigo_postal = codigo_postal;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(int codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public LocalDate getEdad() {
		return edad;
	}

	public void setEdad(LocalDate edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "EjercicioTextFieldEmpleado [nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion
				+ ", codigo_postal=" + codigo_postal + ", edad=" + edad + "]";
	}
	
}
