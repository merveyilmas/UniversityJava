package arrays;

import java.util.*;

public class GetValuetoArray {

	public static int[] diziyiDoldur(int sayi) {

		System.out.println("Dizinin elemanlarini giriniz:");
		Scanner klavye = new Scanner(System.in);

		int[] cikti = new int[sayi];

		for (int i = 0; i < sayi; i++) {
			cikti[i] = klavye.nextInt();
		}
		return cikti;
	}

	public static void diziyiBastir(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("dizi[" + i + "]:" + a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner klavye = new Scanner(System.in);
		int a;
		System.out.println("Dizinin boyutunu giriniz:");
		a = klavye.nextInt();

		int[] b = diziyiDoldur(a);
		diziyiBastir(b);

	}

}
