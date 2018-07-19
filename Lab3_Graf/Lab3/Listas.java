import java.util.HashMap;
import java.util.ArrayList;
public class Listas {
	private HashMap<String, ArrayList<String>> hash = new HashMap<>();

	public HashMap<String, ArrayList<String>> getHash() {
		return hash;
	}

	public String opciones(String nombre) {
		String opciones = "\t1. Deseleccionar lista actual (" + nombre + ")\n\t2. Agregar una tarea\n\t3. Completar una tarea\n\t4. Ver todas las tareas de esta lista\n\t5. Salir (cerrar programa)";
		return opciones;
	}
	
	public void crearLista(String nombre) {
		ArrayList<String> array = new ArrayList<>();
		hash.put(nombre, array);
	}
	
	public void verListas() {
		for (String name: hash.keySet()){

            String key =name.toString();
            System.out.println(key);  

		}
	}
	
	public void agregarTarea(String lista,String tarea) {
		hash.get(lista).add(tarea);
	}
	
	public void completarTarea(String lista, String tarea) {
		hash.get(lista).remove(tarea);
	}
	
	public void verTareas(String lista) {
		int x = 1;
		for(String tarea: hash.get(lista)) {
			System.out.println(x+". "+tarea);
			x++;
		}
	}
}
