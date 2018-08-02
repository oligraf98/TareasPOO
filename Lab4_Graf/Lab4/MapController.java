import java.io.File;
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
		
		row = new Scanner(new File("src/map.txt"));
		
		
		while(row.hasNextLine()){
		    ++rows;
		    col = new Scanner(row.nextLine());
		    while(col.hasNextInt()){
		        ++columns;
		    }
		}
		map = new String[rows][columns];
		
	}
	
	public void crearMapa() {
		
		for(int i = 0; i> rows; i++) {
			for(int j = 0; j>columns; j++) {
				if(map[i][j].equals("*")) {
					casillas.add(new Casilla(i,j,0,false,true));
				}
				if(map[i][j].equals("0")) {
					casillas.add(new Casilla(i,j,));
				}
			}
		}
		
	}
}
