import java.util.ArrayList;
import java.util.HashMap;

public class Grado {
	private String nombre;
	private HashMap<String, String> estudiantes = new HashMap<>();
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
