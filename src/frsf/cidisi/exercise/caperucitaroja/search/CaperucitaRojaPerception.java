package frsf.cidisi.exercise.caperucitaroja.search;

import frsf.cidisi.faia.agent.Agent;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;

public class CaperucitaRojaPerception extends Perception {

	//TODO: Setup Statics
    //public static int UNKNOWN_PERCEPTION = -1;   
	
	//TODO: Setup Sensors
//	private Other norte, sur, este, oeste;
	private int[] norte, sur, este, oeste;
	private int vidascaperucitaroja;
	private int[] posicioncaperucitaroja;
	
    public  CaperucitaRojaPerception() {
    	//TODO: Complete Method
    }

    public CaperucitaRojaPerception(Agent agent, Environment environment) {
        super(agent, environment);
    }

    /**
     * This method is used to setup the perception.
     */
    @Override
    public void initPerception(Agent agentIn, Environment environmentIn) {
    	
    	//TODO: Complete Method
        
        //CaperucitaRoja agent = (CaperucitaRoja) agentIn;
        //AmbienteCaperucitaRoja environment = (AmbienteCaperucitaRoja) environmentIn;
        //EstadoAmbiente environmentState =
        //        environment.getEnvironmentState();
       
        
    }
    
    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();

        //TODO: Complete Method

        return str.toString();
    }

    // The following methods are agent-specific:
    //TODO: Complete this section with the agent-specific methods
	
    
    public int[] getNorte() {
		return norte;
	}

	public void setNorte(int[] norte) {
		this.norte = norte;
	}

	public int[] getSur() {
		return sur;
	}

	public void setSur(int[] sur) {
		this.sur = sur;
	}

	public int[] getEste() {
		return este;
	}

	public void setEste(int[] este) {
		this.este = este;
	}

	public int[] getOeste() {
		return oeste;
	}

	public void setOeste(int[] oeste) {
		this.oeste = oeste;
	}

    
    public int getvidascaperucitaroja(){
        return vidascaperucitaroja;
    }
    
	public void setvidascaperucitaroja(int arg){
        this.vidascaperucitaroja = arg;
    }
     
	public int[] getposicioncaperucitaroja(){
        return posicioncaperucitaroja;
    }

    public void setposicioncaperucitaroja(int[] arg){
        this.posicioncaperucitaroja = arg;
    }
    
}
