package creatures;

import java.util.Objects;

public class MagicHat extends IntelligentCreature{
    public MagicHat(String name){
        super(name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "MagicHat{" +
                "name='" + name + '\'' +
                '}';

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MagicHat human = (MagicHat) o;
        return name.equals(human.name);
    }
}
