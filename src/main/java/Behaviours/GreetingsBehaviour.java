package Behaviours;

import Utils.Greetings;
import Utils.Language;
import jade.core.behaviours.Behaviour;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GreetingsBehaviour extends Behaviour {
    Language language;
    int i = 0;
    public GreetingsBehaviour(Language language) {
        this.language = language;
    }
    @Override
    public void action() {
        new Greetings(language);
        i++;
    }
    @Override
    public boolean done() {
        return i >=3 ;
    }
}
