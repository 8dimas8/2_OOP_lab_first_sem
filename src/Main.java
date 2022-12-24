import Fire.*;
import Service.*;

class Main {
    public static void main(String[] args){
        Building building = new Building(100,20,5);
        AutoCistern autoCistern = new AutoCistern(5000,35,120);
        FireConditions fireConditions = new FireConditions(1000,1000,500);
        building.getLadder();
        System.out.println("Площа гасіння пожежі стволами становить" + " " + building.getFfArea(10,10) + " " + "м.кв");
        autoCistern.massCistern();
        System.out.println("Витрата палива становить " + " " + autoCistern.fuel(100) + " " + "літрів");

        fireConditions.suit();
        System.out.println("Витрата води на гасіння пожежі становить" + " " + fireConditions.waterCons(5) + " " + "л/с");
        System.out.println();

        Building building1 = new Building(100,10,8);
        System.out.println("Кількість відділень становить" + " " + building.getFirefighter(20));// перевантажений
        System.out.println("Кількість автоцистерн становить" + " " + autoCistern.Firefighter(20));// перевантажений
        autoCistern.cost(10,15);// перевантажений
        fireConditions.cost(25,30);// перевантажений
        building.getComparison(building1);// метод, який використовує об'єкт в якості параметра(порівняння площ об'єктів)
        System.out.println(building1.building(10,5));// метод посилковго типу, що повертає новий об'єкт
        System.out.println();

        System.out.println("Сума, яку потрібно виділити на виплату стипендії за місяць становить" + " " + University.moneyForScholarship() + " " + "гривень");// виплата стипендії за місяць(статичний)
        University.yearsScholarship(5);// виплата стипендії за вказану кількість місяців(статичний)
        Officers officers = new Officers();// final
        officers.responsibilities(1);// напрямки діяльності начальників караулів(final)
        officers.salary("Полковник");// з/п в залежності від звання(final)
        officers.vacation();// відпустка
        officers.position();// посади
        System.out.println();

        Study study = new College();
        study.scholarship();// розмір стипендії
        study.degreeOfEducation();// ступінь освіти
        study.educationInstitutions();// заклади освіти
        study.showInfo();// інформація про заклади освіти

    }
}
