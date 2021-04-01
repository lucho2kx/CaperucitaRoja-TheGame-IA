package frsf.cidisi.exercise.caperucitaroja.search;

import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;

/**
 * Represent the internal state of the Agent.
 */
public class EstadoCaperucitaRoja extends SearchBasedAgentState {
	
	//TODO: Setup Variables
    private int[] posicionCaperucitaRoja;
    private int[] posicionLoboFeroz;
    //private Other posicionDulces;
    //private Other posicionCampoFlores;
    //private Other posicionArboles;
    private int[][] mapa;
    private int vidasCaperucitaRoja;
    private int cantidadDulcesObtenidos;
	

    public EstadoCaperucitaRoja() {
    
    	//TODO: Complete Method
    	/*
			// posicionCaperucitaRoja = initData0;
			// posicionLoboFeroz = initData1;
			// posicionDulces = initData2;
			// posicionCampoFlores = initData3;
			// posicionArboles = initData4;
			// mapa = initData5;
			// vidasCaperucitaRoja = initData6;
			// cantidadDulcesObtenidos = initData7;
        */
        this.initState();
    }

    /**
     * This method clones the state of the agent. It's used in the search
     * process, when creating the search tree.
     */
    @Override
    public SearchBasedAgentState clone() {
        
		//TODO: Complete Method
		
        return null;
    }

    /**
     * This method is used to update the Agent State when a Perception is
     * received by the Simulator.
     */
    @Override
    public void updateState(Perception p) {
        
        //TODO: Complete Method
    }

    /**
     * This method is optional, and sets the initial state of the agent.
     */
    @Override
    public void initState() {
        
	//TODO: Complete Method

    }

    /**
     * This method returns the String representation of the agent state.
     */
    @Override
    public String toString() {
        String str = "";

        //TODO: Complete Method

        return str;
    }

    /**
     * This method is used in the search process to verify if the node already
     * exists in the actual search.
     */
    @Override
    public boolean equals(Object obj) {
       
       //TODO: Complete Method
        
        return true;
    }

    //TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
   	
     public int[] getposicionCaperucitaRoja(){
        return posicionCaperucitaRoja;
     }
     public void setposicionCaperucitaRoja(int[] arg){
        posicionCaperucitaRoja = arg;
     }
     public int[] getposicionLoboFeroz(){
        return posicionLoboFeroz;
     }
     public void setposicionLoboFeroz(int[] arg){
        posicionLoboFeroz = arg;
     }
//     public Other getposicionDulces(){
//        return posicionDulces;
//     }
//     public void setposicionDulces(Other arg){
//        posicionDulces = arg;
//     }
//     public Other getposicionCampoFlores(){
//        return posicionCampoFlores;
//     }
//     public void setposicionCampoFlores(Other arg){
//        posicionCampoFlores = arg;
//     }
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
     public int getvidasCaperucitaRoja(){
        return vidasCaperucitaRoja;
     }
     public void setvidasCaperucitaRoja(int arg){
        vidasCaperucitaRoja = arg;
     }
     public int getcantidadDulcesObtenidos(){
        return cantidadDulcesObtenidos;
     }
     public void setcantidadDulcesObtenidos(int arg){
        cantidadDulcesObtenidos = arg;
     }
	
}