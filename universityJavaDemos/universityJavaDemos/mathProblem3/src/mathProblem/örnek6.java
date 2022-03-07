package mathProblem;

public class örnek6 {
	public static void main(String[] args) {
		int a=5;
		int b=7;
		int c=9;
		topla(a,b);// 12
		topla(b,c,a);// 21
		topla(b,c);// 16
		topla(c);// 9
		}
		public static void topla(int... sayýlar) {
		int toplam=0;
		for(int a:sayýlar) {
		toplam+=a;
		}
		System.out.println("Toplam: "+toplam);
		}
}
