import java.util.HashMap;

public class Colegio {
	private HashMap<String, HashMap<String,Grado>> niveles = new HashMap<>();
	
	public void agregarNivel(String nombre ) {
		HashMap<String,Grado> a = new HashMap<>();
		niveles.put(nombre, a);
	}
	public void agregarGrado(String nivel, String nombre) {
		Grado g = new Grado();
		niveles.get(nivel).put(nombre, g);
	}

	/**
	 * @return the niveles
	 */
	public HashMap<String,HashMap<String,Grado>> getNiveles() {
		return niveles;
	}

	
}
