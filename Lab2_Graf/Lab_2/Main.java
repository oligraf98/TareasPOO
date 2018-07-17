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
		String nivel;
		String grado;
		input = new Scanner(System.in);
		

		do {
			menu();
			System.out.println("Elija el numero de la opcion que desea ejecutar (1-6):");
			String opcion = input.nextLine();
			switch(opcion) {
				case "1":
					System.out.println("Ingrese el nombre del nivel que desea agregar:");
					nivel = input.nextLine();
					if (colegio.getNiveles().containsKey(nivel)) {
						System.out.println("Ese nivel ya fue creado previamente");
					}else {
						colegio.agregarNivel(nivel);
						System.out.println("El nivel "+nivel+" ha sido agregado exitosamente");
					}
					break;
					
				case "2":
					System.out.println("Ingrese el nombre del nivel al cual le desea agregar un grado: ");
					nivel = input.nextLine();
					System.out.println("Ingrese el nombre del grado que quiere agregar: ");
					grado = input.nextLine();
					
					
					if(!colegio.getNiveles().containsKey(nivel)) {
						System.out.println("El nivel que usted especifico no existe.\nDesea crealo (si/no)");
						String sino = input.nextLine();
						switch(sino){
						case "si":
							colegio.agregarNivel(nivel);
							colegio.agregarGrado(nivel, grado);
							System.out.println("El nivel "+nivel+" ha sido agregado exitosamente\nAdicionalmente el grado especificado por usted anteriormente fue agregado al nivel.");
							break;
						case "no":
							System.out.println("De acuerdo.\nRegresando al menu principal.");
							break;
						default:
							System.out.println("Lo que usted ingreso no es una opcion valida.\nRegresando al menu principal.");
							break;
						}
						
						
					}else {
						colegio.agregarGrado(nivel, grado);;
						System.out.println("El grado "+grado+" ha sido agregado al nivel "+nivel+" exitosamente.");
					}

					break;
					
				case "3":
					System.out.println("Ingrese el nombre del nivel: ");
					nivel = input.nextLine();
					if (!colegio.getNiveles().containsKey(nivel)) {
						System.out.println("El nivel que especifico no existe.\nRegresando al menu principal.");
					}else {
						System.out.println("Ingrese el nombre del grado: ");
						grado = input.nextLine();
						if(!colegio.getNiveles().get(nivel).containsKey(grado)) {
							System.out.println("El grado que especifico no existe.\nRegresando al menu principal.");
						}else {
							System.out.println("Ingrese el nombre del Estudiante: ");
							String nombre = input.nextLine();
							System.out.println("Ingrese el codigo del Estudiante: ");
							String codigo = input.nextLine();
							colegio.getNiveles().get(nivel).get(grado).agregarEstudiante(nombre, codigo);
							System.out.println("Estudiante ingresado exitosamente.");
						}
					}
					break;
					
				case "4":
					System.out.println("Ingrese el nombre del nivel: ");
					nivel = input.nextLine();
					if (!colegio.getNiveles().containsKey(nivel)) {
						System.out.println("El nivel que especifico no existe.\nRegresando al menu principal.");
					}else {
						System.out.println("Estos son los grados en el nivel especificado: ");
						for (String name: colegio.getNiveles().get(nivel).keySet()){

				            String key =name.toString();
				            System.out.println(key);  


				}
					}
					break;
					
				case "5":
					System.out.println("Ingrese el nombre del nivel: ");
					nivel = input.nextLine();
					if (!colegio.getNiveles().containsKey(nivel)) {
						System.out.println("El nivel que especifico no existe.\nRegresando al menu principal.");
					}else {
						System.out.println("Ingrese el nombre del grado: ");
						grado = input.nextLine();
						if (!colegio.getNiveles().get(nivel).containsKey(grado)) {
							System.out.println("El grado especificado no existe.\nRegresando al menu principal.");
						}else {
							System.out.println("Estos son los alumnos asignados al grado especificado en el nivel "+nivel+".");
							for (String name: colegio.getNiveles().get(nivel).get(grado).getEstudiantes().keySet()){

					            String key =name.toString();
					            String value = colegio.getNiveles().get(nivel).get(grado).getEstudiantes().get(name).toString();  
					            System.out.println(key + " " + value);  


					}
						}
						
					}
					break;
					
				case "6":
					System.out.println("Gracias por utilizar nuestros servicios.\nCerrando programa.");
					on = false;
					break;
				default:
					System.out.println("Error\nDebe ingresar un numero del uno al seis (1-6)");
					break;
				
			}
		}while(on);

	}

}
