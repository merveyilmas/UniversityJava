package catchException;

public class TryCatchlBlock2 {

	public static void main(String[] args) {
		try {
			int a = 30 / 0;// ArithmeticException
			int[] b = { 1, 2, 3, 4, 5 };
			System.out.println(b[6]);// ArrayIndexOutOfBound
		} catch (ArithmeticException e) {
			System.out.println("bir say� s�f�ra b�l�nemez...");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("arrayin boyunu a�t�n�z...");
		} catch (Exception e) {
			System.out.println("bir hata olu�tu...");
		}
		System.out.println("buras� �al���yor....");

	}

}
