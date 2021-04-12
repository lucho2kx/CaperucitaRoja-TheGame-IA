package frsf.cidisi.exercise.caperucitaroja.search;

import frsf.cidisi.faia.exceptions.PrologConnectorException;
import frsf.cidisi.faia.simulator.SearchBasedAgentSimulator;

public class CaperucitaRojaMain {

  public static void main(String[] args) throws PrologConnectorException {
    CaperucitaRoja agent = new CaperucitaRoja();

    AmbienteCaperucitaRoja environment = new AmbienteCaperucitaRoja();

    SearchBasedAgentSimulator simulator = new SearchBasedAgentSimulator(environment, agent);

    simulator.start();
  }

}
