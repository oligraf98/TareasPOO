/**
 * 
 */
import java.util.Scanner;
/**
 * @author oliver
 *
 */
public class Main {

	private static Scanner input;
	/**
	 * @param args
	 */
	public static void menu() {
		System.out.println("Menu Principal:\n\t1.Agregar Nivel\n\t2.Agregar Grado\n\t3.Agregar Estudiante\n\t4.Ver Grados en un Nivel\n\t5.Ver asignaciones en un Grado\n\t6.Salir");
	}
	public static void main(String[] args) {
		Colegio colegio = new Colegio();
		Boolean on = true;
		input = new Scanner(System.in);
		menu();

		do {
			System.out.println("Elija el numero de la opcion que desea ejecutar (1-6):");
			String opcion = input.nextLine();
			switch(opcion.compareToIgnoreCase(opcion)) {
				case 1:
					System.out.println("Ingrese el nombre del nivel que desea agregar:");
					String nivel = input.nextLine();
					if (colegio.getNiveles().containsKey(nivel)) {
						System.out.println("Ese nivel ya fue creado previamente");
					}else {
						colegio.agregarNivel(nivel);
						System.out.println("El nivel "+nivel+" ha sido agregado exitosamente");
					}
					break;
					
				case 2:
					break;
					
				case 3:
					break;
					
				case 4:
					break;
					
				case 5:
					break;
					
				case 6:
					break;
				default:
					System.out.println("Error\nDebe ingresar un numero del uno al seis (1-6)");
					break;
				
			}
		}while(on);

	}

}
