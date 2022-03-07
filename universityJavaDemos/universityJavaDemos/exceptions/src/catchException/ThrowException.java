package catchException;

import java.util.*;

public class ThrowException {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("lütfen yaþýnýzý girin...");
		int yas = scanner.nextInt();

		// mekan_kontrol(yas);

		try {
			mekan_kontrol(yas);
		} catch (ArithmeticException e) {
			System.out.println("18 yaþýndan küçükler mekana giremez...");
		}

	}

	public static void mekan_kontrol(int yas) {
		if (yas < 18) {
			throw new ArithmeticException();// hata fýrlatýlýr

		} else {
			System.out.println("mekana hoþgeldiniz...");
		}

	}

}
