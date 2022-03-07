package arrays;

public class DescribeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		int[] b = { 1, 2, 3, 4, 5, 6 };

		for (int i = 0; i < b.length; i++) {
			System.out.println("b[" + i + "]:" + b[i]);
		}

		System.out.println("........................");
		System.out.println("Diziniz uzunlugu:" + b.length);
		System.out.println("........................");

		for (int j = 0; j < a.length; j++) {
			a[j] = j * 2;
		}

		for (int k = 0; k < a.length; k++) {
			System.out.println("a[" + k + "]:" + a[k]);
		}

		System.out.println("........................");
		System.out.println("Diziniz uzunlugu:" + a.length);
		System.out.println("........................");

	}

}
