/**
 * 
 */

/**
 * @author oliver
 *
 */
public class Robot {
	private int direccion;
	private int monedas;
	private int x;
	private int y;
	
	public void rotar() {
		direccion += 1;
		if (direccion >3) {
			direccion = 0;
		}
	}
	
	public void move(MapController map) {
		
	}
	
	public void pick(MapController map) {
		
	}
	
	public String toString() {
		if(direccion == 0) {
			return ">";
		}
		if(direccion == 1) {
			return "v";
		}
		if(direccion == 2) {
			return "<";
		}
			return "^";	
	}
	
	
	
	
	
}
