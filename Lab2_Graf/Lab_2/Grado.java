import java.util.ArrayList;
import java.util.HashMap;

public class Grado {

	private HashMap<String, String> estudiantes;

	
	public Grado() {
		estudiantes = new HashMap<>();
	}


	/**
	 * @return the estudiantes
	 */
	public HashMap<String, String> getEstudiantes() {
		return estudiantes;
	}

	public void agregarEstudiante(String nombre, String codigo) {
		estudiantes.put(nombre, codigo);
	}

	
}
