public class CodingChallenge {
    public static void main(String[] args) {
        // Randomly select an element from the array
        int randomNumber = (int)(Math.random() * 100);

        if (randomNumber < 50) {
            System.out.println("The number is less than or equal to 50.");
        } else {
            System.out.println("The number is greater than 50.");
        }
    }
}
