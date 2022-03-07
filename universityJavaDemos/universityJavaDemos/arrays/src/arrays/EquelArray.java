package arrays;

import java.util.*;

public class EquelArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 1, 2, 3, 4, 5 };

		if (a1 == a2) {
			// bellekte ayný objeyi gösterip göstermediði sorgulandý
			System.out.println("Eþitler");
		} else {
			System.out.println("Eþit Deðiller");
		}
		// arraylerin içeriðini kýyaslamak için yine Array sýnýfý fonksiyonu
		// kullanýlabilir
		if (Arrays.equals(a1, a2)) {
			System.out.println("Eþitler");
		} else {
			System.out.println("Eþit Deðiller");
		}

	}

}
