package catchException;

public class FinallyBlock {

	public static void main(String[] args) {
		try {
			String s = null; // String str = �Ay�eg�l�;
			System.out.println(s.length()); // int a = 30/0;
		} catch (NullPointerException e) {
			System.out.println("null referans hatas�..");
		} finally {// mutlaka �al���r
			System.out.println("finally blo�u �al���yor...");
		}
		System.out.println("buras� �al���yor...");

	}

}
