public class Main {
    public static void main(String[] args) {
        int balace = 100; // На счёте сейчас
        int replAmount = 1100; // Сумма пополнения счёта
        int summBalance = balace + replAmount; // Сумма счёта без бонусов
        int bonus; // Бонус

        if (replAmount > 1000) {
            bonus = replAmount / 100;
        } else {
            bonus = 0;
        }

        int total = summBalance + bonus; // Итоговая сумма счёта

        System.out.println("Сумма без бонусов: " + summBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus);
        System.out.println("Итоговая сумма на счету: " + total + " рублей");

    }
}
