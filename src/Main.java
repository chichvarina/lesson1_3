public class Main {
    public static void main(String[] args) {
        /////
        //Задание 1
        int clientOS=0;

        if (clientOS==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS==1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2
        int clientDeviceYear=2013;

        if (clientOS==0){
            if (clientDeviceYear<2015){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

        if (clientOS==1){
            if (clientDeviceYear<2015){
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        //Задание 3,
        int year=2021;
        if( (year % 4 ==0 && year % 100 !=0) || year % 400 ==0 ){

            System.out.println(year +" год является високосным ");
        }else {
            System.out.println(year +" год не является високосным ");
        }

        //Задание 4
        int deliveryDistance = 95;
        int day=1;

        if (deliveryDistance<=20){
            System.out.println("Потребуется дней: "+day);

        }else if(deliveryDistance<60){
            System.out.println("Потребуется дней: "+(day+1));


        }else if (deliveryDistance<100) {
            System.out.println("Потребуется дней: "+(day+2));

        }

        //Задание 5

        int monthNumber=12;
        switch (monthNumber){
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("Такого месяца нет");

        }

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Соответствует сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Соответствует сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Соответствует сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Соответствует сезону осень");
                break;

        }
        //Задание 6
        int age = 19;
        int salary = 58000;
        if (age >= 23) {
            if (salary >= 80000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3 * 1.5) + " рублей");
            } else if (salary >= 50000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3 * 1.2) + " рублей");
            }else{
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3) + " рублей");
            }
        }else{
            if (salary >= 80000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2 * 1.5) + " рублей");
            } else if (salary >= 50000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2 * 1.2) + " рублей");
            }else{
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2) + " рублей");
            }
        }
        //Задача 7

        age = 25;
        salary = 60_000;
        float wantedSum = 330_000f;
        float procent = 0.1f;

        if(age<23){
            procent = procent + 0.01f;
        }else if(age<30){
            procent = procent + 0.005f;
        }

        if(salary>80000){
            procent=procent-0.007f;
        }
        float payment=wantedSum * procent/12f + wantedSum/12f;
        if(payment > 0.5f*salary){
            System.out.println("Максимальный платеж при ЗП "+ salary + " равен " +(0.5f*salary)+
                    " рублей. Платеж по кредиту " +payment+ " рублей. Отказано");
        }else {
            System.out.println("Максимальный платеж при ЗП "+ salary + " равен " +(0.5f*salary)+
                    " рублей. Платеж по кредиту " +payment+ " рублей. Одобрено");
        }

    /////
    }
}