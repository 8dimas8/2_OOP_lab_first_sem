package Fire;

import Fire.Building;


// create class
    public class FireConditions {
    private int fireTemperature;
    private int fireSquare;
    private int firePerimeter;

    // use constructor
    public FireConditions(int fireTemperature, int fireSquare, int firePerimeter) {
        this.fireTemperature = fireTemperature;
        this.fireSquare = fireSquare;
        this.firePerimeter = firePerimeter;
    }
    // перевизначення конструтора
    public FireConditions(){// 1
        fireTemperature = 0;
        fireSquare = 0;
        firePerimeter = 0;
    }
    public FireConditions(int general){
        fireTemperature = fireSquare = firePerimeter = general;
    }// 2
    public FireConditions(int fireTemperature, int fireSquare){//3
        this.fireTemperature = fireTemperature;
        this.fireSquare = fireSquare;
        firePerimeter = fireSquare;
    }

    public void suit(){
        if(fireTemperature >= -40 & fireTemperature <= 300){// в залежності від температури визначає який одяг потрібно вдягнути рятувальнику
            System.out.println("Ви можете застосувати БОЗ");
        }
        else if(fireTemperature <= 800 & fireTemperature >= 300){
            System.out.println("Ви можете застосувати  тепловідбивний костюм");
        }
        else {
            System.out.println("Температура занадто висока, захисний одяг вас не врятує");
        }
    }

    int waterCons(int waterSupply){// витрата води на гасіння пожежі
        return fireSquare * waterSupply;
    }// витрата води на гасіння пожежі

// lab_2
public double waterCons(double waterSupply){// перевизначений
    return fireSquare * waterSupply;}

    public void cost(int a, int b) {//величина розрахункового параметра, інтенсивність подачі(визначає витрату вогнегасних засобів на гасіння пожежі), перевантажений
        System.out.println("Витрата вогнегасного засобу становитиме" + " " + a * b + "л/c");
    }
        


    // lab_3
    // generate get() and set()

    public void setFireTemperature(int fireTemperature) {// змінна збільшується вдівічі
        this.fireTemperature = 2 * fireTemperature;
    }

    public void setFireSquare(int fireSquare) {
        this.fireSquare = fireSquare;
    }

    public void setFirePerimeter(int firePerimeter) {
        this.firePerimeter = firePerimeter;
    }

    public int getFireTemperature() {
        return fireTemperature;
    }

    public int getFireSquare() {
        return fireSquare;
    }

    public int getFirePerimeter() {
        return firePerimeter;
    }

    // створення метода, який використовує змінні іншого класу
    Building obj = new Building(100,10,50);
    void countFireHose(double countLine){
        int count = (int) (1.2 * obj.getLength() * (countLine / 20));
        System.out.println("Кількість пожежних рукавів становить" + " " + count);
    }

}


