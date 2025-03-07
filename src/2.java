import java.util.Random;
public class GenerateCode {
	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(100);
		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}