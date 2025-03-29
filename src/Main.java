public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        for (int a = 1; a <= 10; a++ ){
            System.out.println(a);
        }

        System.out.println("\nЗадание 2");
        for (int b = 10; b >= 1; b--){
            System.out.println(b);
        }

        System.out.println("\nЗадание 3");
        for (int c = 0; c <= 17; c += 2){
            System.out.println(c);
        }

        System.out.println("\nЗадание 4");
        for (int d = 10; d >= -10; d--){
            System.out.println(d);
        }

        System.out.println("\nЗадание 5");
        for (int e = 1904; e <= 2096; e += 4){
            System.out.println(e + " год является високосным");
        }

        System.out.println("\nЗадание 6");
        for (int f = 7; f <= 98; f += 7){
            System.out.println(f);
        }

        System.out.println("\nЗадание 7");
        for (int g = 1; g <=512; g *= 2){
            System.out.println(g);
        }

        System.out.println("\nЗадание 8");

        int monthDeposit = 29000;
        int total = 0;
        for (int h = 1; h <=12; h++){
            total = total + monthDeposit;
            System.out.println("Месяц " + h + " ,сумма накоплений равна " + total + " рублей");
        }

        System.out.println("\nЗадание 9");

        int totalNewTask = 0;
        for (int i = 1; i <=12; i++){
            totalNewTask += monthDeposit;
            totalNewTask += totalNewTask/100;
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + totalNewTask + " рублей");
        }

        System.out.println("\nЗадание 10");

        for (int j = 1; j <= 10; j++){
            System.out.println("2 * " + j + " = " + j * 2);
        }

        System.out.println("\n Новое домашнее задание");
        System.out.println("Задание 1");

        int newMonthDeposit = 15000;
        int month = 0;
        int newTotal = 0;

        while (newTotal < 2_459_000){
            newTotal += newMonthDeposit;
            month++;
            System.out.println("Месяц " + month + " ,сумма накоплений равна " + newTotal + " рублей");
        }

        System.out.println("\nЗадание 2");

        int beginNumber = 1;
        while (beginNumber <= 10){
            System.out.print(beginNumber + " ");
            beginNumber++;
        }
        System.out.println(" ");
        for (int k = 10; k >= 1; k--){
            System.out.print(k + " ");
        }

        System.out.println("\nЗадание 3");

        int populationY = 12_000_000;
        int birthY1000 = 17;
        int deathY1000 = 8;
        int year = 0;

        while (year < 10) {
            year++;
            int naturalPopulGrowth = (birthY1000 - deathY1000) * (populationY/1000);
            populationY += naturalPopulGrowth;
            System.out.println("Год " + year + " ,численность населения составляет " + populationY);
        }

        System.out.println("\nЗадание 4");
        int newMonth = 0;
        int totalTask4 = 0;
        double bankRate = 1.07;
        double monthDepositTask4 = 15000;

        while ( totalTask4 < 12_000_000){
            newMonth++;
            monthDepositTask4 = monthDepositTask4 * bankRate;
            totalTask4 += monthDepositTask4;
            System.out.println("Сумма накоплений за " + newMonth + " месяц - равна " + totalTask4 + " рублей");
        }

        System.out.println("\nЗадание 5");

        int totalTask5 = 0;
        int monthTask5 = 0;
        double monthDepositTask5 = 15000;

        while ( totalTask5 < 12_000_000) {
            monthTask5++;
            monthDepositTask5 = monthDepositTask5 * bankRate;
            totalTask5 += monthDepositTask5;
            if (monthTask5 % 6 == 0) {
                System.out.println("Сумма накоплений за " + monthTask5 + " месяц - равна " + totalTask5 + " рублей");
            }
        }

        System.out.println("\nЗадание 6");
        int totalTask6 = 0;
        int monthTask6 = 0;
        double monthDepositTask6 = 15000;

        while ( monthTask6 < (12 * 9)) {
            monthTask6++;
            monthDepositTask6 = monthDepositTask6 * bankRate;
            totalTask6 += monthDepositTask6;
            if (monthTask6 % 6 == 0) {
                System.out.println("Сумма накоплений за " + monthTask6 + " месяц - равна " + totalTask6 + " рублей");
            }
        }

        System.out.println("\nЗадание 7");
        for (int dayNubmer = 5; dayNubmer <= 31; dayNubmer = dayNubmer + 7){
                System.out.println("Сегодня пятница," + dayNubmer + "-е число. Необходимо подготовить отчет");
            }

        System.out.println("\nЗадание 8");
        int yearTask10 = 0;
        for ( ;yearTask10 < 2125; yearTask10 += 79) {
            if (yearTask10 > 1825 && yearTask10 < 2125) {
                System.out.println(yearTask10);
            }
        }





    }
}