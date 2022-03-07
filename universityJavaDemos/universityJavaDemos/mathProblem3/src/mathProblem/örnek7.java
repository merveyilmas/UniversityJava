package mathProblem;

public class örnek7 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = 9;
		islem("topla",a,b,c); // a+b+c
		islem("böl",c,b); // c/b
		islem("carp",a,c); // a*c
		islem("cýkar",c,b,a); //(c-b)-a
		}
		public static void islem(String islemTürü,int... sayýlar) {
		int sonuc=0;
		if(islemTürü.equals("topla")) {
		for(int a:sayýlar) {
		sonuc+=a;
		}
		}else if(islemTürü.equals("cýkar")) {
		sonuc=sayýlar[0]*2;
		for(int a:sayýlar) {
		sonuc-=a;
		}
		}else if(islemTürü.equals("carp")) {
		sonuc=1;
		for(int a:sayýlar) {
		sonuc*=a;
		}
		}else if(islemTürü.equals("böl")) {
		sonuc = sayýlar[0]*sayýlar[0];
		for(int a:sayýlar) {
		sonuc/=a;
		}
		}
		System.out.println("Ýþlem sonucu: "+sonuc);
		}

}
