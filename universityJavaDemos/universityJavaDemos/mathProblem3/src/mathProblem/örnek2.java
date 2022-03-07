package mathProblem;
import java.util.*;
public class örnek2 {

	public static void main (String[] Args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Dizi boyutunu girin: ");
		int boyut=input.nextInt();
		int[] sayiDizisi = new int[boyut];
		for(int i=0;i<boyut;i++) {
		System.out.print((i+1)+". Sayýyý giriniz: ");
		sayiDizisi[i]=input.nextInt();
		}
		for(int i=0;i<boyut;i++) {
		System.out.println(sayiDizisi[i]+" -> "+fonksiyon(sayiDizisi[i]));
		}
		}
		public static int fonksiyon(int x) {
		if(x%2==1) {
		return x*2;
		}else {
		return x/2;
		}
		}

}
