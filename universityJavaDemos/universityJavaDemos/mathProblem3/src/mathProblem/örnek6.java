package mathProblem;

public class �rnek6 {
	public static void main(String[] args) {
		int a=5;
		int b=7;
		int c=9;
		topla(a,b);// 12
		topla(b,c,a);// 21
		topla(b,c);// 16
		topla(c);// 9
		}
		public static void topla(int... say�lar) {
		int toplam=0;
		for(int a:say�lar) {
		toplam+=a;
		}
		System.out.println("Toplam: "+toplam);
		}
}
