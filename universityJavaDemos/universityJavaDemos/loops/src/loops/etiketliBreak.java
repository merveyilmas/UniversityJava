package loops;

public class etiketliBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cikis:
			for(int birinciSayi=1;birinciSayi<=4;birinciSayi++) {
				for(int ikinciSayi=1;ikinciSayi<=4;ikinciSayi++) {
					System.out.println("birinci sayi:"+birinciSayi+"�kinciSayi:"+ikinciSayi);
					if(birinciSayi+ikinciSayi==6) {
						break cikis; //bunun continue s� da var!!
					}
				}
			}

	}

}
