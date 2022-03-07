package mathProblem;

public class örnek1 {
	public static void main(String[] args) {
		int[] sayiDizisi = {1,-5,7,3,-4};
		for(int a:sayiDizisi) {
		pozitifnegatif(a);
		}
		}
		public static void pozitifnegatif(int x) {
		if(x>0) {
		System.out.println("Sayý pozitif");
		}else if(x<0) {
		System.out.println("Sayý negatif");
		}else {
		System.out.println("Sayý nötr");
		}
		}
}
