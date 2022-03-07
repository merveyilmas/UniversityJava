package catchException;

public class TryCatchBlock {

	public static void main(String[] args) {

		try {
			int a = 30 / 0;// ArithmeticException

		} catch (ArithmeticException e) {// Exception �st s�n�f� yaz�labilir
			System.out.println("bir say� s�f�ra b�l�nemez...");
			System.out.println(" Olu�an hata. : " + e.getMessage());
			e.printStackTrace();

		}
		System.out.println("buras� �al���yor....");
		System.out.println("*******************************");

		try {
			int[] a = { 1, 2, 3, 4, 5 };
			System.out.println(a[6]);// ArrayIndexOutOfBound
		} catch (Exception e) {// ArrayIndexOutOfBoundsException
			System.out.println("arrayin boyunu a�t�n�z...");
			System.out.println("Olu�an Hata. :" + e.toString());
			e.printStackTrace();

		}
		System.out.println("buras� �al���yor....");
		System.out.println("*******************************");

		try {
			int a = 30 / 0;// ArithmeticException
			int[] b = { 1, 2, 3, 4, 5 };
			System.out.println(b[6]);// ArrayIndexOutOfBound
		} catch (Exception e) {
			System.out.println("bir hata olu�tu...");

		}
		System.out.println("buras� �al���yor....");

	}

}
