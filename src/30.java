public class RandomCodeGenerator {
    public static void main(String[] args) {
        // Example 1: Generate two random numbers between 0 and 99
        int num1 = (int)(Math.random() * 100);
        int num2 = (int)(Math.random() * 100);
        System.out.println("Random number 1: " + num1);
        System.out.println("Random number 2: " + num2);

        // Example 2: Generate two random integers between -99 and 99
        int min = -99;
        int max = 99;
        int num3 = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println("Random number 3: " + num3);

        // Example 3: Generate a random string of 5 characters
        String randomString = generateRandomString(5);
        System.out.println(randomString);
    }

    /**
     * Generates a random string with the specified length.
     * @param length The length of the generated string.
     * @return A random string of the given length.
     */
    private static String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = new Random().nextInt(characters.length());
            sb.append(characters.charAt(randomIndex));
        }
        return sb.toString();
    }
}
