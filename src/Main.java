public class Main {
    public static void main(String[] args) {

        int balance = 100; // баланс пользователя
        double plus = 300; // сумма пополнения
        double bonus = plus / 100; // колличество бонусных рублей


        if (plus >= 1000) {
            System.out.println(balance + plus + bonus);
        } else {
            System.out.println(balance + plus);
        }

    }
}