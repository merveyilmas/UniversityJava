package loops;

public class breakKomutu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kontrolDegiskeni=0;
		
		for( ; ; ) {
			System.out.println("Sonsuz d�ng�d�r..");
			if(kontrolDegiskeni==10) {
				break;
			}
			kontrolDegiskeni++;
		}
		System.out.println("break ifadesi ile d�ng�den ��kt�...");

	}

}
