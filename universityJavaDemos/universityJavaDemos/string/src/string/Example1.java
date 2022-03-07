package string;

import java.util.*;

public class Example1 {

	public static void diziyiBastir(int... array) {

		for (int a : array) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {

		int[] dizi = { 0, 0, 1, 1, 0, 1, 1, 1, 0 };
		
		System.out.println("dizimiz:");
		diziyiBastir(dizi);
		
		System.out.println(" ");
		
		System.out.println("0 lar ve 1 ler bir yanda yeni dizimiz:");
		Arrays.sort(dizi);
		diziyiBastir(dizi);

	}
}
