public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        int randomInt = 7777;
        byte randomByte = 126;
        short randomShort = 30000;
        long randomLong = 70000000000L;
        float randomFloat = 7.4f;
        double randomDouble = 5.5;

        System.out.println("Значение переменной randomInt с типом int равно " + randomInt);
        System.out.println("Значение переменной randomByte с типом byte равно " + randomByte);
        System.out.println("Значение переменной randomShort с типом short равно " + randomShort);
        System.out.println("Значение переменной randomLong с типом long равно " + randomLong);
        System.out.println("Значение переменной randomFloat с типом float равно " + randomFloat);
        System.out.println("Значение переменной randomDouble с типом double равно " + randomDouble);

        System.out.println("Task2");
        double doubleNumber = 27.12;
        long longNumber = 987678965549L;
        float floatNumber = 2.786f;
        int intNumber = 569;
        short shortNumber = 159;
        long longNumber2 = 27897;
        byte byteNumber = 67;
        System.out.println("В этой задаче вывод переменных в консоль не требуется");

        System.out.println("Task3");
        int countOfStudents1 = 23;
        int countOfStudents2 = 27;
        int countOfStudents3 = 30;
        int totalSheets = 480;
        int totalStudents = countOfStudents1 + countOfStudents2 + countOfStudents3;
        int countSheetsByStudent = totalSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + countSheetsByStudent + " листов бумаги");

        System.out.println("Task4");
        int productivityPerMinute = 16;
        int minutesInDay = 24 * 60;
        int minutesIn3Days = 3 * minutesInDay;
        int minutesInMonth = 30 * minutesInDay;
        int productivityPer20Minutes = productivityPerMinute * 20;
        int productivityPerDay = productivityPerMinute * minutesInDay;
        int productivityPer3Days = productivityPerMinute * minutesIn3Days;
        int productivityPerMouth = productivityPerMinute * minutesInMonth;
        System.out.println("За 20 минут машина произвела " + productivityPer20Minutes + " штук бутылок");
        System.out.println("За сутки машина производит " + productivityPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivityPer3Days + " штук бутылок");
        System.out.println("За месяц машина произвела " + productivityPerMouth + " штук бутылок");

        System.out.println("Task5");
        int totalCansOfPaints = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCansOfPaints / (whiteCansPerClass + brownCansPerClass);
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " +
                totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        System.out.println("Task6");
        int bananaWeight = 80;
        int countOfBanana = 5;
        int bananaWeightInBreakfast = bananaWeight * countOfBanana;
        double milkWeightInOneMl = (double) 105 / 100;
        int volumeOfMilk = 200;
        int milkWeightInBreakfast = (int) (milkWeightInOneMl * volumeOfMilk);
        int iceCreamBriquetteWeight = 100;
        int countIceCreamBriquette = 2;
        int iceCreamWeightInBreakfast = iceCreamBriquetteWeight * countIceCreamBriquette;
        int eggWeight = 70;
        int countOfEggs = 4;
        int eggsWeightInBreakfast = eggWeight * countOfEggs;
        int totalBreakfastWeight = bananaWeightInBreakfast + milkWeightInBreakfast + iceCreamWeightInBreakfast +
                eggsWeightInBreakfast;
        double totalBreakfastWeightInKg = (double) totalBreakfastWeight / 100;
        System.out.printf("Вес завтрака %d грамм или %.1f в киллограммах %n", totalBreakfastWeight, totalBreakfastWeightInKg);

        System.out.println("Task7");
        int totalWeight = 7 * 1000;
        int resultDietOnePerDay = 250;
        int resultDietTwoPerDay = 500;
        int daysDietOne = totalWeight / resultDietOnePerDay;
        int daysDietTwo = totalWeight / resultDietTwoPerDay;
        int resultAverageDiet = (resultDietOnePerDay + resultDietTwoPerDay) / 2;
        int daysAverageDiet = totalWeight / resultAverageDiet;
        System.out.printf("Потребуется %d дней при диете в минус 250 гр в день %n", daysDietOne);
        System.out.printf("Потребуется %d дней при диете в минус 500 гр в день %n", daysDietTwo);
        System.out.printf("Потребуется %d дней при комбинированной диете  %n", daysAverageDiet);

        System.out.println("Task8");
        double salaryEmployee1 = 67760;
        double salaryEmployee2 = 83690;
        double salaryEmployee3 = 76230;
        int daysInYear = 12;
        double percentIncrease = 0.1;
        double salaryEmployee1AfterIncrease = salaryEmployee1 + salaryEmployee1 * percentIncrease;
        double salaryEmployee2AfterIncrease = salaryEmployee2 + salaryEmployee2 * percentIncrease;
        double salaryEmployee3AfterIncrease = salaryEmployee3 + salaryEmployee3 * percentIncrease;
        double salaryByYearEmp1 = salaryEmployee1 * daysInYear;
        double salaryByYearEmp2 = salaryEmployee2 * daysInYear;
        double salaryByYearEmp3 = salaryEmployee3 * daysInYear;
        double deltaSalaryByYearEmp1 = salaryEmployee1AfterIncrease * daysInYear - salaryByYearEmp1;
        double deltaSalaryByYearEmp2 = salaryEmployee2AfterIncrease * daysInYear - salaryByYearEmp2;
        double deltaSalaryByYearEmp3 = salaryEmployee3AfterIncrease * daysInYear - salaryByYearEmp3;
        System.out.printf("После повышения зарплата Маши %.2f в месяц,годовой доход вырос на %.2f %n",
                salaryEmployee1AfterIncrease, deltaSalaryByYearEmp1);
        System.out.printf("После повышения зарплата Дениса %.2f в месяц,годовой доход вырос на %.2f %n",
                salaryEmployee2AfterIncrease, deltaSalaryByYearEmp2);
        System.out.printf("После повышения зарплата Кристины %.2f в месяц,годовой доход вырос на %.2f %n",
                salaryEmployee3AfterIncrease, deltaSalaryByYearEmp3);
    }
}
