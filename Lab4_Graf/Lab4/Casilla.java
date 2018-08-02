
public class Casilla {
	
	private int x;
	private int y;
	private int coins;
	private Boolean tieneRobot;
	private Boolean esPared;
	
	public void pick(MapController map) {
		
	}
	
	public void toggleRobot(MapController map) {
		
	}
	
	public Casilla(int y, int x, int coins, Boolean tieneRobot, Boolean esPared) {
		this.x=x;
		this.y=y;
		this.tieneRobot=tieneRobot;
		this.esPared=esPared;
	}
	
	public String toString(Robot robot) {
		String x = (esPared)? "*":"";
		if(tieneRobot) {
			return robot.toString();
		}
		return x;
	}

}
