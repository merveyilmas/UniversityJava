package catchException;

import java.util.*;

public class ThrowException {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("l�tfen ya��n�z� girin...");
		int yas = scanner.nextInt();

		// mekan_kontrol(yas);

		try {
			mekan_kontrol(yas);
		} catch (ArithmeticException e) {
			System.out.println("18 ya��ndan k���kler mekana giremez...");
		}

	}

	public static void mekan_kontrol(int yas) {
		if (yas < 18) {
			throw new ArithmeticException();// hata f�rlat�l�r

		} else {
			System.out.println("mekana ho�geldiniz...");
		}

	}

}
