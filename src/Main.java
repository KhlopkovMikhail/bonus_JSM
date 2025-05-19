public class Main {
    public static void main(String[] args) {
        int balance_pay = 100;
        if (balance_pay > 1000) {
            int bonus = balance_pay / 100;
            System.out.println("Сумма пополнения " + balance_pay + " рублей");
            System.out.println();
            System.out.println("Бонус " + bonus + " рублей");
            System.out.println();
            System.out.println("Итоговый баланс " + (balance_pay + bonus) + " рублей");
        } else {
            System.out.println("Сумма пополнения " + balance_pay + " рублей");
            System.out.println();
            System.out.println("Бонус 0 рублей" );
            System.out.println();
            System.out.println("Итоговый баланс " + balance_pay + " рублей");
        }
    }
}
