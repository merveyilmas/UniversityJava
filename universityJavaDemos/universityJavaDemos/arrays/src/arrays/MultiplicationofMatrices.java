package arrays;

public class MultiplicationofMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 2, 1 }, { -1, 4 }, { 5, 3 } };
		int[][] b = { { 3, 2, 1, -1 }, { 4, -2, 1, 2 } };
		int[][] c = new int[3][4];

		for (int k = 0; k <= 3; k++) {
			for (int i = 0; i <= 2; i++) {
				c[i][k] = 0;

				for (int j = 0; j <= 1; j++) {
					c[i][k] += a[i][j] * b[j][k];
				}
			}
		}

		System.out.println("C matrisi");
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 3; j++)
				System.out.print(c[i][j] + "\t");
			System.out.println();
		}
	}

}
