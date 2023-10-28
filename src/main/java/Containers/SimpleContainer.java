package Containers;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

public class SimpleContainer {
    public static void main(String[] args) {
        try {
            Runtime runtime = Runtime.instance();
            ProfileImpl profilImpl = new ProfileImpl();
            profilImpl.setParameter(Profile.MAIN_HOST, "localhost");
            AgentContainer agentContainer = runtime.createAgentContainer(profilImpl);
            AgentController agentController1 = agentContainer.createNewAgent("Greeter1", "Agents.FirstProgram",new Object[]{});
            AgentController agentController2 = agentContainer.createNewAgent("Greeter2", "Agents.SecondProgram",new Object[]{});
            agentController1.start();
            agentController2.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
