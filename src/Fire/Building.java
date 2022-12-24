package Fire;

// create class
public class Building {
    private int length;
    private int width;
    private int height;

    // use constructor
   public Building(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public Building(){}
    public Building(int height){
       this.height = height;
        int square = width * length;
   }
    private void ladder(){// в залежності від висоти визначає тип драбини яку потрібно використати
        if (height < 3.5){
            System.out.println("Ви можете використати драбину палку");
        }
        else if (height < 10.7){
            System.out.println("Ви можете застосувати трьохколінну висувну драбину");
        }
        else {
            System.out.println("Вам потрібна автодрабина");
        }
    }

    private int ffArea(int numDirections, int qDepth){ //площа гасіння стволами
        return numDirections * qDepth * width;
    }// визначає площу гасіння пожежі стволами


    // lab_2
    private double ffArea(double numDirections, double qDepth){ //площа гасіння стволами, перевизначений
    return numDirections * qDepth * width;
}

    private int firefighter(int countPerson){// кількість відділень в залежності від кількості осіб , перевантажений
       if (countPerson % 4 == 0){
           return countPerson / 4;
       }
       else{
           return (countPerson / 4) + 1;
       }}
    private void comparison(Building building){// приймає об'єкт в якості параметра, порівнює площі об'єктів
       int thisSquare = width * length;
       int objectSquare = building.width * building.length;
       if(thisSquare > objectSquare){
           System.out.println("Площа першого об'єкта більша");
       }
       else if(thisSquare < objectSquare){
           System.out.println("Площа другого об'єкта більша");
       }
       else {
           System.out.println("Площі об'єктів рівні");
       }}
    public Building building(int w, int h){//метод посилкового типу, що повертає об'єкт
       Building building = new Building(height);
       return building;
    }


    // lab_3
    // generate get() and set()
    public void setLength(int length) {//x2
        this.length = 2 * length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }



    // методи для виклику інкапсульованих методів
    public void getLadder(){
         ladder();
    }
    public int getFfArea(int numDirections, int qDepth){
        return ffArea(numDirections, qDepth);
    }
    public double getFfArea(double numDirections, double qDepth){
        return ffArea(numDirections, qDepth);
    }
    public int getFirefighter(int countPerson){
        return firefighter(countPerson);
    }
    public void getComparison(Building building){
        comparison(building);
    }


}


