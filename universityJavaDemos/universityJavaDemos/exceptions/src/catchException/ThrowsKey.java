package catchException;

import java.io.IOException;
import java.util.*;;

public class ThrowsKey {

	public static void mekan_kontrol(int yas) throws IOException {
		if (yas < 18)
			throw new IOException();

		else {
			System.out.println("mekana ho�geldiniz...");
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("l�tfen ya��n�z� girin...");
		int yas = scanner.nextInt();
		mekan_kontrol(yas);
		/*
		 * try { mekan_kontrol(yas);// mutlaka yakalamal� ve kullanmal�y�z.
		 * 
		 * } catch (IOException ex) { System.out.println("IO excep olu�tu..."); }
		 */
	}

}
