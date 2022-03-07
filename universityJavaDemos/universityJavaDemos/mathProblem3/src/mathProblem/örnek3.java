package mathProblem;

public class örnek3 {
	public static void main(String[] args) {
		int[] sayiDizisi = {5,2,7,8,1,7,6};
		int[] sayiDizisi2 = {4,7,9,3,6};
		System.out.println(minMaxToplam(sayiDizisi));
		System.out.println(minMaxToplam(sayiDizisi2));
		}
		public static int minMaxToplam(int [] dizi) {
		int min = dizi[0];
		int max = dizi[0];
		for(int i=1;i<dizi.length;i++) {
		if(dizi[i]>max)max=dizi[i];
		if(dizi[i]<min)min=dizi[i];
		}
		return max+min;
		}
}
