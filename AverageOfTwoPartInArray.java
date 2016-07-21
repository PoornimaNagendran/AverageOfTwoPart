import java.util.Scanner;
public class AverageOfTwoPartInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = s.nextInt();
		int count[] = new int[n];
		System.out.println("enter array element");
		for (int i = 0; i < n; i++) {
			count[i] = s.nextInt();
		}
		int s1 = 0;
		int s2 = 0;
		int c1 = 0;
		for (int i = 0; i < n / 2; i++) {
			s1 = s1 + count[i];
			++c1;
		}
		int a1 = s1 / c1;
		int c2 = 0;
		for (int i = n / 2; i < n; i++) {
			s2 = s2 + count[i];
			++c2;
		}
		int a2 = s2 / c2;
		if (a1 == a2) {
			System.out.println("2part of array Average is Equal");
		} else {
			System.out.println("2partAverage is not equal");

	}

}
}