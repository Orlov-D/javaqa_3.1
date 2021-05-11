public class Main {
    public static void main(String[] args) {
        int price = 125;
        int bonus;
        if (price % 20 == 0) bonus=price/20; else bonus=(price-price%20)/20;
            System.out.println(bonus);
    }
}