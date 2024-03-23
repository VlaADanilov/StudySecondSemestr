package Programming.Lesson4HomeWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TransoprtsHouse {
    public static void sortCarListByCost(List<? extends Car> list){
        Collections.sort(list, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1.cost > o2.cost) return 1;
                if (o1.cost == o2.cost) return 0;
                return -1;
            }
        });
    }
    public static Transport chippestTransport(List<? extends Transport> list){
        Transport ret = list.get(0);
        for (int i = 1; i < list.size(); i++){
            if (list.get(i).cost < ret.cost){
                ret = list.get(i);
            }
        }
        return ret;

    }

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
