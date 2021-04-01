package frsf.cidisi.exercise.caperucitaroja.search;

import frsf.cidisi.faia.state.EnvironmentState;

/**
 * This class represents the real world state.
 */
public class EstadoAmbiente extends EnvironmentState {
	
	//TODO: Setup Variables
    private int[] posicionLoboFeroz;
    //private Other posicionArboles;
    private int[][] mapa;
    private int cantidadDulcesMapa;
    private int posicionCampoFlores;
    private int posicionCaperucitaRoja;
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
    }

    /**
     * String representation of the real world state.
     */
    @Override
    public String toString() {
        String str = "";

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
     public int[][] getmapa(){
        return mapa;
     }
     public void setmapa(int[][] arg){
        mapa = arg;
     }
     public int getcantidadDulcesMapa(){
        return cantidadDulcesMapa;
     }
     public void setcantidadDulcesMapa(int arg){
        cantidadDulcesMapa = arg;
     }
     public int getposicionCampoFlores(){
        return posicionCampoFlores;
     }
     public void setposicionCampoFlores(int arg){
        posicionCampoFlores = arg;
     }
     public int getposicionCaperucitaRoja(){
        return posicionCaperucitaRoja;
     }
     public void setposicionCaperucitaRoja(int arg){
        posicionCaperucitaRoja = arg;
     }
     public int getvidasCaperucitaRoja(){
        return vidasCaperucitaRoja;
     }
     public void setvidasCaperucitaRoja(int arg){
        vidasCaperucitaRoja = arg;
     }
	
}