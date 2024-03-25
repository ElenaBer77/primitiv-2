public class Main {
    public static void main(String[] args) {
        int initial = 100;
        int payment = 3000;
        int oneBonus = 100;
        if (payment <= 1000) {
            int bonus = 0;
            System.out.println((bonus) + "-начислено бонусов");
            System.out.println((initial + payment + bonus) + "-итоговый счет");
        }
        if (payment > 1000) {
            int bonus = payment / oneBonus;
            System.out.println((bonus) + "-начислено бонусов");
            System.out.println((initial + payment + bonus) + "-итоговый счет");
        }
    }
}
