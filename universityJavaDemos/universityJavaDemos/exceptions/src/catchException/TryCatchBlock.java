package catchException;

public class TryCatchBlock {

	public static void main(String[] args) {

		try {
			int a = 30 / 0;// ArithmeticException

		} catch (ArithmeticException e) {// Exception üst sýnýfý yazýlabilir
			System.out.println("bir sayý sýfýra bölünemez...");
			System.out.println(" Oluþan hata. : " + e.getMessage());
			e.printStackTrace();

		}
		System.out.println("burasý çalýþýyor....");
		System.out.println("*******************************");

		try {
			int[] a = { 1, 2, 3, 4, 5 };
			System.out.println(a[6]);// ArrayIndexOutOfBound
		} catch (Exception e) {// ArrayIndexOutOfBoundsException
			System.out.println("arrayin boyunu aþtýnýz...");
			System.out.println("Oluþan Hata. :" + e.toString());
			e.printStackTrace();

		}
		System.out.println("burasý çalýþýyor....");
		System.out.println("*******************************");

		try {
			int a = 30 / 0;// ArithmeticException
			int[] b = { 1, 2, 3, 4, 5 };
			System.out.println(b[6]);// ArrayIndexOutOfBound
		} catch (Exception e) {
			System.out.println("bir hata oluþtu...");

		}
		System.out.println("burasý çalýþýyor....");

	}

}
