package frsf.cidisi.exercise.caperucitaroja.search;

import frsf.cidisi.exercise.caperucitaroja.domain.Mapa;
import frsf.cidisi.faia.state.EnvironmentState;

/**
 * This class represents the real world state.
 */
public class EstadoAmbiente extends EnvironmentState {
	
	//TODO: Setup Variables
    private int[] posicionLoboFeroz;
    //private Other posicionArboles;
    private Mapa mapa;
    //private int[][] mapa;
    private int cantidadDulcesMapa;
    //private int posicionCampoFlores;
    private int[] posicionCaperucitaRoja;
    private int vidasCaperucitaRoja;
	
    public EstadoAmbiente() {
        
        //TODO: Complete Method
    	/*
			// posicionLoboFeroz = initData0;
			// posicionArboles = initData1;
			// mapa = initData2;
			// cantidadDulcesMapa = initData3;
			// posicionCampoFlores = initData4;
			// posicionCaperucitaRoja = initData5;
			// vidasCaperucitaRoja = initData6;
        */
        this.initState();
    }

    /**
     * This method is used to setup the initial real world.
     */
    @Override
    public void initState() {

    	//TODO: Complete Method
    	mapa= new Mapa();
    	// Se crea el mapa del escenario 1  
    	mapa.makeMapa1();
    	// Posición inicial de Caperucita Roja en el mapa
    	posicionCaperucitaRoja= new int[1];
    	posicionCaperucitaRoja[0]= 5;
    	posicionCaperucitaRoja[1]= 11;
    	// Posición inicial de Lobo Feroz en el mapa
    	posicionLoboFeroz= new int[1];
    	posicionLoboFeroz[0]= 6;
    	posicionLoboFeroz[1]= 4;
    	// Cantidad de vidas de Caperucita Roja inicialmente
    	vidasCaperucitaRoja= 3;
    	
    }

    /**
     * String representation of the real world state.
     */
    @Override
    public String toString() {
        String str = "";
        str= str + "Escenario:\n";
        str= str + mapa.toString()+"\n";
        str= str + "Posición de Caperucita Roja: ("+ posicionCaperucitaRoja[0] +", "+ posicionCaperucitaRoja[1] +"\n";
        str= str + "Posición del Lobo Feroz: ("+ posicionLoboFeroz[0] +", "+ posicionLoboFeroz[1] +"\n";
        str= str + "Cantidad de vidas de Caperucita Roja = "+ vidasCaperucitaRoja +"\n";
        
        //TODO: Complete Method

        return str;
    }

	//TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
    
	public int[] getposicionLoboFeroz(){
		return posicionLoboFeroz;
	}
	
	public void setposicionLoboFeroz(int[] arg){
		posicionLoboFeroz = arg;
	}
	
//     public Other getposicionArboles(){
//        return posicionArboles;
//     }
//     public void setposicionArboles(Other arg){
//        posicionArboles = arg;
//     }
	
	public int[] getPuntoCardinal(String orientacion) {
		return mapa.getPuntoCardinal(orientacion, posicionCaperucitaRoja);
	}
	
	public int[][] getmapa(){
		return mapa.getMapa();
	}
	
	public void setmapa(int[][] arg){
		mapa = new Mapa(arg);
	}
   
	public int getcantidadDulcesMapa(){
        return cantidadDulcesMapa;
	}
	
	public void setcantidadDulcesMapa(int arg){
		cantidadDulcesMapa = arg;
	}
    
	public int[] getPosicionCaperucitaRoja() {
		return posicionCaperucitaRoja;
	}

	public void setPosicionCaperucitaRoja(int[] posicionCaperucitaRoja) {
		this.posicionCaperucitaRoja = posicionCaperucitaRoja;
	}

	public int getvidasCaperucitaRoja(){
		return vidasCaperucitaRoja;
	}
    
	public void setvidasCaperucitaRoja(int arg){
        vidasCaperucitaRoja = arg;
	}
	
}