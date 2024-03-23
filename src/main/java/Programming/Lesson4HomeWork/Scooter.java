package Programming.Lesson4HomeWork;

public class Scooter extends NoResourseTransoprt {
    private String name;
    public Scooter(String name) {
        cost = (int) Math.random()*10_000 + 10;
        numberOfHorsepower = (int) (Math.random()*20) + 3;
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println("Поееееехали");
    }

    public void printInfo(){
        System.out.println("Scooter " + name + ", cost = " + cost + "$, HorsePower = " + numberOfHorsepower);
    }
}
