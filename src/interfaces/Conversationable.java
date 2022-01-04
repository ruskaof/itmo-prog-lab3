package interfaces;

import abstractThings.Emotion;

public interface Conversationable {
    public void say(String st, Conversationable[] interlocutors, Emotion em);
    public void say(String st, Conversationable[] interlocutors);
}
