package Programming.Lesson4HomeWork;

public class Bicycle extends NoResourseTransoprt {
    private String name;
    public Bicycle(String name) {
        cost = (int) Math.random()*10_000 + 10;
        numberOfHorsepower = (int) (Math.random()*30) + 5;
        this.name = name;
    }

    @Override
    public void drive() {
        System.out.println("Поееееехали");
    }

    public void printInfo(){
        System.out.println("Bicycle " + name + ", cost = " + cost + "$, HorsePower = " + numberOfHorsepower);
    }
}
