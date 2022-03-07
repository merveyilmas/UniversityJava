package arrays;

import java.util.*;

public class MultidimensionalArray {

	public static void main(String[] args) {

		int[][] array = new int[2][2];// iki satýr iki sütun
		// deðer eklemek
		array[0][0] = 10;
		array[0][1] = 20;
		array[1][0] = 30;
		array[1][1] = 40;
		System.out.println(array[0][1]);

		int[][] array2 = new int[2][2];
		// elemanlarý kullanýcýdan alýcaz
		Scanner scanner = new Scanner(System.in);

		System.out.println("Dizinin elemanlarini giriniz:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				array2[i][j] = scanner.nextInt();

			}
		}

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println(" ");
		}

	}

}
