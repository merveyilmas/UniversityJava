package arrays;

public class UseForEachLoop {

	public static void main(String[] args) {

		String[] array = { "elma", "armut", "kiraz" };

		for (String a : array) {// a array in t�m de�erlerine sahip olur
			System.out.println(a);
		}
		// normal for d�ng�s�nden �ok daha kolay bir kullan�m

		int[] array2 = { 1, 2, 3, 4, 5, 6, 7 };

		for (int i : array2) {
			System.out.println(i);
		}

	}
}
