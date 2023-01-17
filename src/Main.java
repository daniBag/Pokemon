import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int damage = 2;
        double attack = 1.4;
        int calc = (int) (damage * attack);
        System.out.println(calc);
    }
}
