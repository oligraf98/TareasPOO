import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;




public class MapController {
	private String [][] map;
	private Robot robot;
	private ArrayList<Casilla> casillas;
	private int rows = 0;
	private int columns = 0;
	
	public Scanner row;
	public Scanner col;
	
	public void cargarMapa() {
		rows = 0;
		columns = 0;
		try {
		row = new Scanner(new File("C:\\Users\\oliver\\Desktop\\TareasPOO\\TareasPOO\\Lab4_Graf\\Lab4\\map.txt"));
		
		
		while(row.hasNextLine()){
		    ++rows;
		    col = new Scanner(row.nextLine());
		    while(col.hasNext()){
		        ++columns;
		    }
		}
		map = new String[rows][columns];
		
		// read in the data
		row = new Scanner(new File("C:\\Users\\oliver\\Desktop\\TareasPOO\\TareasPOO\\Lab4_Graf\\Lab4\\map.txt"));
		for(int i = 0; i < rows; ++i){
		    for(int j = 0; j < columns; ++j){
		        if(row.hasNext()) {
		            map[i][j] = row.next();
		        }
		    }
		}
		}catch(Exception e) {
			System.out.println("Error al cargar el mapa");
		}
		
	}
	
	public void crearMapa() {
		
		for(int i = 0; i> rows; i++) {
			for(int j = 0; j>columns; j++) {
				switch (map[i][j]) {
				case "*":
					casillas.add(new Casilla(i,j,0,false,true));
					break;
				case "0":
					casillas.add(new Casilla(i,j, 0,false, false));
					break;
				case "<":
					casillas.add(new Casilla(i,j, 0,true, false));
					robot = new Robot(2, i, j);
					break;
				case "^":
					casillas.add(new Casilla(i,j, 0,true, false));
					robot = new Robot(3, i, j);
					break;
				case ">":
					casillas.add(new Casilla(i,j, 0,true, false));
					robot = new Robot(0, i, j);
					break;
				case "v" :
					casillas.add(new Casilla(i,j, 0,true, false));
					robot = new Robot(1, i, j);
					break;
				default :
					int coins = Integer.parseInt(map[i][j]); 
					casillas.add(new Casilla(i, j, coins, false, false));
				}
				
			}
		}
		
		this.toString();
		
	}
	
	public void process() {
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\oliver\\Desktop\\TareasPOO\\TareasPOO\\Lab4_Graf\\Lab4\\programa.txt"))) {
		    for(String line; (line = br.readLine()) != null; ) {
		        // process the line.
		    	switch (line) {
		    	case "MOVE":
		    		this.move();
		    		this.toString();
		    		Thread.sleep(500);
		    		break;
		    	case "ROTATE":
		    		robot.rotar();
		    		this.toString();
		    		Thread.sleep(500);
		    		break;
		    	case "PICK":
		    		this.pick();
		    		this.toString();
		    		Thread.sleep(500);
		    		break;
		    	}
		    }
		    // line is not visible here.
		}catch(Exception e) {
			System.out.println("Hubo un error al ejecutar el programa.");
		}
	}
	
	public void pick() {
		robot.pick(this);
		for(Casilla casilla: casillas) {
			if(casilla.getX()==robot.getX()&&casilla.getY()==robot.getY()) {
				casilla.pick();
			}
		}
	}
	
	public Boolean move() {
		switch (robot.getDireccion()) {
		case 0:
			for(Casilla casilla: casillas) {
				if (casilla.getX() == (robot.getX()+1) && casilla.getY() == robot.getY()) {
					if (casilla.getEsPared()) {
						return false;
					}else {
						for(Casilla c: casillas) {
							if (c.getX() == robot.getX() && c.getY()==robot.getY()) {
								c.toggleRobot();
							}
						}
						robot.move();
						casilla.toggleRobot();
						return true;
					}
				}	
			}
			return true;
			
		case 1:
			for(Casilla casilla: casillas) {
				if(casilla.getY()== (robot.getY()+1) && casilla.getX() == robot.getX()) {
					if (casilla.getEsPared()) {
						return false;
					}else {
						for(Casilla c: casillas) {
							if (c.getX() == robot.getX() && c.getY()==robot.getY()) {
								c.toggleRobot();
							}
						}
						robot.move();
						casilla.toggleRobot();
						return true;
					}
				}
			}
			return true;
			
		case 2:
			for(Casilla casilla: casillas) {
				if (casilla.getX() == (robot.getX()-1) && casilla.getY() == robot.getY()){
					if(casilla.getEsPared()) {
						return false;
					}else {
						for(Casilla c: casillas) {
							if (c.getX() == robot.getX() && c.getY()==robot.getY()) {
								c.toggleRobot();
							}
						}
						robot.move();
						casilla.toggleRobot();
						return true;
					}
				}
			}
			return true;
		case 3:
			for(Casilla casilla: casillas) {
				if(casilla.getY() == (robot.getY()-1) && casilla.getX() == robot.getX()) {
					if(casilla.getEsPared()) {
						return false;
					}else {
						for(Casilla c: casillas) {
							if (c.getX() == robot.getX() && c.getY()==robot.getY()) {
								c.toggleRobot();
							}
						}
						robot.move();
						casilla.toggleRobot();
						return true;
					}
				}
			}
			return true;
		}
	}

	public ArrayList<Casilla> getCasillas() {
		return casillas;
	}
	
	public String toString() {
		String mapa = "";
		int y = 0;
		for(Casilla casilla: casillas) {
			if (casilla.getY() > y) {
				y++;
				mapa += "\n";
			}
			mapa += casilla.toString();
		}
		
		return mapa;
		
		
	}

	
	
	
}
