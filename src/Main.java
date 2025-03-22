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
        for (int c = 0; c < 17; c += 2){
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

    }
}