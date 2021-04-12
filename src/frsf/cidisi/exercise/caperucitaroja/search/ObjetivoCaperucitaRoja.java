package frsf.cidisi.exercise.caperucitaroja.search;

import frsf.cidisi.faia.agent.search.GoalTest;
import frsf.cidisi.faia.state.AgentState;

public class ObjetivoCaperucitaRoja extends GoalTest {

  @Override
  public boolean isGoalState(AgentState agentState) {
    // Se obtiene la posici�n de Caperucita Roja
    int[] posicionCaperucita = ((EstadoCaperucitaRoja) agentState).getposicionCaperucitaRoja();
    // Se obtiene la cantidad de vida de Caperucita Roja
    int cantVida = ((EstadoCaperucitaRoja) agentState).getvidasCaperucitaRoja();
    // Se obtiene el mapa
    int[][] mapa = ((EstadoCaperucitaRoja) agentState).getmapa();
    // Si Caperucita Roja est� ubicada en el campo de flores y tiene m�s de una vida
    // en el mapa,
    // entonces �xito.
    // 4 = celda que contiene flores
    if ((mapa[posicionCaperucita[0]][posicionCaperucita[1]] == CaperucitaRojaPerception.FLORES_PERCEPTION)
        && cantVida > 0) {
      return true;
    }
    return false;
  }
}