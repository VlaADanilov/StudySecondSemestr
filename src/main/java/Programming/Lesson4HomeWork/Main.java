package Programming.Lesson4HomeWork;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Transport> list = new ArrayList<>();
        ElectroCar el =  new ElectroCar("Tesla", "X", 2020);
        DieselCar di =  new DieselCar("YAZ", "Patriot", 2000);
        PetrolCar pet = new PetrolCar("Audi", "R8", 2010);
        Bicycle by = new Bicycle("Forward");
        Scooter sc = new Scooter("Master");
        list.add(el);
        list.add(di);
        list.add(pet);
        list.add(by);
        list.add(sc);

        TransoprtsHouse.printInfoAboutAllOfThis(list);

        List<Car> cars = new ArrayList<>();
        cars.add(el);
        cars.add(di);
        cars.add(pet);
        TransoprtsHouse.printInfoAboutAllOfThis(cars);
        TransoprtsHouse.allToParking(cars);

        List<NoResourseTransoprt> ncars = new ArrayList<>();
        ncars.add(by);
        ncars.add(sc);
        TransoprtsHouse.goDrivingWithNoResourseTransoprt(ncars);

        TransoprtsHouse.printInfoAboutAllOfThis(ncars);
    }
}
