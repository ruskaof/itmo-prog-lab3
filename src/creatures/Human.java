package creatures;

import abstractThings.Emotion;
import interfaces.EmotionalEnfluenceable;

import java.util.Objects;

public class Human extends IntelligentCreature implements EmotionalEnfluenceable {
    public Human(String name) {
        super(name);
    }

    protected Emotion emotion = Emotion.NORMAL;

    public void yawn() {
        System.out.println(this.name + " yawns");
    }

    public void rubEyes() {
        System.out.println(this.name + " rubs eyes");
    }

    @Override
    public void setEmotion(Emotion em) {
        this.emotion = em;
    }

    public Emotion getEmotion() {
        return this.emotion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return (emotion == human.emotion && name.equals(human.name));
    }

    @Override
    public int hashCode() {
        return Objects.hash(emotion, name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", emotion=" + emotion +
                '}';
    }
} 