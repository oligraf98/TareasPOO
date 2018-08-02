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
	
	public Robot(int direccion, int y, int x) {
		this.direccion = direccion;
		this.y = y;
		this.x = x;
		
		
	}
	public void move() {
		switch (direccion) {
		case 0:
			x++;
			break;
		case 1:
			y++;
			break;
		case 2:
			x--;
			break;
		case 3:
			y--;
			break;
		}
	}
	
	public Boolean pick(MapController map) {
		for(Casilla casilla: map.getCasillas()) {
			if (casilla.getX()==x && casilla.getY()==y && casilla.getCoins()>0) {
				monedas++;
				return true;
			}
			
		}
		return false;
	}
	
	
	
	public int getDireccion() {
		return direccion;
	}


	public int getX() {
		return x;
	}



	public int getY() {
		return y;
	}



	public String getMonedas() {
		String m = "El numero de monedas recogidas es " + Integer.toString(monedas) + ".";
		return m;
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
