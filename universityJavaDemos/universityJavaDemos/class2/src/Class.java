import java.util.Scanner;

public class Class {
	private int[] ogrenciNotu;
	private float ort = 0;
	int max, min;

	public Class(int[] notlar) {
		ogrenciNotu = notlar;
	}

	public void DisplayMessage(String ders) {
		System.out.println("Welcome To " + ders + " Class");

	}

	public void NotYazdir() {
		for (int i = 0; i < ogrenciNotu.length; i++) {
			System.out.println("�grenci[" + i + "] = " + ogrenciNotu[i]);
		}
	}

	public float OrtalamaBul() {
		for (int i = 0; i < ogrenciNotu.length; i++) {
			ort += ogrenciNotu[i];
		}
		ort /= ogrenciNotu.length;
		return ort;
	}

	public int GetMaxNot() {
		max = ogrenciNotu[0];
		for (int i = 1; i < ogrenciNotu.length; i++) {
			max = (max < ogrenciNotu[i]) ? ogrenciNotu[i] : max;
		}
		return max;
	}

	public int GetMinNot() {
		min = ogrenciNotu[0];
		for (int i = 1; i < ogrenciNotu.length; i++) {
			min = (min > ogrenciNotu[i]) ? ogrenciNotu[i] : min;
		}
		return min;
	}

	public void SonucYazdir() {
		NotYazdir();
		System.out.println(
				"Ortalama : " + OrtalamaBul() + "\nEn Buyuk Not : " + GetMaxNot() + "\nEn Kucuk Not : " + GetMinNot());
	}

	public static void main(String[] args) {
		int[] notlar = new int[10];
		String ders;
		Scanner s = new Scanner(System.in);
		System.out.print("Ders ismi : ");
		ders = s.next();

		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) + ". �grencinin notunu giriniz : ");
			notlar[i] = s.nextInt();
		}
		Class newGB = new Class(notlar);
		newGB.DisplayMessage(ders);
		newGB.SonucYazdir();

	}

}
