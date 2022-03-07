package binarySearch;

import java.util.*;
import java.text.DecimalFormat;

public class BinarySearch {
	public static boolean esikKontrol(double esik1) {
		
		if(esik1>0 && esik1<=1) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void ikiliArama(double aranan) {
		
		Random random = new Random();
		BinarySearch sayicevir = new BinarySearch();
		// Scanner klavye = new Scanner(System.in);

		double[] dizi = new double[10];

		// System.out.println("dizi elemaný gir:");

		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = random.nextDouble();
		}
		
		System.out.println("dizi degerleri:");
		for (int i = 0; i < dizi.length; i++) {
			System.out.println("dizi["+i+"]="+dizi[i]);
		}

		Arrays.sort(dizi);
		
		System.out.println(" ");
		System.out.println("Dizinin sýralanmýþ ve 3 basamaklý hali");
		for (int m = 0; m < dizi.length; m++) {
			System.out.print("dizi["+m+"]=");
			dizi[m] = sayicevir.ondalik(dizi[m], 3);

		}

	

		int boyut = dizi.length;
		int enkucukindis = 0;
		int enbuyukindis = boyut - 1;

		while (enbuyukindis >= enkucukindis) {
			int orta = (enkucukindis + enbuyukindis) / 2;
			if (dizi[orta] == aranan) {
				System.out.println("aranan sayi bulundu!=dizi["+orta+"]="+dizi[orta]);
				break;
			}
			if (dizi[orta] < aranan) {
				enkucukindis = orta + 1;
			}
			if (dizi[orta] > aranan) {
				enbuyukindis = orta - 1;
			}
		}
		
	}

	public double ondalik(double sayi, int ondalikAdedi) {
		String ondalikBicimi = "##.";
		String sayi1;
		for (int i = 0; i < ondalikAdedi; i++) {
			ondalikBicimi += "#";
		}
		System.out.println((new DecimalFormat(ondalikBicimi).format(sayi)).replace(',', '.'));
		sayi1 = (new DecimalFormat(ondalikBicimi).format(sayi)).replace(',', '.');
		double sayi2 = Double.valueOf(sayi1);
		return sayi2;
	}

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);

		double esik;
		double aranan;

		System.out.println("(0<eþik<=1)arasýnda eþik deðerini giriniz:");
		esik = klavye.nextDouble();
		
		System.out.println(esikKontrol(esik));

		System.out.println("Aranan sayiyi giriniz:");
		aranan = klavye.nextDouble();

		ikiliArama(aranan);

	}

}
