package Utils;

public class Greetings {
    public Greetings(Language language){
        switch(language) {
            case ARABIC -> System.out.println("As-salam Alaykoum");
            case FRENCH -> System.out.println("Bonjour");
            case ENGLISH -> System.out.println("Hello");
            default -> System.out.println("Language not supported");
        }
    }
}
