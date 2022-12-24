package Service;

public class Sergeants extends Officers{
    public void salary(String rank) {// визначає з/п в залежності від звання(lab_3)
        final int l = 15000;
        final int stl = 16000;
        final int ml = 14000;
        final int k = 18000;
        final int m = 19000;
        final int pp = 22000;
        final int p = 25000;

        switch (rank) {
            case ("Молодший лейтенант") -> System.out.println("Зарплата становить" + " " + ml + " " + "гривень");
            case ("Лейтенант") -> System.out.println("Зарплата становить" + " " + l + " " + "гривень");
            case ("Старший лейтенант") -> System.out.println("Зарплата становить" + " " + stl + " " + "гривень");
            case ("Капітан") -> System.out.println("Зарплата становить" + " " + k + " " + "гривень");
            case ("Майор") -> System.out.println("Зарплата становить" + " " + m + " " + "гривень");
            case ("Підполковник") -> System.out.println("Зарплата становить" + " " + pp + " " + "гривень");
            case ("Полковник") -> System.out.println("Зарплата становить" + " " + p + " " + "гривень");
        }
    }

    @Override
    public void vacation() {// кількість днів у відпустці
        System.out.println("Відпустка становить 20 днів");
    }

    @Override
    public void position() {
        System.out.println("Пожежний, Пожежний-рятувальник, Радіотелефоніст, Рятувальник-верхолаз, Рятувальник гірський, Сапер, Старший водій, Старший водолаз");
    }
}
