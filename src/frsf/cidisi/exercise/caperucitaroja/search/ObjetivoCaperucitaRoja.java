

package frsf.cidisi.exercise.caperucitaroja.search;

import frsf.cidisi.faia.agent.search.GoalTest;
import frsf.cidisi.faia.state.AgentState;

public class ObjetivoCaperucitaRoja extends GoalTest {

    @Override
    public boolean isGoalState (AgentState agentState) {
    
    	// TODO: Complete Method
        if  (true) //( (posicionCaperucitaRoja = posicionCampoFlores) && (vidasCaperucitaRoja > 0))
        	{
            return true;
        	}
        return false;
	}
}