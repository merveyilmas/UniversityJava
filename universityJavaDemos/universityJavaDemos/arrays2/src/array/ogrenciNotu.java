package array;

import java.util.*;

public class ogrenciNotu {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		System.out.println("öðrenci sayisi giriniz:");
		int ogrsayisi = klavye.nextInt();

		int[] notlar = new int[ogrsayisi];

		int eniyi = 0;

		for (int i = 0; i < notlar.length; i++) {
			System.out.println((i + 1) + ". öðrenci notu:");
			notlar[i] = klavye.nextInt();
			if (notlar[i] > eniyi)
				eniyi = notlar[i];
		}

		for (int i = 0; i < notlar.length; i++) {

			if (notlar[i] >= (eniyi - 10))
				System.out.println("öðrenci " + (i + 1) + " notu:" + notlar[i] + " harf notu:A");

			else if (notlar[i] >= (eniyi - 20))
				System.out.println("öðrenci " + (i + 1) + " notu:" + notlar[i] + " harf notu:B");

			else if (notlar[i] >= (eniyi - 30))
				System.out.println("öðrenci " + (i + 1) + " notu:" + notlar[i] + " harf notu:C");

			else if (notlar[i] >= (eniyi - 40))
				System.out.println("öðrenci " + (i + 1) + " notu:" + notlar[i] + " harf notu:D");

			else
				System.out.println("öðrenci " + (i + 1) + " notu:" + notlar[i] + " harf notu:F");

		}
	}

}
