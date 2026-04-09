import java.time.LocalDate;

class Homework {
    public static void main(String[] args) {
        int year2 = 2024;
        definitionYear(year2);
        int clientOS2 = 1;
        int clientDeviceYear = LocalDate.now().getYear();
        installApp(clientOS2, clientDeviceYear);
        int deliveryDistance = 70;
        int totalDay = deliveryDays(deliveryDistance);
        System.out.println(totalDay);
    }

    public static void definitionYear(int year2) {
        if (year2 < 1584) {
            System.out.println(", високосный год еще не был принят.");
        } else if ((year2 % 4 == 0 && year2 % 100 != 0) || year2 % 400 == 0) {
            System.out.println(year2 + " год - високосный год");
        } else {
            System.out.println(year2 + " год - невисокосный год");
        }
    }

    public static void installApp(int clientOS2, int clientDeviceYear) {
        if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS2 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (clientOS2 == 0) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке");
        }
    }

    public static int deliveryDays(int deliveryDistance) {
        int day = 0;
        if (deliveryDistance <= 20) {
            day += 1;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance <= 60) {
            day += 2;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance <= 100) {
            day += 3;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Доставка не осуществляется");

        }
        return day;

    }
}

