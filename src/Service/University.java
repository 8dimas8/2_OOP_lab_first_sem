package Service;

public class University implements Study{// клас зі статичними змінними(lab 3)
    static int scholarship = 850;
    static int numCadets;
    static {
       numCadets = 530;
    }

    public static int moneyForScholarship(){return scholarship * numCadets;}// кошти, які потрібно виділити на стипендію за 1 місяць
    @Override
    public void educationInstitutions() {// перелік ВНЗ ДСНС
        System.out.println("Національний університет цивільного захисту України\n Львівський державний університет безпеки життєдіяльності\n Черкаський інститут пожежної безпеки імені Героїв Чорнобиля Національного університету цивільного захисту України");
    }

    @Override
    public void showInfo() {// Інформація про заклади

    }

    public static void yearsScholarship(int countMonth){// кошти, які потрібно виділити для виплати стипендії за вказані місяці(lab 3)
        System.out.println("Сума, яку потрібно виділити на виплату стипендії становить" + " " + (moneyForScholarship() * countMonth) + " " + "грн");
    }

    @Override
    public void degreeOfEducation() {// Ступінь освіти
        System.out.println("Після закінчення університету ви отримаєте освітній рівень бакалавр або вище");
    }

    @Override
    public void scholarship() {// Розмір стипендії
        System.out.println("Стипендія виплачується у розмірі від 880 до 1400 грн, в залежності від успішності навчання");
    }
}
