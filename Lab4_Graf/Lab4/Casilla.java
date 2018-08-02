
public class Casilla {
	
	private int x;
	private int y;
	private int coins;
	private Boolean tieneRobot;
	private Boolean esPared;
	
	public void pick() {
		coins--;
		if(coins<0) {
			coins = 0;
		}
	}
	
	public void toggleRobot() {
		tieneRobot = !tieneRobot;
	}
	
	public Casilla(int y, int x, int coins, Boolean tieneRobot, Boolean esPared) {
		this.x=x;
		this.y=y;
		this.coins = coins;
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

	public int getX() {
		return x;
	}

	

	public int getY() {
		return y;
	}

	public int getCoins() {
		return coins;
	}

	public Boolean getEsPared() {
		return esPared;
	}

	public void setEsPared(Boolean esPared) {
		this.esPared = esPared;
	}

	

	

}
