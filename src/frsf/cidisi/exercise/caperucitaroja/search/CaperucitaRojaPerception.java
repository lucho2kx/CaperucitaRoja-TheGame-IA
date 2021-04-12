package frsf.cidisi.exercise.caperucitaroja.search;

import frsf.cidisi.faia.agent.Agent;
import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.environment.Environment;

public class CaperucitaRojaPerception extends Perception {

  // TODO: Setup Statics
  public static int UNKNOWN_PERCEPTION = -1;
  // Valores que se pueden asignar en la celda del mapa
  public static String NORTE = "norte";
  public static String SUR = "sur";
  public static String ESTE = "este";
  public static String OESTE = "oeste";
  public static int VACIA_PERCEPTION = 0;
  public static int DULCES_PERCEPTION = 1;
  public static int LOBO_FEROZ_PERCEPTION = 2;
  public static int ARBOL_PERCEPTION = 3;
  public static int FLORES_PERCEPTION = 4;

  // TODO: Setup Sensors
  // Lista de celda que percibe hacia un punto cardinal
  private int[] norte, sur, este, oeste;
  // Cantidad de vida de Caperucita Roja
  private int vidasCaperucitaRoja;
  // Posici�n de Caperucita Roja en el Mapa(i, j)
  private int[] posicionCaperucitaRoja;
  // Posici�n de Lobo Feroz en el Mapa(i, j)
  private int[] posicionLoboFeroz;

  public CaperucitaRojaPerception() {
    // TODO: Complete Method
    vidasCaperucitaRoja = UNKNOWN_PERCEPTION;
    posicionCaperucitaRoja = new int[1];
    posicionLoboFeroz = new int[1];
    norte = null;
    sur = null;
    este = null;
    oeste = null;
  }

  public CaperucitaRojaPerception(Agent agent, Environment environment) {
    super(agent, environment);
  }

  /**
   * This method is used to setup the perception.
   */
  @Override
  public void initPerception(Agent agentIn, Environment environmentIn) {

    // TODO: Complete Method

    // CaperucitaRoja agent = (CaperucitaRoja) agentIn;
    // AmbienteCaperucitaRoja environment = (AmbienteCaperucitaRoja) environmentIn;
    // EstadoAmbiente environmentState =
    // environment.getEnvironmentState();
    // Se obtiene el Agente Caperucita Roja
    // CaperucitaRoja caperucitaRoja = (CaperucitaRoja) agentIn;

    // Se obtiene el Ambiente de Caperucita Roja
    AmbienteCaperucitaRoja ambienteCaperucitaRoja = (AmbienteCaperucitaRoja) environmentIn;
    // Se obtiene el Estado del Ambiente de Caperucita Roja
    EstadoAmbiente estadoAmbiente = ambienteCaperucitaRoja.getEnvironmentState();
    // Se obtiene la posici�n de Caperucita Roja
    posicionCaperucitaRoja = estadoAmbiente.getPosicionCaperucitaRoja();
    // Se obtiene la posici�n de Lobo Feroz
    posicionLoboFeroz = estadoAmbiente.getposicionLoboFeroz();
    // Se obtine la cantidad de vidas de Caperucita Roja
    vidasCaperucitaRoja = estadoAmbiente.getvidasCaperucitaRoja();
    // Se obtienen las l�neas de vistas en todos los puntos cardinales
    norte = estadoAmbiente.getPuntoCardinal(NORTE);
    sur = estadoAmbiente.getPuntoCardinal(SUR);
    este = estadoAmbiente.getPuntoCardinal(ESTE);
    oeste = estadoAmbiente.getPuntoCardinal(OESTE);

  }

  @Override
  public String toString() {
    // TODO: Complete Method

    String str = "";
    str = str + "Percepci�n:\n";
    str = str + "Posici�n de Caperucita Roja: (" + posicionCaperucitaRoja[0] + ", " + posicionCaperucitaRoja[1] + "\n";
    str = str + "Cantidad de vidas de Caperucita Roja = " + vidasCaperucitaRoja + "\n";
    str = str + "norte = " + this.getStringDireccion(norte) + "\n";
    str = str + "sur   = " + this.getStringDireccion(sur) + "\n";
    str = str + "este  = " + this.getStringDireccion(este) + "\n";
    str = str + "oeste = " + this.getStringDireccion(oeste) + "\n";

    return str;
  }

  // The following methods are agent-specific:
  // TODO: Complete this section with the agent-specific methods

  private String getStringDireccion(int[] direccion) {
    String str = "[";
    int tam = direccion.length;
    for (int i = 0; i < tam; i++) {
      if (i == (tam - 1)) {
        str = str + direccion[i];
      } else {
        str = str + direccion[i] + " ";
      }
    }
    str = str + "]";
    return str;
  }

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

  public int getvidascaperucitaroja() {
    return vidasCaperucitaRoja;
  }

  public void setvidascaperucitaroja(int arg) {
    this.vidasCaperucitaRoja = arg;
  }

  public int[] getposicioncaperucitaroja() {
    return posicionCaperucitaRoja;
  }

  public void setposicioncaperucitaroja(int[] arg) {
    this.posicionCaperucitaRoja = arg;
  }

  public int[] getPosicionLoboFeroz() {
    return posicionLoboFeroz;
  }

  public void setPosicionLoboFeroz(int[] posicionLoboFeroz) {
    this.posicionLoboFeroz = posicionLoboFeroz;
  }

}
