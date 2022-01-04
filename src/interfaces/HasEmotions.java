package interfaces;

import abstractThings.Emotion;

@FunctionalInterface
public interface HasEmotions {
    void setEmotion(Emotion em);
}
