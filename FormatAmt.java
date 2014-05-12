import java.io.IOException;
import java.util.Scanner;

public class FormatAmt {

	private String formattedDollar = new String();
	private String formattedCents = new String();
	private static Scanner s;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
		FormatAmt f = new FormatAmt();
		System.out.print("Enter Dollars:");
		int dol = s.nextInt();
		System.out.print("Enter Cents:");
		int cent = s.nextInt();
		System.out.print(f.amount(dol, cent));
	}

	public String amount(int dollars, int cents) {

		String amt = new String();
		String dol = Integer.toString(dollars);
		String cent = Integer.toString(cents);

		if (cent.length() < 2) {
			formattedCents = "0" + cent;
		} else {
			formattedCents = cent;
		}

		if ((dol.length() < 2 && dollars != 0)) {
			formattedDollar = "$0" + dol;
		} else {
			if (dol.length() >= 4) {
				int count = 0;
				for (int i = dol.length() - 1; i >= 0; i--) {
					count++;
					if (count == 3 && i != 0) {
						count = 0;
						dol = new StringBuilder(dol).insert(i, ",").toString();
						formattedDollar = "$" + dol;
					}
				}
			} else {
				formattedDollar = "$" + dol;
			}
		}
		amt = formattedDollar + "." + formattedCents;
		return amt;
	}

}
