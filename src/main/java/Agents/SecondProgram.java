package Agents;

import Behaviours.GreetingsBehaviour;
import Utils.Language;
import jade.core.Agent;
import jade.core.behaviours.ParallelBehaviour;

public class SecondProgram extends Agent {
    @Override
    protected void setup() {
        ParallelBehaviour parallelGrettings = new ParallelBehaviour();
        parallelGrettings.addSubBehaviour(new GreetingsBehaviour(Language.ARABIC));
        parallelGrettings.addSubBehaviour(new GreetingsBehaviour(Language.ENGLISH));
        parallelGrettings.addSubBehaviour(new GreetingsBehaviour(Language.FRENCH));
        addBehaviour(parallelGrettings);
    }
}
