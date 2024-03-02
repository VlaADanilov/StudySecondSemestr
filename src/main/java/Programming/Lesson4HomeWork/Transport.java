package Programming.Lesson4HomeWork;

public abstract class Transport {
    protected int cost;
    protected double numberOfHorsepower;

    public int getCost(){
        return cost;
    }

    public double getNumberOfHorsepower() {
        return numberOfHorsepower;
    }

    public abstract void drive();

    public abstract void printInfo();
}
