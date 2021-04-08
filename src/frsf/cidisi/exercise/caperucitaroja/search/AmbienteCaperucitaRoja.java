package frsf.cidisi.exercise.caperucitaroja.search;

import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.environment.Environment;

public class AmbienteCaperucitaRoja extends Environment {

    public AmbienteCaperucitaRoja() {
        // Create the environment state
        this.environmentState = new EstadoAmbiente();
    }

    public EstadoAmbiente getEnvironmentState() {
        return (EstadoAmbiente) super.getEnvironmentState();
    }

    /**
     * This method is called by the simulator. Given the Agent, it creates
     * a new perception reading, for example, the agent position.
     * @param agent
     * @return A perception that will be given to the agent by the simulator.
     */
    @Override
    public  CaperucitaRojaPerception getPercept() {
    	// Create a new perception to return
    	CaperucitaRojaPerception perception = new CaperucitaRojaPerception();
		
		//TODO : Set the perceptions sensors
    	int[] posicionCaperucitaRoja= this.getEnvironmentState().getPosicionCaperucitaRoja();
    	//int[] posicionLoboFeroz= this.getEnvironmentState().getposicionLoboFeroz();
    	int[] norte= this.getEnvironmentState().getPuntoCardinal("norte");
    	int[] sur= this.getEnvironmentState().getPuntoCardinal("sur");
    	int[] este= this.getEnvironmentState().getPuntoCardinal("este");
    	int[] oeste= this.getEnvironmentState().getPuntoCardinal("oeste");
    	int cantVidas= this.getEnvironmentState().getvidasCaperucitaRoja();
	     
    	// Se asigna las percepciones, obtenidas del ambiente   
    	perception.setposicioncaperucitaroja(posicionCaperucitaRoja);
    	perception.setvidascaperucitaroja(cantVidas);
    	perception.setNorte(norte);
    	perception.setSur(sur);
    	perception.setEste(este);
    	perception.setOeste(oeste);
	     
	    // Return the perception
	    return perception;
    }

    
    public String toString() {
        return environmentState.toString();
    }

    // Este método indica bajo qué condición se considera que el agente ha fallado
    public boolean agentFailed(Action actionReturned) {
    	Boolean failed= false;
    	
        EstadoAmbiente estadoAmbiente =
                this.getEnvironmentState();

        // TODO: Complete Method        
        // 3 posibilidades inmediatas:
        // 1- Agregar el estado del ambiente el atributo que nos indica falla(energía)
        // 2- Agregar un operador que se denomine "apagar" (que vendrá en "actionReturned")
        // 3- Modificar GoalBasedAgentSimulator para que pase el AgentState en lugar de Action
        
        int cantVidasCaperucitaRoja= estadoAmbiente.getvidasCaperucitaRoja();
        if (cantVidasCaperucitaRoja <= 0) {
        	failed= true;
        }
        
        return failed;
    }

	//TODO: Complete this section with agent-specific methods
    // The following methods are agent-specific:
    
    
}
