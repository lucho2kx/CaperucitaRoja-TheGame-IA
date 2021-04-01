package frsf.cidisi.exercise.caperucitaroja.search;

import frsf.cidisi.exercise.caperucitaroja.search.actions.IrAlNorte;
import frsf.cidisi.exercise.caperucitaroja.search.actions.IrAlSur;
import frsf.cidisi.exercise.caperucitaroja.search.actions.IrAlOeste;
import frsf.cidisi.exercise.caperucitaroja.search.actions.IrAlEste;
import frsf.cidisi.exercise.caperucitaroja.search.actions.TomarDulcesIrNorte;
import frsf.cidisi.exercise.caperucitaroja.search.actions.TomarDulcesIrSur;
import frsf.cidisi.exercise.caperucitaroja.search.actions.TomarDulcesIrOeste;
import frsf.cidisi.exercise.caperucitaroja.search.actions.TomarDulcesIrEste;

import frsf.cidisi.faia.agent.Perception;
import frsf.cidisi.faia.agent.search.Problem;
import frsf.cidisi.faia.agent.search.SearchAction;
import frsf.cidisi.faia.agent.search.SearchBasedAgent;
import frsf.cidisi.faia.agent.Action;
import frsf.cidisi.faia.solver.search.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Vector;

public class CaperucitaRoja extends SearchBasedAgent {

    public CaperucitaRoja() {

        // The Agent Goal
        ObjetivoCaperucitaRoja agGoal = new ObjetivoCaperucitaRoja();

        // The Agent State
        EstadoCaperucitaRoja agState = new EstadoCaperucitaRoja();
        this.setAgentState(agState);

        // Create the operators
        Vector<SearchAction> operators = new Vector<SearchAction>();
        operators.addElement(new IrAlNorte());	
        operators.addElement(new IrAlSur());	
        operators.addElement(new IrAlOeste());	
        operators.addElement(new IrAlEste());	
        operators.addElement(new TomarDulcesIrNorte());	
        operators.addElement(new TomarDulcesIrSur());	
        operators.addElement(new TomarDulcesIrOeste());	
        operators.addElement(new TomarDulcesIrEste());	

        // Create the Problem which the agent will resolve
        Problem problem = new Problem(agGoal, agState, operators);
        this.setProblem(problem);
    }

    /**
     * This method is executed by the simulator to ask the agent for an action.
     */
    @Override
    public Action selectAction() {

        // Create the search strategy
        DepthFirstSearch strategy = new DepthFirstSearch();          

        // Create a Search object with the strategy
        Search searchSolver = new Search(strategy);

        /* Generate an XML file with the search tree. It can also be generated
         * in other formats like PDF with PDF_TREE */
        searchSolver.setVisibleTree(Search.GRAPHVIZ_TREE);

        // Set the Search searchSolver.
        this.setSolver(searchSolver);

        // Ask the solver for the best action
        Action selectedAction = null;
        try {
            selectedAction =
                    this.getSolver().solve(new Object[]{this.getProblem()});
        } catch (Exception ex) {
            Logger.getLogger(CaperucitaRoja.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Return the selected action
        return selectedAction;

    }

    /**
     * This method is executed by the simulator to give the agent a perception.
     * Then it updates its state.
     * @param p
     */
    @Override
    public void see(Perception p) {
        this.getAgentState().updateState(p);
    }
}
