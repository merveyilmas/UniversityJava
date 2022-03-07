package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void diziyiBastir(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("dizi[" + i + "]:" + a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] dizi = { 5, 8, 4, 7, 4, 9 };

		Arrays.sort(dizi);

		diziyiBastir(dizi);

	}

}
