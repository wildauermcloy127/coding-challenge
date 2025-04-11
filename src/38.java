public class RandomCodeGenerator {
    public static void main(String[] args) {
        // Generate and print a random integer between 1 and 50
        System.out.println("Random number: " + (int)(Math.random() * 50) + ". . .");
        // Generate and print a random floating-point number between 0.9 and 1.2
        System.out.printf("%.4f", Math.random() * 30 - 18);
    }
}
