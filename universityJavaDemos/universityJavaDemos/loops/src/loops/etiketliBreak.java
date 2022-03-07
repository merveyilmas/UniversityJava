package loops;

public class etiketliBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cikis:
			for(int birinciSayi=1;birinciSayi<=4;birinciSayi++) {
				for(int ikinciSayi=1;ikinciSayi<=4;ikinciSayi++) {
					System.out.println("birinci sayi:"+birinciSayi+"ÝkinciSayi:"+ikinciSayi);
					if(birinciSayi+ikinciSayi==6) {
						break cikis; //bunun continue sý da var!!
					}
				}
			}

	}

}
