package ru.skypro;
public class Main {
    public static void main(String[] args) {
        {
            // задача 1
            for (int i = 1; i <= 30; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + ":" + "ping pong");
                } else if (i % 3 == 0) {
                    System.out.println(i + ":" + "ping");
                } else if (i % 5 == 0) {
                    System.out.println(i + ":" + "pong");
                } else {
                    System.out.println(i);

                }
            }
        }
        {
            int a = 0;
            int b = 1;
            for (int i = 0; i < 8; i++) {
                System.out.print(a);
                System.out.print(a + b);
                System.out.println(b);
                a = b = (b + a);
            }
        }
// Задача 2
        {
            // Задача 3
            int age = 19;
            int salary = 58354;
            if (age >= 23 && salary > 50_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3) * 1.2 + "рублей");
            } else if (age < 23 && salary > 50_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2) * 1.2 + "рублей");
            } else if (age >= 23 && salary > 80_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 3) * 1.5 + "рублей");
            } else if (age < 23 && salary > 80_000) {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + (salary * 2) * 1.5 + "рублей");
            }
        }
        {
            // Задача 4
            int age = 25;
            int salary = 60_000;
            int wantedSum = 330_000;
            if (age < 23 && salary > 80_000 && salary/2 >= (wantedSum*(1.1 + 0.01 - 0.07))/12) {
                System.out.println ("Максимальный платеж при ЗП " + salary + " равен" + salary/2 + "рублей. Платеж по кредиту " + ((wantedSum*(1.1 + 0.01 - 0.07))/12) + "рублей Одобрено");
            } else if (age > 23 && age < 30 && salary > 80_000 && salary/2 >= ((wantedSum*(1.1 + 0.005 - 0.007))/12)){
                System.out.println ("Максимальный платеж при ЗП " + salary + " равен" + (salary/2) + "рублей. Платеж по кредиту " + ((wantedSum*(1.1 + 0.005 - 0.07))/12) + "рублей Одобрено");
            } else if ( age > 30 && salary > 80_000 && salary/2 >= ((wantedSum*(1.1 - 0.007))/12)){
                System.out.println ("Максимальный платеж при ЗП " + salary + " равен" + (salary/2) + "рублей. Платеж по кредиту " + ((wantedSum*(1.1- 0.07))/12) + "рублей Одобрено");
            } else if (age < 23 && salary < 80_000 && salary/2 >= (wantedSum*(1.1 + 0.01))/12) {
                System.out.println ("Максимальный платеж при ЗП " + salary + " равен" + salary/2 + "рублей. Платеж по кредиту " + ((wantedSum*(1.1 + 0.01))/12) + "рублей Одобрено");
            } else if (age > 23 && age < 30 && salary < 80_000 && salary/2 >= ((wantedSum*(1.1 + 0.005))/12)){
                System.out.println ("Максимальный платеж при ЗП " + salary + " равен" + (salary/2) + "рублей. Платеж по кредиту " + ((wantedSum*(1.1 + 0.005))/12) + "рублей Одобрено");
            } else if ( age > 30 && salary < 80_000 && salary/2 >= (wantedSum*1.1)/12){
                System.out.println ("Максимальный платеж при ЗП " + salary + " равен" + (salary/2) + "рублей. Платеж по кредиту " + ((wantedSum*1.1)/12) + "рублей Одобрено");
            } else if (age < 23 && salary > 80_000 && salary/2 < (wantedSum*(1.1 + 0.01 - 0.007))/12) {
                System.out.println ("Максимальный платеж при ЗП " + salary + " равен" + salary/2 + "рублей. Платеж по кредиту " + ((wantedSum*(1.1 + 0.01 - 0.07))/12) + "рублей Отказано");
            } else if (age > 23 && age < 30 && salary > 80_000 && salary/2 < ((wantedSum*(1.1 + 0.005 - 0.007))/12)){
                System.out.println ("Максимальный платеж при ЗП " + salary + " равен" + (salary/2) + "рублей. Платеж по кредиту " + ((wantedSum*(1.1 + 0.005 - 0.07))/12) + "рублей Отказано");
            } else if ( age > 30 && salary > 80_000 && salary/2 < ((wantedSum*(1.1 - 0.007))/12)){
                System.out.println ("Максимальный платеж при ЗП " + salary + " равен" + (salary/2) + "рублей. Платеж по кредиту " + ((wantedSum*(1.1- 0.07))/12) + "рублей Отказано");
            } else if (age < 23 && salary < 80_000 && salary/2 < (wantedSum*(1.1 + 0.01))/12) {
                System.out.println ("Максимальный платеж при ЗП " + salary + " равен" + salary/2 + "рублей. Платеж по кредиту " + ((wantedSum*(1.1 + 0.01))/12) + "рублей Отказано");
            } else if (age > 23 && age < 30 && salary < 80_000 && salary/2 < ((wantedSum*(1.1 + 0.005))/12)){
                System.out.println ("Максимальный платеж при ЗП " + salary + " равен" + (salary/2) + "рублей. Платеж по кредиту " + ((wantedSum*(1.1 + 0.005))/12) + "рублей Отказано");
            } else if ( age > 30 && salary < 80_000 && salary/2 < (wantedSum*1.1)/12){
                System.out.println ("Максимальный платеж при ЗП " + salary + " равен" + (salary/2) + "рублей. Платеж по кредиту " + ((wantedSum*1.1)/12) + "рублей Отказано");
            }
        }
    }}








