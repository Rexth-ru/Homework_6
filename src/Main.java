import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача 1");
        System.out.println("Введите год");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        verifyLeapYear(year);

    }

    public static int verifyLeapYear(int y) {
        if (y % 4 == 0 && y % 100 != 0 && y % 400 == 0) {
            System.out.println(y + " Это високосный год");
        } else {
            System.out.println(y + " Это не високосный год");
        }
        return y;
    }

    public static void task2() {
        System.out.println("Задача 2");
        System.out.println("Введите вашу операционную систему: Если Андроид - 1, если IOS - 0");
        Scanner scanner = new Scanner(System.in);
        int os = scanner.nextInt();
        System.out.println("Введите год выпуска вашего телефона");
        int year = scanner.nextInt();
        checkOsAndYearPhone(os, year);

    }


    public static int checkOsAndYearPhone(int clientOS, int year) {
        switch (clientOS) {
            case 1:
                if (year < 2022) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            case 0:
                if (year < 2022) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
        }
        return year;
    }

    public static void task3() {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите расстояние: ");
        int deliveryDistance = scanner.nextInt();
        caculateDeliveryTame(deliveryDistance);


    }

    public static int caculateDeliveryTame(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            if (deliveryDistance <= 60) {
                System.out.println("Потребуется дней: " + (deliveryTime + 1));
            } else {
                System.out.println("Потребуется дней: " + (deliveryTime + 2));
            }
        }
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
        return deliveryDistance;
    }
}
