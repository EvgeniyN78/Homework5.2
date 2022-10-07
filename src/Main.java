public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");

        int sumDeposit = 15_000;
        int total = 0;
        int rate = 12;
        int month = 0;

            while (total < 2459000) {
            total = total + sumDeposit;
            total = total + (total / 100 * rate / 12);
            month = month + 1;

            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }

        System.out.println("");

        //Задание 2
        System.out.println("Задание 2");

        int i = 0;

        while(i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println(" ");
        System.out.println(" ");

        //Задание 3
        System.out.println("Задание 3");

        int population = 17_000_000;
        int birthRate = population/1_000*17;
        int mortality = population/1_000*8;
        int year = 0;
            for (int k = 1; k < 11; k++) {
            population = population + birthRate - mortality;
            year = year + 1;

            System.out.println("Год " + year + ", численность населения составляет " + population);
            
        }
        System.out.println(" ");

        //Задание 4
        System.out.println("Задание 4");

        int sum = 15_000;
        int interestRate = 7;
        int months = 0;

        while (sum < 12_000_000) {
            sum = sum + (sum / 100 * interestRate / 12);
            months = months + 1;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма " + sum + " рублей.");
            }
        }
        System.out.println(" ");
        //Задание 5
        System.out.println("Задание 5");

        sum = 15_000;
        interestRate = 7;
        months = 0;

        while (months < ((12 * 9) + 1)) {
            sum = sum + (sum / 100 * interestRate / 12);
            months = months + 1;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма " + sum + " рублей.");
            }
        }
        System.out.println(" ");
        //Задание 6
        System.out.println("Задание 6");

        int firstFriday = 5;

        for (int j = firstFriday; j < 32; j = j + 7) {

            System.out.println("Сегодня пятница " + j + " число. Необходимо подготовить отчёт.");

        }
        System.out.println(" ");
        //Задание 7
        System.out.println("Задание 7");

        int yearBefore = 2022 - 200;
        int yearAfter = 2022 + 100;

        for (int j = 0; j < yearAfter; j = j + 79) {
            if (j > yearBefore) {
                System.out.println(j);
            }
        }
        System.out.println(" ");

        //Задание 8
        System.out.println("Задание 8");

        for (int j = 1; j < 11; j++) {

            System.out.println("2 * " + j + " = " + (2 * j));

        }
    }
}