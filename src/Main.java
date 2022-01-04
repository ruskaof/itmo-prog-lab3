import abstractThings.Emotion;
import creatures.Human;
import creatures.MagicHat;
import interfaces.Conversationable;

public class Main {
    public static void main(String[] args) {
        Human alice = new Human("Alice");
        Human sonya = new Human("Sonya");

        MagicHat hat = new MagicHat("The Hat");


        hat.say("Из обыкновенного колодца таскают воду," +
                " а из мармеладного колодца всякий может, я надеюсь, таскать мармелад.", new Conversationable[]{alice, sonya});

        alice.say("Ты что - совсем дурочка? " +
                "- Я говорю, как они могли таскать мармелад оттуда? Ведь они там жили", new Conversationable[]{hat, sonya});

        sonya.say("Не только жили! Они жили-были!", new Conversationable[]{hat, alice}, Emotion.DAZED);

        System.out.println("\n");

        sonya.yawn();
        sonya.rubEyes();

        System.out.println("\n");

        sonya.say("Так вот, этот самый мармадад они ели и пили" +
                " - делали что хотели...", new Conversationable[]{hat, alice});


    }
}
