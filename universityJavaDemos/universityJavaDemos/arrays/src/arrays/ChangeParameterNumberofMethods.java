package arrays;

public class ChangeParameterNumberofMethods {

	public static void toplamSayi(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		System.out.println("toplam: " + toplam);
	}

	public static void main(String[] args) {

		toplamSayi(3);
		toplamSayi(3, 5, 7);
		toplamSayi(3, 5, 7, 9, 11);

	}

}
