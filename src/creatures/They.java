package creatures;

import things.MarmeladeWell;

public abstract class They extends IntelligentCreature{
    protected double marmeladeAmount = 0;

    public They(){
        super("they");
    }

    public abstract void live();

    public void carryMarmelade(MarmeladeWell well, double amount){
        double got = well.getLiquid(amount);
        this.marmeladeAmount += got;
    }

    public void consumeMarmelade(double amount){
        if (marmeladeAmount - amount < 0){
            System.out.println(name + " wanted to consume more marmelade than they have");
        } else {
            System.out.println(name + "successfully consumed " + amount + " of Marmelade");
        }
    }

}
