package frsf.cidisi.exercise.caperucitaroja.search;

import java.util.Arrays;

import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.SearchBasedAgentState;

/**
 * Represent the internal state of the Agent.
 */
public class EstadoCaperucitaRoja extends SearchBasedAgentState {

  // TODO: Setup Variables
  private int[] posicionCaperucitaRoja;
  private int[] posicionLoboFeroz;
  // private Other posicionDulces;
  // private Other posicionCampoFlores;
  // private Other posicionArboles;
  private int[][] mapa;
  private int vidasCaperucitaRoja;
  private int cantidadDulcesObtenidos;

  public EstadoCaperucitaRoja() {

    // TODO: Complete Method
    /*
     * // posicionCaperucitaRoja = initData0; // posicionLoboFeroz = initData1; //
     * posicionDulces = initData2; // posicionCampoFlores = initData3; //
     * posicionArboles = initData4; // mapa = initData5; // vidasCaperucitaRoja =
     * initData6; // cantidadDulcesObtenidos = initData7;
     */
    this.initState();
  }

  /**
   * This method clones the state of the agent. It's used in the search process,
   * when creating the search tree.
   */
  @Override
  public SearchBasedAgentState clone() {

    // TODO: Complete Method

    EstadoCaperucitaRoja nuevoEstadoCaperucitaRoja = new EstadoCaperucitaRoja();
    nuevoEstadoCaperucitaRoja.setvidasCaperucitaRoja(this.vidasCaperucitaRoja);
    nuevoEstadoCaperucitaRoja.setposicionCaperucitaRoja(this.posicionCaperucitaRoja);
    nuevoEstadoCaperucitaRoja.setcantidadDulcesObtenidos(this.cantidadDulcesObtenidos);
    nuevoEstadoCaperucitaRoja.setposicionLoboFeroz(this.posicionLoboFeroz);
    nuevoEstadoCaperucitaRoja.setmapa(this.mapa);

    return nuevoEstadoCaperucitaRoja;
  }

  /**
   * This method is used to update the Agent State when a Perception is received
   * by the Simulator.
   */
  @Override
  public void updateState(Perception p) {

    // TODO: Complete Method
    CaperucitaRojaPerception percepcion = (CaperucitaRojaPerception) p;

    // En base a lo que percibe Caperucita Roja se actualizan los datos
    int[] norte = percepcion.getNorte();
    int[] sur = percepcion.getSur();
    int[] este = percepcion.getEste();
    int[] oeste = percepcion.getOeste();
    posicionCaperucitaRoja = percepcion.getposicioncaperucitaroja();
    // int[] posicionLoboFeroz
    posicionLoboFeroz = percepcion.getPosicionLoboFeroz();

    // Se actualiza el mapa con las percepciones que se reciben
    // Norte
    for (int i = 0; i < norte.length; i++) {
      mapa[posicionCaperucitaRoja[0] - i - 1][posicionCaperucitaRoja[1]] = norte[i];
    }
    // Sur
    for (int i = 0; i < sur.length; i++) {
      mapa[posicionCaperucitaRoja[0] + i + 1][posicionCaperucitaRoja[1]] = sur[i];
    }
    // Este
    for (int j = 0; j < este.length; j++) {
      mapa[posicionCaperucitaRoja[0]][posicionCaperucitaRoja[1] + j + 1] = este[j];
    }
    // Oeste
    for (int j = 0; j < oeste.length; j++) {
      mapa[posicionCaperucitaRoja[0]][posicionCaperucitaRoja[1] - j - 1] = oeste[j];
    }

  }

  /**
   * This method is optional, and sets the initial state of the agent.
   */
  @Override
  public void initState() {

    // TODO: Complete Method

  }

  /**
   * This method returns the String representation of the agent state.
   */
  @Override
  public String toString() {
    String str = "";

    // TODO: Complete Method
    str = str + "Estado de Caperucita Roja:\n";
    str = str + "Escenario percibido:\n";
    str = str + this.showMapa() + "\n";
    str = str + "Posici�n de Caperucita Roja: (" + posicionCaperucitaRoja[0] + ", " + posicionCaperucitaRoja[1] + "\n";
    str = str + "Posici�n del Lobo Feroz: (" + posicionLoboFeroz[0] + ", " + posicionLoboFeroz[1] + "\n";
    str = str + "Cantidad de vidas de Caperucita Roja = " + vidasCaperucitaRoja + "\n";

    return str;
  }

  private String showMapa() {
    String str = new String();
    for (int i = 0; i < 9; i++) {
      str = str + "|";
      for (int j = 0; j < 14; j++) {
        if (j == 13) {
          str = str + mapa[i][j];
        } else {
          str = str + mapa[i][j] + " ";
        }
      }
      System.out.println("|");
    }

    return str;
  }

  /**
   * This method is used in the search process to verify if the node already
   * exists in the actual search.
   */
  @Override
  public boolean equals(Object obj) {
    Boolean equals = true;
    // TODO: Complete Method
    EstadoCaperucitaRoja estadoComparado = (EstadoCaperucitaRoja) obj;
    // Se comparan dos mapas y determinan si son iguales
    if (!Arrays.deepEquals(estadoComparado.getmapa(), this.mapa)) {
      equals = false;
    }
    // Se compara la posici�n de Caperucita Roja
    if (!Arrays.equals(estadoComparado.getposicionCaperucitaRoja(), this.posicionCaperucitaRoja)) {
      equals = false;
    }
    // Se compara la posici�n de Lobo Feroz
    if (!Arrays.equals(estadoComparado.getposicionLoboFeroz(), this.posicionLoboFeroz)) {
      equals = false;
    }
    // Se compara la cantidad de vidas de Caperucita Roja
    if (estadoComparado.getvidasCaperucitaRoja() != this.vidasCaperucitaRoja) {
      equals = false;
    }
    // Se compara la cantidad de dulces obtenidos por Caperucita Roja
    if (estadoComparado.getcantidadDulcesObtenidos() != this.cantidadDulcesObtenidos) {
      equals = false;
    }

    return equals;
  }

  // TODO: Complete this section with agent-specific methods
  // The following methods are agent-specific:

  public int[] getposicionCaperucitaRoja() {
    return posicionCaperucitaRoja;
  }

  public void setposicionCaperucitaRoja(int[] arg) {
    posicionCaperucitaRoja = arg;
  }

  public int[] getposicionLoboFeroz() {
    return posicionLoboFeroz;
  }

  public void setposicionLoboFeroz(int[] arg) {
    posicionLoboFeroz = arg;
  }

  // public Other getposicionDulces(){
  // return posicionDulces;
  // }
  // public void setposicionDulces(Other arg){
  // posicionDulces = arg;
  // }
  // public Other getposicionCampoFlores(){
  // return posicionCampoFlores;
  // }
  // public void setposicionCampoFlores(Other arg){
  // posicionCampoFlores = arg;
  // }
  // public Other getposicionArboles(){
  // return posicionArboles;
  // }
  // public void setposicionArboles(Other arg){
  // posicionArboles = arg;
  // }
  public int[][] getmapa() {
    return mapa;
  }

  public void setmapa(int[][] arg) {
    mapa = arg;
  }

  public int getvidasCaperucitaRoja() {
    return vidasCaperucitaRoja;
  }

  public void setvidasCaperucitaRoja(int arg) {
    vidasCaperucitaRoja = arg;
  }

  public int getcantidadDulcesObtenidos() {
    return cantidadDulcesObtenidos;
  }

  public void setcantidadDulcesObtenidos(int arg) {
    cantidadDulcesObtenidos = arg;
  }

}