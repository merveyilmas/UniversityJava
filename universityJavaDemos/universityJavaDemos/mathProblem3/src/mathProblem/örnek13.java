package mathProblem;

public class �rnek13 {
	public static void main(String[] args) {
		int[] dizi = {1,2,3,4};
		int[] kopya = new int[dizi.length]; 
		int[] kopya2 = new int[dizi.length];
		//y�ntem 1
		for(int i=0; i<dizi.length;i++) {
		kopya[i]=dizi[i];
		}
		//y�ntem 2
		System.arraycopy(dizi, 0, kopya2, 0, 4);
		for(int i=0;i<dizi.length;i++) {
		System.out.println("kopya["+i+"]="+kopya[i]);
		System.out.println("kopya2["+i+"]="+kopya2[i]);
		}
		}
}
