import java.util.HashMap;
import java.util.ArrayList;
public class Colegio {
	private HashMap<String, ArrayList<Grado>> niveles = new HashMap<>();
	
	public void agregarNivel(String nombre ) {
		niveles.put(nombre, null);
	}

	/**
	 * @return the niveles
	 */
	public HashMap<String, ArrayList<Grado>> getNiveles() {
		return niveles;
	}

	
}
