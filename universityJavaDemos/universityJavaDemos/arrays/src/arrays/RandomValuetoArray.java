package arrays;

import java.util.Random;

public class RandomValuetoArray {

	int[][] dizi;// global dizi

	public void ikiBoyutluDizi(int A, int B) {//

		dizi = new int[A][B];
		Random rasgele = new Random();
		int eleman = 0;
		for (int t = 0; t < dizi.length; t++) {
			for (int m = 0; m < dizi[t].length; m++) {
				eleman = rasgele.nextInt(100);
				dizi[t][m] = eleman;
			}
		}

	}

	public void ikiBoyutluDiziEkranaYaz() {

		for (int t = 0; t < dizi.length; t++) {
			for (int m = 0; m < dizi[t].length; m++) {
				System.out.print(" " + dizi[t][m]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		RandomValuetoArray nesne = new RandomValuetoArray();

		nesne.ikiBoyutluDizi(5, 4);

		nesne.ikiBoyutluDiziEkranaYaz();

	}

}
