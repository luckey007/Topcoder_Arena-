import java.util.Scanner;

public class WidgetRepairs {

	private static Scanner s;

	public static void main(String[] args) {

		s = new Scanner(System.in);
		WidgetRepairs w = new WidgetRepairs();
		System.out.print("Enter total no of arrival days");
		int arrdays = s.nextInt();
		int arr[] = new int[arrdays];
		System.out.print("Enter arrivals");
		for (int i = 0; i < arr.length; i++) {
			 arr[i] = s.nextInt();
		}
		System.out.print("Enter number of repair per day");
		int days = s.nextInt();
	    System.out.print(w.days(arr, days));
		
	}

	public int days(int[] arrivals, int numPerDay) {
		int actualDays = 0;
		int noOfRepairsRemaining = 0;
		for (int i = 0; i < arrivals.length; i++) {
			int tempDays = 0;
			if(arrivals[i] % numPerDay == 0){
				tempDays = arrivals[i] / numPerDay;
				actualDays += tempDays;
			}
			else{
				noOfRepairsRemaining = arrivals[i] % numPerDay;
				int temp = i;
				int tempIndex = temp + 1;
				arrivals[tempIndex] += noOfRepairsRemaining;
				tempDays = (int) Math.floor(arrivals[i] / numPerDay);
				actualDays += tempDays;
			}
		}
		return actualDays;
	}
}
