package mathProblem;

public class �rnek7 {

	public static void main(String[] args) {
		int a = 5;
		int b = 3;
		int c = 9;
		islem("topla",a,b,c); // a+b+c
		islem("b�l",c,b); // c/b
		islem("carp",a,c); // a*c
		islem("c�kar",c,b,a); //(c-b)-a
		}
		public static void islem(String islemT�r�,int... say�lar) {
		int sonuc=0;
		if(islemT�r�.equals("topla")) {
		for(int a:say�lar) {
		sonuc+=a;
		}
		}else if(islemT�r�.equals("c�kar")) {
		sonuc=say�lar[0]*2;
		for(int a:say�lar) {
		sonuc-=a;
		}
		}else if(islemT�r�.equals("carp")) {
		sonuc=1;
		for(int a:say�lar) {
		sonuc*=a;
		}
		}else if(islemT�r�.equals("b�l")) {
		sonuc = say�lar[0]*say�lar[0];
		for(int a:say�lar) {
		sonuc/=a;
		}
		}
		System.out.println("��lem sonucu: "+sonuc);
		}

}
