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
        int iOs = 1;
        int android = 0;
        if (iOs == clientOs) {
            System.out.println("Пользователь пользуеться IOS");
        }
        if (android == clientOs) {
            System.out.println("Пользователь пользуеться Android");
        }
    }

    public static void task2() {
        int clientDeviceYear = 2015;
        int clientOs = 1;
        int iOs = 1;
        int android = 0;
        if (iOs == clientOs) {
            System.out.println("Пользователь пользуеться IOS");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установка приложения");
            }
        }
        if (android == clientOs) {
            System.out.println("Пользователь пользуеться Android");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установка приложения");
            }
        }
    }

    public static void task3() {
        int year = 2021;
        boolean leapYear = ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0));
        if (leapYear) {
            System.out.println("Год высокостный");
        } else {
            System.out.println("Не высокостный");
        }
    }

    public static void task4() {
        int distance = 95;
        if (distance < 20) {
            System.out.println("Потребуется дней: 1 день срок доставки");
        } else if ((distance >= 20) && (distance < 60)) {
            System.out.println("Потребуется дней: 2 дня срок доставки");
        } else if ((distance >= 60) && (distance < 100)) {
            System.out.println("Потребуется дней: 3 дня срок доставки");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
    }

    public static void task5() {
        int monthNumber = 12;
        switch (monthNumber) {
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
                System.out.println("введите число от 1 до 12");
        }
    }
}
