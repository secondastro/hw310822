public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
    public static void task1() {
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        int clientOs = 1;
        int clientDeviceYear = 2015;
        if (clientOs == 0) {
            if (clientDeviceYear<2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear<2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        int year = 2022;
        if (year%4 == 0) {
            if (year%100!=0 || year%400 == 0) {
                System.out.println(year + " является високосным");
            }
        } else {
            System.out.println(year + " не является високосным");
        }
    }

    public static void task4() {
        int deliveryDistance = 95;
        int days=0;
        int dist1 = 20;
        int dist2 = 60;
        int dist3 = 100;
        if (deliveryDistance <=dist1) {
            days = 1;
        } else if (deliveryDistance<=dist2) {
            days = 2;
        } else if (deliveryDistance<=dist3) {
            days = 3;
        }
        System.out.println("Потребуется дней: " + days);
    }

    public static void task5() {
        int monthNumber = 12;
        switch(monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                break;
        }
    }
}