package Programming.Lesson4HomeWork;

public abstract class Car extends Transport{
    protected String company;
    protected String model;
    protected int year;
    protected int mileage;
    protected int levelResourseToDrive;
    protected State statement;

    public abstract void fillLevel(int filles);

    @Override
    public String toString() {
        return "Car " + company + " " + model + " " + year + " year";
    }

    public void printInfo(){
        System.out.println("Car " + company + " " + model + " " + year + " year");
        System.out.println("Cost = " + cost + ", mileage = " + mileage);
        System.out.println("Resourse = " + levelResourseToDrive);
        System.out.println("HourePower = " + numberOfHorsepower);
        System.out.println(statement);
    }

    public void open(){
        statement = State.Open;
    }

    public void close(){
        statement = State.Closed;
    }

    public int getMileage() {
        return mileage;
    }

    public int getLevelResourseToDrive() {
        return levelResourseToDrive;
    }

    public void printStatement() {
        System.out.println(statement);
    }

    public void parking() {
        System.out.println("Машина " + company + " " + model + " припаркована");
        statement = State.Closed;
    }
}
