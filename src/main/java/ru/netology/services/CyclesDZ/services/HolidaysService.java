package ru.netology.services.CyclesDZ.services;

public class HolidaysService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3;
                System.out.println("Месяц: " + month + " Денег: " + money + " Буду отдыхать! " + " Потратил: " + expenses + " Затем еще: " + money * 3);
            } else {
                money = money + income - expenses;
                System.out.println("Месяц: " + month + " Денег: " + money + " Придется работать! " + " Заработал: " + income + " Потратил: " + expenses);
            }
        }
        return count;
    }
}
