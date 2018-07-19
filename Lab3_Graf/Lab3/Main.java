/**
 * 
 */
import java.util.Scanner;
/**
 * @author oliver
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static String menu(Boolean si) {
		String menu1 = "\t1. Crear lista de tareas\n\t2. Salir";
		String menu2 = "\t1. Crear lista de tareas\n\t2. Ver todas las listas de tareas\n\t3. Seleccionar una lista de tareas\n\t4. Salir";
		if(si) {
			return menu1;
		}else {
			return menu2;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Listas listas = new Listas();
		Boolean on = true;
		String opcion;
		String lista;
		String tarea;
		
		System.out.println("Bienvenido al organizador de tareas.");
		do {
			System.out.println(menu(listas.getHash().isEmpty()));
			if(listas.getHash().isEmpty()) {
				opcion = scan.nextLine();
				switch(opcion){
				case "1":
					System.out.println("Ingrese el nombre de su nueva lista de tareas:");
					lista = scan.nextLine();
					listas.crearLista(lista);
					System.out.println("La lista fue creada exitosamente!");
					break;
				case "2":
					System.out.println("Cerrando el programa...\nAdios.");
					on = false;
					break;
				default:
					System.out.println("La opcion que elijio no es valida.\nIntentelo de nuevo.");
					break;
				}
			}else {
				opcion = scan.nextLine();
				switch(opcion){
				case "1":
					System.out.println("Ingrese el nombre de su nueva lista de tareas:");
					lista = scan.nextLine();
					listas.crearLista(lista);
					System.out.println("La lista fue creada exitosamente!");
					break;
				case "2":
					System.out.println("Estas son las listas:");
					listas.verListas();
					break;
				case "3":
					listas.verListas();
					System.out.println("Ingrese el nombre de la lista a seleccionar: ");
					lista = scan.nextLine();
					if (listas.getHash().containsKey(lista)) {
						System.out.println("Lista "+lista+" seleccionada exitosamente!");
						Boolean sel = true;
						do {
							System.out.println(listas.opciones(lista));
							opcion = scan.nextLine();
							switch(opcion){
							case "1":
								
								System.out.println("Saliendo al menu principal.");
								sel = false;
								break;
							case"2":
								System.out.println("Ingrese el titulo de la nueva tarea: ");
								tarea = scan.nextLine();
								listas.agregarTarea(lista, tarea);
								System.out.println("Tarea creada exitosamente.");
								break;
							case"3":
								if(listas.getHash().get(lista).isEmpty()) {
									System.out.println("No tiene tareas creadas en esta lista.");
								}else {
									listas.verTareas(lista);
									System.out.println("Ingrese el nombre de la tarea que quiere completar: ");
									tarea = scan.nextLine();
									try {
										listas.completarTarea(lista, tarea);
										System.out.println("Tarea completada exitosamente!");
									}catch(Exception e) {
										System.out.println("Error al completar dicha tarea.\nAsegurese de que la tarea que elijio existe.");
									}
								}
								
								break;
							case"4":
								System.out.println("Tareas: ");
								listas.verTareas(lista);
								
								break;
							case"5":
								System.out.println("Cerrando el programa...\nAdios.");
								sel = false;
								on = false;
								break;
							default:
								System.out.println("La opcion que elijio no es valida.\nIntentelo de nuevo.");
								break;
							}
						}while(sel);
						
					}else {
						System.out.println("La lista que especifico no existe.");
					}
					break;
				case "4":
					System.out.println("Cerrando el programa...\nAdios.");
					on = false;
					break;
				default:
					System.out.println("La opcion que elijio no es valida.\nIntentelo de nuevo.");
					break;
					
			}
			}}while(on);
		
		
	}

}
