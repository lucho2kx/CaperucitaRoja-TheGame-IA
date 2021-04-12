package frsf.cidisi.exercise.caperucitaroja.search.actions;

import frsf.cidisi.exercise.caperucitaroja.search.*;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;
import frsf.cidisi.faia.state.AgentState;
import frsf.cidisi.faia.state.EnvironmentState;

public class TomarDulcesIrOeste extends SearchAction {

  /**
   * This method updates a tree node state when the search process is running. It
   * does not updates the real world state.
   */
  @Override
  public SearchBasedAgentState execute(SearchBasedAgentState s) {
    EstadoCaperucitaRoja agState = (EstadoCaperucitaRoja) s;

    // TODO: Use this conditions
    // PreConditions: (hayDulces && !estaLoboFeroz && !hayArboles)
    // PostConditions: cantidadDulcesObtenidos= cantidadDulcesObtenidos
    // +cantidadDulcesLineaVista; nuevaPosicionCaperucitaRoja

    return null;
  }

  /**
   * This method updates the agent state and the real world state.
   */
  @Override
  public EnvironmentState execute(AgentState ast, EnvironmentState est) {
    EstadoAmbiente estadoAmbiente = (EstadoAmbiente) est;
    EstadoCaperucitaRoja estadoCaperucitaRoja = ((EstadoCaperucitaRoja) ast);

    int[] posicionCaperucitaRoja = estadoCaperucitaRoja.getposicionCaperucitaRoja();
    int[] posicionLoboFeroz = estadoCaperucitaRoja.getposicionLoboFeroz();
    int[][] mapa = estadoCaperucitaRoja.getmapa();

    // Si no hay �rbol en la celda superior
    if (mapa[posicionCaperucitaRoja[0] - 1][posicionCaperucitaRoja[1]] != 3) {
      Boolean estaLoboFeroz = false;
      Boolean hayDulces = false;
      int i = posicionCaperucitaRoja[0] - 1;
      while ((i >= 0) && (mapa[i][posicionCaperucitaRoja[1]] != 3)) {
        if ((posicionCaperucitaRoja[1] == posicionLoboFeroz[1]) && (i == posicionLoboFeroz[0])) {
          // Lobo Feroz se encuentra en la direcci�n norte
          estaLoboFeroz = true;
        }
        if (mapa[i][posicionCaperucitaRoja[1]] == 1) {
          mapa[i][posicionCaperucitaRoja[1]] = 2;
          int mapaAmbiente[][] = estadoAmbiente.getmapa();
          mapaAmbiente[i][posicionCaperucitaRoja[1]] = 0;
          estadoAmbiente.setmapa(mapaAmbiente);
          estadoAmbiente.setcantidadDulcesMapa(estadoAmbiente.getcantidadDulcesMapa() - 1);
          estadoCaperucitaRoja.setcantidadDulcesObtenidos(estadoCaperucitaRoja.getcantidadDulcesObtenidos() + 1);
        }
        i--;
      }
      // Si no est� el Lobo Feroz y no hay dulces en la direcci�n del norte
      // entonces se puede avanzar al norte
      if (!estaLoboFeroz && !hayDulces) {
        // Caperucita Roja avanza hasta la celda vac�a anterior a �rbol
        posicionCaperucitaRoja[0] = i;
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
   * This method is not important for a search based agent, but is essensial when
   * creating a calculus based one.
   */
  @Override
  public String toString() {
    return "TomarDulcesIrOeste";
  }
}