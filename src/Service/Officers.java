package Service;

public class Officers extends Workers {
    public void salary(String rank) {// визначає з/п в залежності від звання(lab_3)
        final int r = 8000;
        final int mls = 9000;
        final int s = 10000;
        final int sts = 11000;
        final int str = 12000;
        final int pr = 13000;
        final int stpr = 14000;

        switch (rank) {
            case ("Рядовий") -> System.out.println("Зарплата становить" + " " + r + " " + "гривень");
            case ("Молодший сержант") -> System.out.println("Зарплата становить" + " " + mls + " " + "гривень");
            case ("Сержант") -> System.out.println("Зарплата становить" + " " + s + " " + "гривень");
            case ("Старший сержант") -> System.out.println("Зарплата становить" + " " + sts + " " + "гривень");
            case ("Старшина") -> System.out.println("Зарплата становить" + " " + str + " " + "гривень");
            case ("Прапорщик") -> System.out.println("Зарплата становить" + " " + pr + " " + "гривень");
            case ("Старший прапорщик") -> System.out.println("Зарплата становить" + " " + stpr + " " + "гривень");
        }
    }

    @Override
    public void vacation() {// кількість днів у відпустці
        System.out.println("Відпустка становить 30 днів");
    }

    @Override
    public void position() {
        System.out.println("Головний інспектор, Завідувач сектору, \t\n" +
                "Заступник начальника управління,Інспектор, \t\n" +
                "Начальник управління, Провідний фахівець, \t\n" +
                "Провідний інспектор");
    }
}
