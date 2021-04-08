package frsf.cidisi.exercise.caperucitaroja.domain;

import java.util.ArrayList;


public class Mapa {
	
	private int[][] mapa= new int[9][14];

	public Mapa() {
		super();
	}
	
	public Mapa(int[][] mapa) {
		super();
		this.mapa = mapa;
	}

	public void makeMapa1() {
    	// Representación de la celda en el mapa:
    	// 		0 = Vacía
    	// 		1 = Dulces
    	// 		2 = Lobo Feroz
    	// 		3 = Árbol
    	// 		4 = Flores

    	// Se contruye el mapa
    	for (int i= 0; i < 9; i++) {
    		// Fila 0
    		if (i == 0) {
        		for (int j= 0; j < 14; j++) {
        			mapa[i][j]= 3;
        		}
    		}
    		// Fila 1
    		if (i == 1) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][7]= 3;
    			mapa[i][11]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Dulces
    			mapa[i][3]= 1;
    			mapa[i][10]= 1;
    			
    			// Vacía
    			mapa[i][4]= 0;
    			mapa[i][5]= 0;
    			mapa[i][6]= 0;
    			mapa[i][8]= 0;
    			mapa[i][9]= 0;
    		}
    		// Fila 2
    		if (i == 2) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][4]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Vacía
    			mapa[i][3]= 0;
    			mapa[i][5]= 0;
    			mapa[i][6]= 0;
    			mapa[i][7]= 0;
    			mapa[i][8]= 0;
    			mapa[i][9]= 0;
    			mapa[i][10]= 0;
    			mapa[i][11]= 0;
    			
    		}
    		// Fila 3
    		if (i == 3) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][9]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Dulces
    			mapa[i][8]= 1;
    			
    			// Vacía
    			mapa[i][3]= 0;
    			mapa[i][4]= 0;
    			mapa[i][5]= 0;
    			mapa[i][6]= 0;
    			mapa[i][7]= 0;
    			
    		}
    		// Fila 4
    		if (i == 4) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][3]= 3;
    			mapa[i][4]= 3;
    			mapa[i][8]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Vacía
    			mapa[i][5]= 0;
    			mapa[i][6]= 0;
    			mapa[i][7]= 0;
    			mapa[i][9]= 0;
    			mapa[i][10]= 0;
    			mapa[i][11]= 0;
    			
    		}
    		// Fila 5
    		if (i == 5) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][4]= 3;
    			mapa[i][5]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Vacía
    			mapa[i][3]= 0;
    			mapa[i][6]= 0;
    			mapa[i][7]= 0;
    			mapa[i][8]= 0;
    			mapa[i][9]= 0;
    			mapa[i][10]= 0;
    			mapa[i][11]= 0;
    		}

    		// Fila 6
    		if (i == 6) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][5]= 3;
    			mapa[i][6]= 3;
    			mapa[i][7]= 3;
    			mapa[i][9]= 3;
    			mapa[i][11]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Vacía
    			mapa[i][3]= 0;
    			mapa[i][4]= 0;
    			mapa[i][8]= 0;
    			mapa[i][10]= 0;
    		}
    		// Fila 7
    		if (i == 7) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][6]= 3;
    			mapa[i][11]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Vacía
    			mapa[i][3]= 0;
    			mapa[i][4]= 0;
    			mapa[i][5]= 0;
    			mapa[i][8]= 0;
    			mapa[i][9]= 0;
    			mapa[i][10]= 0;
    			
    			// Campo de Flores
    			mapa[i][7]= 4;
    		}
    		// Fila 8
    		if (i == 8) {
        		for (int j=0; j < 14; j++) {
        			// Árboles
        			mapa[i][j]= 3;
        		}
        		// Campo de Flores
        		mapa[i][7]= 4;
    		}
    	}
    }
	
	public void makeMapa2() {
    	// Representación de la celda en el mapa:
    	// 		0 = Vacía
    	// 		1 = Dulces
    	// 		2 = Lobo Feroz
    	// 		3 = Árbol
    	// 		4 = Flores

    	// Se contruye el mapa
    	for (int i= 0; i < 9; i++) {
    		// Fila 0
    		if (i == 0) {
        		for (int j= 0; j < 14; j++) {
        			mapa[i][j]= 3;
        		}
    		}
    		// Fila 1
    		if (i == 1) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][3]= 3;
    			mapa[i][4]= 3;
    			mapa[i][7]= 3;
    			mapa[i][8]= 3;
    			mapa[i][9]= 3;
    			mapa[i][10]= 3;
    			mapa[i][11]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Dulces
    			mapa[i][5]= 1;
    			
    			// Vacía
    			mapa[i][6]= 0;
    			
    		}
    		// Fila 2
    		if (i == 2) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][3]= 3;
    			mapa[i][7]= 3;
    			mapa[i][8]= 3;
    			mapa[i][10]= 3;
    			mapa[i][11]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Vacía
    			mapa[i][4]= 0;
    			mapa[i][5]= 0;
    			mapa[i][6]= 0;
    			mapa[i][9]= 0;
    			
    		}
    		// Fila 3
    		if (i == 3) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][3]= 3;
    			mapa[i][4]= 3;
    			mapa[i][11]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Dulces
    			mapa[i][8]= 1;
    			
    			// Vacía
    			mapa[i][5]= 0;
    			mapa[i][6]= 0;
    			mapa[i][7]= 0;
    			mapa[i][9]= 0;
    			mapa[i][10]= 0;
    		}
    		// Fila 4
    		if (i == 4) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][4]= 3;
    			mapa[i][5]= 3;
    			mapa[i][7]= 3;
    			mapa[i][9]= 3;
    			mapa[i][11]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Dulces
    			mapa[i][10]= 1;

    			// Vacía
    			mapa[i][3]= 0;
    			mapa[i][6]= 0;
    			mapa[i][8]= 0;
    			
    		}
    		// Fila 5
    		if (i == 5) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][5]= 3;
    			mapa[i][7]= 3;
    			mapa[i][9]= 3;
    			mapa[i][11]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Vacía
    			mapa[i][3]= 0;
    			mapa[i][4]= 0;
    			mapa[i][6]= 0;
    			mapa[i][8]= 0;
    			mapa[i][10]= 0;
    			
    		}

    		// Fila 6
    		if (i == 6) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][9]= 3;
    			mapa[i][11]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Vacía
    			mapa[i][3]= 0;
    			mapa[i][4]= 0;
    			mapa[i][5]= 0;
    			mapa[i][6]= 0;
    			mapa[i][7]= 0;
    			mapa[i][8]= 0;
    			mapa[i][10]= 0;
    		}
    		// Fila 7
    		if (i == 7) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][3]= 3;
    			mapa[i][4]= 3;
    			mapa[i][5]= 3;
    			mapa[i][7]= 3;
    			mapa[i][11]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Vacía
    			mapa[i][8]= 0;
    			mapa[i][9]= 0;
    			mapa[i][10]= 0;
    			
    			// Campo de Flores
    			mapa[i][6]= 4;
    		}
    		// Fila 8
    		if (i == 8) {
        		for (int j=0; j < 14; j++) {
        			// Árboles
        			mapa[i][j]= 3;
        		}
        		// Campo de Flores
        		mapa[i][6]= 4;
    		}


    	}
    }
		
	public void makeMapa3() {
    	// Representación de la celda en el mapa:
    	// 		0 = Vacía
    	// 		1 = Dulces
    	// 		2 = Lobo Feroz
    	// 		3 = Árbol
    	// 		4 = Flores

    	// Se contruye el mapa
    	for (int i= 0; i < 9; i++) {
    		// Fila 0
    		if (i == 0) {
        		for (int j= 0; j < 14; j++) {
        			mapa[i][j]= 3;
        		}
        		
        		// Campo de Flores
        		mapa[i][3]= 4;
    		}
    		// Fila 1
    		if (i == 1) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][4]= 3;
    			mapa[i][8]= 3;
    			mapa[i][9]= 3;
    			mapa[i][10]= 3;
    			mapa[i][11]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;

        		// Campo de Flores
        		mapa[i][3]= 4;
    			
    			// Vacía
    			mapa[i][5]= 0;
    			mapa[i][6]= 0;
    			mapa[i][7]= 0;
    			
    		}
    		// Fila 2
    		if (i == 2) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][4]= 3;
    			mapa[i][6]= 3;
    			mapa[i][8]= 3;
    			mapa[i][9]= 3;
    			mapa[i][10]= 3;
    			mapa[i][11]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Vacía
    			mapa[i][3]= 0;
    			mapa[i][5]= 0;
    			
    			// Dulces
    			mapa[i][7]= 1;
    			
    		}
    		// Fila 3
    		if (i == 3) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][9]= 3;
    			mapa[i][11]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Vacía
    			mapa[i][3]= 0;
    			mapa[i][4]= 0;
    			mapa[i][5]= 0;
    			mapa[i][6]= 0;
    			mapa[i][7]= 0;
    			mapa[i][8]= 0;
    			
    		}
    		// Fila 4
    		if (i == 4) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][3]= 3;
    			mapa[i][4]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Vacía
    			mapa[i][5]= 0;
    			mapa[i][6]= 0;
    			mapa[i][7]= 0;
    			mapa[i][8]= 0;
    			mapa[i][9]= 0;
    			mapa[i][10]= 0;
    			mapa[i][11]= 0;
    			
    		}
    		// Fila 5
    		if (i == 5) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][7]= 3;
    			mapa[i][9]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Vacía
    			mapa[i][3]= 0;
    			mapa[i][4]= 0;
    			mapa[i][5]= 0;
    			mapa[i][6]= 0;
    			mapa[i][8]= 0;
    			mapa[i][10]= 0;
    			mapa[i][11]= 0;
    		}

    		// Fila 6
    		if (i == 6) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][7]= 3;
    			mapa[i][10]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Vacía
    			mapa[i][3]= 0;
    			mapa[i][5]= 0;
    			mapa[i][6]= 0;
    			mapa[i][9]= 0;
    			mapa[i][11]= 0;
    			
    			// Dulces
    			mapa[i][4]= 1;
    			mapa[i][8]= 1;
    			    			
    		}
    		// Fila 7
    		if (i == 7) {
    			// Árboles
    			mapa[i][0]= 3;
    			mapa[i][1]= 3;
    			mapa[i][2]= 3;
    			mapa[i][3]= 3;
    			mapa[i][4]= 3;
    			mapa[i][5]= 3;
    			mapa[i][9]= 3;
    			mapa[i][10]= 3;
    			mapa[i][11]= 3;
    			mapa[i][12]= 3;
    			mapa[i][13]= 3;
    			
    			// Vacía
    			mapa[i][6]= 0;
    			mapa[i][7]= 0;
    			mapa[i][8]= 0;
    			
    		}
    		// Fila 8
    		if (i == 8) {
        		for (int j=0; j < 14; j++) {
        			// Árboles
        			mapa[i][j]= 3;
        		}
    		}


    	}
    }

	
	public int[][] getMapa() {
		return mapa;
	}
	
	public void setMapa(int[][] mapa) {
		this.mapa = mapa;
	}

	public int[] getPuntoCardinal(String orientacion, int[] posicionCaperucitaRoja) {
		ArrayList<Integer> direc= new ArrayList<Integer>();
		int i,j;
		if ("norte".equals(orientacion)) {
			// Se obtiene la primera posición de la celda
			// superior de Caperucita Roja en el mapa
			i= posicionCaperucitaRoja[0]-1;
			while (mapa[i][posicionCaperucitaRoja[1]] != 3) {
				direc.add(mapa[i][posicionCaperucitaRoja[1]]);
				i= i-1;
			}
			// Se agrega el último árbol que en el while no lo hace
			direc.add(mapa[i][posicionCaperucitaRoja[1]]);
		}
		if ("sur".equals(orientacion)) {
			// Se obtiene la primera posición de la celda
			// inferior de Caperucita Roja en el mapa
			i= posicionCaperucitaRoja[0]+1;
			while (mapa[i][posicionCaperucitaRoja[1]] != 3) {
				direc.add(mapa[i][posicionCaperucitaRoja[1]]);
				i= i+1;
			}
			// Se agrega el último árbol que en el while no lo hace
			direc.add(mapa[i][posicionCaperucitaRoja[1]]);
		}
		if ("este".equals(orientacion)) {
			// Se obtiene la primera posición de la celda
			// derecha de Caperucita Roja en el mapa
			j= posicionCaperucitaRoja[1]+1;
			while (mapa[posicionCaperucitaRoja[0]][j] != 3) {
				direc.add(mapa[posicionCaperucitaRoja[0]][j]);
				j= j+1;
			}
			// Se agrega el último árbol que en el while no lo hace
			direc.add(mapa[posicionCaperucitaRoja[0]][j]);
		}
		if ("oeste".equals(orientacion)) {
			// Se obtiene la primera posición de la celda
			// izquierda de Caperucita Roja en el mapa
			j= posicionCaperucitaRoja[1]-1;
			while (mapa[posicionCaperucitaRoja[0]][j] != 3) {
				direc.add(mapa[posicionCaperucitaRoja[0]][j]);
				j= j-1;
			}
			// Se agrega el último árbol que en el while no lo hace
			direc.add(mapa[posicionCaperucitaRoja[0]][j]);
			
		}
		return convertIntegers(direc);
	}

	private int[] convertIntegers(ArrayList<Integer> integers) {
	    int[] ret= new int[integers.size()];
	    for (int i=0; i < ret.length; i++) {
	        ret[i]= integers.get(i).intValue();
	    }
	    return ret;
	}

	@Override
	public String toString() {
		String str= new String();
		for(int i= 0; i < 9; i++) {
			str= str+"|";
			for(int j= 0; j < 14; j++) {
				if (j == 13) {
					str= str + mapa[i][j];
				}
				else {
					str= str + mapa[i][j] + " ";
				}
		    }
            System.out.println("|");
        }
		
		return str;
	}
	
	public Mapa clone() {
		Mapa map= new Mapa();
		map.setMapa(mapa);
		
		return map;
	}
		
}
