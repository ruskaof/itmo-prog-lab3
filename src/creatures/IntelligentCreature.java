package creatures;

import abstractThings.Emotion;
import interfaces.Conversationable;
import interfaces.EmotionalEnfluenceable;

public abstract class IntelligentCreature extends AliveCreature implements Conversationable {

    IntelligentCreature(String name){
        super(name);
    }

    @Override
    public void say(String st, Conversationable[] interlocutors, Emotion em){
        System.out.println(this.name + " said\": " + st + "\".");

        for (Conversationable interlocutor: interlocutors){
            if (interlocutor instanceof EmotionalEnfluenceable){

                ((EmotionalEnfluenceable) interlocutor).setEmotion(em);
                if(interlocutor instanceof AliveCreature){
                    System.out.println(((AliveCreature) interlocutor).name + " is now " + em.getValue() + " because of these words.");
                }

                else{
                    System.out.println("The thing is now" + em.getValue() + "because of these words.");
                }
            }
        }

    }

    @Override
    public void say(String st, Conversationable[] interlocutors) {
        System.out.println(this.name + " said\": " + st + "\".");
    }


}
