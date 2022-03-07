package homework;

import java.util.Scanner;

public class Question2 {

	public static int armstrongSayi(int sayi, int basamak) {
		int sonuc = 0;

		return sonuc;

		// if() {}

	}

	public static void main(String[] args) {

		int basDegeri, sayii;

		Scanner klavye = new Scanner(System.in);

		System.out.println("Sayini basamak sayýsýný giriniz:");
		basDegeri = klavye.nextInt();

		System.out.println("Sayiyi giriniz:");
		sayii = klavye.nextInt();

		System.out.println("Sonuc:" + armstrongSayi(basDegeri, sayii));

	}
}
