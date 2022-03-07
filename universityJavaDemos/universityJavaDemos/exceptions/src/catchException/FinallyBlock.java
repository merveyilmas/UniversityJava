package catchException;

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			String s = null; // String str = “Ayþegül”;
			System.out.println(s.length()); // int a = 30/0;
		} catch (NullPointerException e) {
			System.out.println("null referans hatasý..");
		} finally {// mutlaka çalýþýr
			System.out.println("finally bloðu çalýþýyor...");
		}
		System.out.println("burasý çalýþýyor...");

	}

}
