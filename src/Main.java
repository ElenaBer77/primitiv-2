public class Main {
    public static void main(String[] args) {
        int initial = 200; //начальный счет
        int payment = 1500; //сумма пополнения
        int oneBonus = 100; //100 рублей =1 бонус
        int bonus;
        if (payment > 1000) {
            bonus = payment / oneBonus;
        } else {
            bonus = 0;
        }
        System.out.println((bonus) + "-начислено бонусов");
        System.out.println((initial + payment + bonus) + "-итоговый счет");
    }
}
