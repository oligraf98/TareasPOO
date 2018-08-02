import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapController map = new MapController();
		System.out.println("Bienvenido a pseudoRURPLE!\nInstrucciones:\n\tEl mapa y el programa que quiere que el robot recorra deben estar en el folder src del programa. Si no ha introducido ningun archivo, hagalo antes de usar el programa.");
		System.out.println("1. Iniciar el programa.\n2.Salir.");
		
		Scanner input = new Scanner(System.in);
		String opcion = input.nextLine();
		
		switch(opcion) {
		case "1":
			System.out.println("Iniciando...");
			map.cargarMapa();
			map.crearMapa();
			map.process();
			System.out.println("Fin");
			break;
		case "2":
			System.out.println("Adios.");
			break;
			default:
				System.out.println("Adios.");
				break;
		}
	}

}
