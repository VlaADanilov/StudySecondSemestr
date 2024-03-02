package Programming.Lesson4HomeWork;

public class PetrolCar extends Car{
    public PetrolCar(String company, String model, int year) throws Exception {
        if (year < 1950 || year > 2024) throw new Exception();
        this.company = company;
        this.model = model;
        this.year = year;
        mileage = 0;
        levelResourseToDrive = 0;
        statement = State.Closed;
        cost = (int) (Math.random()*1_000_000 + 200_000);
        numberOfHorsepower = (int) (Math.random() * 200 + 50);
    }

    @Override
    public void fillLevel(int filles) {
        if (filles < 0) return;
        if (levelResourseToDrive + filles > 100) levelResourseToDrive = 100;
        else levelResourseToDrive += filles;
        System.out.println("Сейчас столько бензина - " + levelResourseToDrive);
    }

    @Override
    public void drive() {
        if (levelResourseToDrive == 0){
            System.out.println("У машины " + company + " " + model  + " Нет бензина");
        }
        else{
            System.out.println(company + " " + model + " поехала");
            int x = (int)(Math.random()*15);
            levelResourseToDrive = Math.max(levelResourseToDrive - x, 0);
            System.out.println(getLevelResourseToDrive() + " Столько осталось бензина");
        }
    }

}
