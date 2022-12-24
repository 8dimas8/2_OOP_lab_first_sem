package Fire;

// create class
public class AutoCistern {
    private double waterVolume;
    private double fuelCons;
    private double workEngine;
    // use constructor
    public AutoCistern(int waterVolume, int fuelCons, int workEngine) {
        this.waterVolume = waterVolume;
        this.fuelCons = fuelCons;
        this.workEngine = workEngine;
    }
    public AutoCistern(){}
    public void massCistern(){
        if(waterVolume <= 3500 | waterVolume > 0){// в залежності від об'єму води цистерни визначає приблизну її масу
            System.out.println("Маса автоцистерни не превищує 15 тон");
        }
        else if(waterVolume <= 5500 | waterVolume > 3500){
            System.out.println("Маса автоцистерни не превищує 15 тон");
        }
        else if(waterVolume <= 8500 | waterVolume > 5500){
            System.out.println("Маса автоцистерни не превищує 26 тон");
        }
        else{
            System.out.println("Маса автоцистерни не превищує 26 тон");
        }
    }

    public double fuel(double road){// витрата палива
            return ((road * (fuelCons / 100)) + (workEngine * 0.1));
    }// визначає скільки палива витрачено під час виїзду на пожежу


    //lab_2
    int fuel(int road){// перевизначений
    return (int) ((road * (fuelCons / 100)) + (workEngine * 0.1));
    }
    public int Firefighter(int countPerson){// кількість автомобілів які потрібно використати щоб перевезти весь о.с., перевантажений
        if(countPerson / 6 == 0){
            return countPerson / 6;
        }
        else{
            return (countPerson / 6) + 1;
        }
    }
    public void cost(int a, int b) {// обсяг, що заповнюється піною час гасіння, час гасіння, перевантажений
        System.out.println("Витрата піни на гасіння пожежі" + " " + (a * 2.25)/b + " " + "куб.м/хв" );
    }

    // lab_3
    // generate get() and set()

    public void setWaterVolume(double waterVolume) {// x2
        this.waterVolume = 2 * waterVolume;
    }

    public void setFuelCons(double fuelCons) {
        this.fuelCons = fuelCons;
    }

    public void setWorkEngine(double workEngine) {
        this.workEngine = workEngine;
    }

    public double getWaterVolume() {
        return waterVolume;
    }

    public double getFuelCons() {
        return fuelCons;
    }

    public double getWorkEngine() {
        return workEngine;
    }

    // створення метода, який використовує змінні інших класів
    Building ob = new Building();
    FireConditions con = new FireConditions();

    void fireLimit(){// визначає чи вогонь перешов за межі будівлі
        if(ob.getWidth() * ob.getHeight() > con.getFireSquare()){
            System.out.println("Вогонь не перекинувся за межі будівлі");
        }
        else if(ob.getWidth() * ob.getHeight() < con.getFireSquare()){
            System.out.println("Вогонь перекинувся за межі будівлі");
        }
        else {
            System.out.println("Будівля по периметру охоплена полум'ям");
        }
    }

}
