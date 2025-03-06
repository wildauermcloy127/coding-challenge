import java.util.Random;

public class RandomCode {
    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10);
        System.out.println("Hello World!");
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}