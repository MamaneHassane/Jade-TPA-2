package Containers;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.ControllerException;

public class Maincontainer {
    public static void main(String[] args) {
        try {
            Runtime runtime = Runtime.instance();
            ProfileImpl profileImpl=new ProfileImpl();
            profileImpl.setParameter(Profile.GUI,"true");
            AgentContainer mainContainer= runtime.createMainContainer(profileImpl);
            mainContainer.start();
        } catch(ControllerException e) {
            e.printStackTrace();
        }
    }
}