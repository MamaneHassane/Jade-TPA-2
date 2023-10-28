package Agents;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.TickerBehaviour;
import jade.core.behaviours.WakerBehaviour;

public class FirstProgram extends Agent {
    @Override
    protected void setup() {
        addBehaviour(new CyclicBehaviour() {
            @Override
            public void action() {
                System.out.println("Hello Everybody");
                block(4000);
            }
        });
        addBehaviour(new TickerBehaviour(this,7000) {
            @Override
            protected void onTick() {
                System.out.println("Salut");
            }
        });
        addBehaviour(new WakerBehaviour(this, 20000) {
            @Override
            protected void onWake() {
                System.out.println("Well, I'm leaving the platform");
                myAgent.doDelete();
            }
        });
    }
}
