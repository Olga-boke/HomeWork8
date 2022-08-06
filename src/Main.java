public class Main {
    public static void main(String[] args) {
        int year = 2022;
        isLeapYearAndPrint(year);

        int clientOS = 0;
        checkAndPrintSuitebelOS(clientOS, year);

        int deliveryDistance = 105;
        calculateDeliveryDistance( deliveryDistance);
        System.out.println(calculateDeliveryDistance(deliveryDistance) + " дня");
    }


    public static void isLeapYearAndPrint(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(" Год високосный ");
        } else {
            System.out.println(" Год не високосный");
        }
    }

    public static void checkAndPrintSuitebelOS(int clientOS, int year) {
        if (clientOS == 0 && year == 2022) {
            System.out.println(" Установите современную версию для IOS");
        } else if (clientOS == 0 && year < 2022) {
            System.out.println(" Установите облегченную версию для IOS");
        } else if (clientOS != 0 && year < 2022) {
            System.out.println(" Установите облегченную версию для Андроид");
        } else if (clientOS !=0 && year ==2022) {
            System.out.println(" Установите современную версию для Андроид");
        }

    }
    public static int calculateDeliveryDistance(int distance){
        if (distance<20&& distance>0){
            return 1;
        }else if (distance<60 && distance>=20){
            return 2;
        } else if (distance< 100 && distance>=60){
            return 3;
        } else {
            return -111111111;
        }

    }
}