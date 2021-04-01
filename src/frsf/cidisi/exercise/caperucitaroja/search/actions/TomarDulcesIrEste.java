package frsf.cidisi.exercise.caperucitaroja.search.actions;

import frsf.cidisi.exercise.caperucitaroja.search.*;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

public class TomarDulcesIrEste extends SearchAction {

    /**
     * This method updates a tree node state when the search process is running.
     * It does not updates the real world state.
     */
    @Override
    public SearchBasedAgentState execute(SearchBasedAgentState s) {
        EstadoCaperucitaRoja agState = (EstadoCaperucitaRoja) s;
        
        // TODO: Use this conditions
        // PreConditions: (hayDulces && !estaLoboFeroz && !hayArboles)
        // PostConditions: cantidadDulcesObtenidos= cantidadDulcesObtenidos +cantidadDulcesLineaVista; posicionCaperucitaRoja()
        
        return null;
    }

    /**
     * This method updates the agent state and the real world state.
     */
    @Override
    public EnvironmentState execute(AgentState ast, EnvironmentState est) {
        EstadoAmbiente environmentState = (EstadoAmbiente) est;
        EstadoCaperucitaRoja agState = ((EstadoCaperucitaRoja) ast);

        // TODO: Use this conditions
        // PreConditions: (hayDulces && !estaLoboFeroz && !hayArboles)
        // PostConditions: cantidadDulcesObtenidos= cantidadDulcesObtenidos +cantidadDulcesLineaVista; posicionCaperucitaRoja()
        
        if (true) {
            // Update the real world
            
            // Update the agent state
            
            return environmentState;
        }

        return null;
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
        return "TomarDulcesIrEste";
    }
}