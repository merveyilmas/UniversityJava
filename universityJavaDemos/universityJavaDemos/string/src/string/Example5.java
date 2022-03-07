package string;

import java.util.*;

public class Example5 {

	public static void main(String[] args) {

		int[] dizi = { 20, 20, 30, 40, 50, 50 };
		int size = 1;

		for (int i = 0; i < dizi.length - 1; i++) {
			if (dizi[i] != dizi[i + 1])
				size += 1;
		}
		System.out.println(size);

	}
}