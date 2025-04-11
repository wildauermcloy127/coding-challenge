public class CodeChallengeExample {
    public static void main(String[] args) {
        // Example of variable declarations and assignments
        int num1 = 5;
        double num2 = 3.14;
        String str = "Hello, World!";
        
        // Example of loop iterations
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        // Example of conditional statements and loops
        if (num1 > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is not positive.");
        }
        
        // Example of exception handling
        try {
            System.out.println(5 / 2);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
