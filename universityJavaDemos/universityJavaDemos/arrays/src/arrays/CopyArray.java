package arrays;

public class CopyArray {

	public static void diziyiBastir(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("dizi[" + i + "]:" + a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dizi1 = { 1, 2, 3, 4 };
		int[] dizi2 = new int[dizi1.length];

		System.arraycopy(dizi1, 0, dizi2, 0, 4);

		diziyiBastir(dizi2);

	}

}
