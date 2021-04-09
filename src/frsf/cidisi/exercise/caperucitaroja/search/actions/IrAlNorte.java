package frsf.cidisi.exercise.caperucitaroja.search.actions;

import frsf.cidisi.exercise.caperucitaroja.search.*;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

public class IrAlNorte extends SearchAction {

    /**
     * This method updates a tree node state when the search process is running.
     * It does not updates the real world state.
     */
    @Override
    public SearchBasedAgentState execute(SearchBasedAgentState s) {
        EstadoCaperucitaRoja estadoCaperucitaRoja = (EstadoCaperucitaRoja) s;
        
        // TODO: Use this conditions
        // PreConditions: !Hay�rbol(i,j-1) && !estaLoboFeroz(i,j) && !hayDulces()
        // PostConditions: Posici�nCaperucitaRoja(arbolImpactado.i+1, j);
        
        
        return null;
    }

    /**
     * This method updates the agent state and the real world state.
     */
    @Override
    public EnvironmentState execute(AgentState ast, EnvironmentState est) {
        EstadoAmbiente estadoAmbiente = (EstadoAmbiente) est;
        EstadoCaperucitaRoja estadoCaperucitaRoja = ((EstadoCaperucitaRoja) ast);

        // TODO: Use this conditions
        // PreConditions: !Hay�rbol(i-1,j) && !estaLoboFeroz(i-1,j) && !hayDulces()
        // PostConditions: Posici�nCaperucitaRoja(arbolImpactado.i+1, j);
        
        int[] posicionCaperucitaRoja= estadoCaperucitaRoja.getposicionCaperucitaRoja();
        int[] posicionLoboFeroz= estadoCaperucitaRoja.getposicionLoboFeroz();
        int[][] mapa= estadoCaperucitaRoja.getmapa();
        
        // Si no hay �rbol en la celda superior
        if (mapa[posicionCaperucitaRoja[0]][posicionCaperucitaRoja[1]-1] != 3) {
        	Boolean estaLoboFeroz= false;
        	Boolean hayDulces= false;
        	int j= posicionCaperucitaRoja[1]-1;
        	while ((j >= 0) && (mapa[posicionCaperucitaRoja[0]][j] != 3)) {
        		if ((posicionCaperucitaRoja[0] == posicionLoboFeroz[0])
        				&& (j == posicionLoboFeroz[1])) {
        			// Lobo Feroz se encuentra en la direcci�n norte
        			estaLoboFeroz= true;
        		}
        		if (mapa[posicionCaperucitaRoja[0]][j] == 1) {
        			// Hay dulces en la direcci�n norte
        			hayDulces= true;
        		}
        		j--;
        	}
        	// Si no est� el Lobo Feroz y no hay dulces en la direcci�n del norte
        	// entonces se puede avanzar al norte 
        	if (!estaLoboFeroz && !hayDulces) {
        		// Caperucita Roja avanza hasta la celda vac�a anterior a �rbol
        		posicionCaperucitaRoja[1]= j;
        	}
        	
        	if (!estaLoboFeroz && !hayDulces) {
                // Update the real world
            	estadoAmbiente.setPosicionCaperucitaRoja(posicionCaperucitaRoja);
                
                // Update the agent state
                estadoCaperucitaRoja.setposicionCaperucitaRoja(posicionCaperucitaRoja);
                
            }
        }
       
        return estadoAmbiente;
    }

    /**
     * This method returns the action cost.
     */
    @Override
    public Double getCost() {
        return new Double(0);
    }

    /**
     * This method is not important for a search based agent, but is essensial
     * when creating a calculus based one.
     */
    @Override
    public String toString() {
        return "IrAlNorte";
    }
    
    private Boolean hayArbol(int[][] mapa, int[] posicionCaperucitaRoja) {
    	Boolean b= false;
    	
    	
    	
    	return b; 
    }
    
    
}