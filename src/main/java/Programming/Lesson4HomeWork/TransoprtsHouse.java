package Programming.Lesson4HomeWork;

import java.util.List;

public class TransoprtsHouse {
    public static void printInfoAboutAllOfThis(List<? extends Transport> list){
        for (Transport trs : list){
            trs.printInfo();
            System.out.println(" ");
        }
    }

    public static void allToParking(List<? extends Car> cars){
        for (Car car : cars){
            car.parking();
            System.out.println(" ");
        }
    }

    public static void goDrivingWithNoResourseTransoprt(List<? extends NoResourseTransoprt> list){
        for (NoResourseTransoprt trs : list){
            trs.printInfo();
            trs.drive();
            System.out.println();
        }
    }
}
