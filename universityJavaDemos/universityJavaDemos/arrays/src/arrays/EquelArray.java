package arrays;

import java.util.*;

public class EquelArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2 = { 1, 2, 3, 4, 5 };

		if (a1 == a2) {
			// bellekte ayn� objeyi g�sterip g�stermedi�i sorguland�
			System.out.println("E�itler");
		} else {
			System.out.println("E�it De�iller");
		}
		// arraylerin i�eri�ini k�yaslamak i�in yine Array s�n�f� fonksiyonu
		// kullan�labilir
		if (Arrays.equals(a1, a2)) {
			System.out.println("E�itler");
		} else {
			System.out.println("E�it De�iller");
		}

	}

}
