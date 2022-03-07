package arrays;

public class ArraySendtoFunction {

	public static void diziyiBastir(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("dizi[" + i + "]:" + a[i]);
		}
	}

	public static void main(String[] args) {
		int[] dizi = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		diziyiBastir(dizi);

	}

}
