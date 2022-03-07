package homework;

import java.util.*;

public class Question1 {
	public static int hesap(int x, int y) {
		int sonuc = 0;

		if (x < 0 && y < 0) {
			sonuc = (4 * x) + (2 * y) + 4;
		} else if (x > 0 && y == 0) {
			sonuc = (2 * x) - y - 3;
		} else if (x < 0 && y > 0) {
			sonuc = (3 * x) + (4 * y) + 3;
		}
		return sonuc;
	}

	public static void main(String[] args) {

		int a, b;

		Scanner klavye = new Scanner(System.in);

		System.out.println("Birinci sayiyi giriniz:");
		a = klavye.nextInt();

		System.out.println("Ýkinci sayiyi giriniz:");
		b = klavye.nextInt();

		System.out.println("Sonuc=" + hesap(a, b));

	}

}
