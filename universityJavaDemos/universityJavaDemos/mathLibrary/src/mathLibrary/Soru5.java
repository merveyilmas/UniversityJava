package mathLibrary;

import java.util.Random;
import java.util.Scanner;

public class Soru5 {
	public static void main(String[] args) {
		int para1, para2, zar1, zar2, tur = 0;
		Random rnd = new Random();
		Scanner in = new Scanner(System.in);
		System.out.print("1.oyuncunun para miktar: ");
		para1 = in.nextInt();
		System.out.print("\n2.oyuncunun para miktar: ");
		para2 = in.nextInt();
		in.nextLine();/* bug oldu�u i�in gerekli �al��m�yor zaten */
		do {
			tur++;
			System.out.println("\n# " + tur + ". Turdas�n�z.");
			zar1 = rnd.nextInt(6) + 1;
			zar2 = rnd.nextInt(6) + 1;
			System.out.println("\t1.Oyuncunun Att��� Zar = " + zar1);
			System.out.println("\t2.Oyuncunun Att��� Zar = " + zar2);
			System.out.println("\t\tZarlar aras�ndaki fark = " + Math.abs(zar1 - zar2));
			if (zar1 < zar2) {
				para1 -= (zar2 - zar1);
				System.out.println("\t1. Oyuncunun kalan paras� = " + para1);
			} else if (zar2 < zar1) {
				para2 -= (zar1 - zar2);
				System.out.println("\t2. Oyuncunun kalan paras� = " + para2);
			} else {
				System.out.println("\tZarlar E�it");
			}
			if (para1 > 0 && para2 > 0) {
				System.out.print("Zar atmak i�in enter bas�n�z");
				in.nextLine();
			}
		} while (para1 > 0 && para2 > 0);

		if (para1 > 0) {
			System.out.println("\n\n(*.*) 1.Oyuncu " + tur + ". turda Kazand�. (*.*)");
		} else {
			System.out.println("\n\n(*.*) 2.Oyuncu " + tur + ". turda Kazand�. (*.*)");
		}
	}
}
