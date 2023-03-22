public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int intVariable = 500;
        byte byteVariable = 1;
        short shortVariable = 150;
        long longVariable = 1000L;
        float floatVariable = 0.1f;
        double doubleVariable = 0.00000001;
        System.out.println("Значение переменной intVariable с типом int равно " + intVariable);
        System.out.println("Значение переменной byteVariable с типом byte равно " + byteVariable);
        System.out.println("Значение переменной shortVariable с типом short равно " + shortVariable);
        System.out.println("Значение переменной longVariable с типом long равно " + longVariable);
        System.out.println("Значение переменной floatVariable с типом float равно " + floatVariable);
        System.out.println("Значение переменной doubleVariable с типом double равно " + doubleVariable);
        System.out.println("");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float variable1 = 27.12f;
        long variable2 = 987678965549L;
        float variable3 = 2.786f;
        short variable4 = 569;
        short variable5 = -159;
        short variable6 = 27897;
        byte variable7 = 67;
        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);
        System.out.println(variable4);
        System.out.println(variable5);
        System.out.println(variable6);
        System.out.println(variable7);
        System.out.println("");
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int firstTeacherStudents = 23;
        int secondTeacherStudents = 27;
        int thirdTeacherStudents = 30;
        int papers = 480;
        int papersForOneStudent = papers / (firstTeacherStudents + secondTeacherStudents + thirdTeacherStudents);
        System.out.println("На каждого ученика рассчитано " + papersForOneStudent + " листов бумаги");
        System.out.println("");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int productivityForTwoMinutes = 16;
        int productivityForOneMinute = productivityForTwoMinutes / 2;
        int productivityForTwentyMinutes = productivityForOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + productivityForTwentyMinutes + " штук бутылок");
        int productivityForOneDay = productivityForOneMinute * 60 * 24;
        System.out.println("За сутки машина произвела " + productivityForOneDay + " штук бутылок");
        int productivityForThreeDays = productivityForOneDay * 3;
        System.out.println("За 3 дня машина произвела " + productivityForThreeDays + " штук бутылок");
        int productivityForOneMonth = productivityForOneDay * 30;
        System.out.println("За 1 месяц машина произвела " + productivityForOneMonth + " штук бутылок");
        System.out.println("");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int paintsNeed = 120;
        int whitePaintForOneClass = 2;
        int brownPaintForOneClass = 4;
        int numberOfClassrooms = paintsNeed / (whitePaintForOneClass + brownPaintForOneClass);
        int whitePaint = whitePaintForOneClass * numberOfClassrooms;
        int brownPaint = brownPaintForOneClass * numberOfClassrooms;
        System.out.println("В школе, где " + numberOfClassrooms + " классов, нужно " + whitePaint +
                " банок белой краски и " + brownPaint + " банок коричневой краски");
        System.out.println("");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int bananasWeight = 5 * 80;
        int milkWeight = 105 * 2;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;
        int breakfastWeight = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        double breakfastWeightInKg = (double) breakfastWeight / 1000;
        System.out.println("Вес спортзавтрака в граммах равен " + breakfastWeight);
        System.out.println("Вес спортзавтрака в килограммах равен " + breakfastWeightInKg);
        System.out.println("");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int daysForWeightLoss1 = 7 * 1000 / 250;
        int daysForWeightLoss2 = 7 * 1000 / 500;
        int mean = (daysForWeightLoss2 + daysForWeightLoss1) / 2;
        System.out.println("Если сбрасывать по 250 грамм в день: " + daysForWeightLoss1 +
                " дней для похудения на 7 килограмм");
        System.out.println("Если сбрасывать по 500 грамм в день: " + daysForWeightLoss2 +
                " дней для похудения на 7 килограмм");
        System.out.println("Среднее время для похудения: " + mean + " день");
        System.out.println("");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int MashaSalary = 67760;
        int DenisSalary = 83690;
        int KristinaSalary = 76230;
        int MashaNewSalary = (int) (MashaSalary + 0.1 * MashaSalary);
        int DenisNewSalary = (int) (DenisSalary + 0.1 * DenisSalary);
        int KristinaNewSalary = (int) (KristinaSalary + 0.1 * KristinaSalary);
        int MashaProfit = MashaNewSalary * 12 - MashaSalary * 12;
        int DenisProfit = DenisNewSalary * 12 - DenisSalary * 12;
        int KristinaProfit = KristinaNewSalary * 12 - KristinaSalary * 12;
        System.out.println("Маша теперь получает " + MashaNewSalary + " рублей. Годовой доход вырос на " +
                MashaProfit + " рублей");
        System.out.println("Денис теперь получает " + DenisNewSalary + " рублей. Годовой доход вырос на " +
                DenisProfit + " рублей");
        System.out.println("Кристина теперь получает " + KristinaNewSalary + " рублей. Годовой доход вырос на " +
                KristinaProfit + " рублей");
        System.out.println("");
    }
}