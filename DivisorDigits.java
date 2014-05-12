import java.io.IOException;
import java.util.Scanner;

public class DivisorDigits {

	private static Scanner s;
	public static void main(String[] args) throws IOException{

		s = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = s.nextInt();
		DivisorDigits d = new DivisorDigits();
		System.out.print(" answer: " + d.howMany(n));
	}
	public int howMany(int number) {
		int count = 0;

		String num = Integer.toString(number);
		for (int i = 0; i < num.length(); i++) {

			int digit = Character.getNumericValue(num.charAt(i));
			if (digit != 0) {
				int divisible = number % digit;
				if (divisible == 0) {
					count++;
				}
			}
		}
		return count;
	}
}
