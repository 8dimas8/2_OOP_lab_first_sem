package Service;

public abstract class Workers {// клас зі змінними final(lab 3)
    final String firstShift = "ГДЗС";
    final String secondShift = "Протипожежне водопостачання";
    final String thirdShift = "ПТО, безпека праці";
    final String fourthShift = "Службова документація";

    public void responsibilities(int number){// напрямки діяльності начальників караулів(lab_3)
        switch (number) {
            case (1) -> System.out.println(firstShift);
            case (2) -> System.out.println(secondShift);
            case (3) -> System.out.println(thirdShift);
            case (4) -> System.out.println(fourthShift);
        }
    }
    public void vacation(){}// кількість днів у відпустці
    public void position(){}// посада
}

