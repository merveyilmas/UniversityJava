package array;
import java.util.*;
public class diziMetod {
	
	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in); 
		int diziBoyutu;
		System.out.println("dizi boyutunu giriniz:"); 
		diziBoyutu=klavye.nextInt(); 
		
		int[] a=new int[diziBoyutu];
		
		int toplam;
		
		for(int i=0;i<a.length;i++) {
		System.out.println("dizinin"+(i+1)+". elemanýný giriniz:");
		a[i]=klavye.nextInt();
		}
		toplam=topla_dizi(a,diziBoyutu);//dizi ve dizinin boyutunu metoda yollamamýz lazým
		System.out.println("Toplam: "+toplam);
		}
	
		static int topla_dizi(int [] x,int n){
		int toplam=0;
		for(int i=0; i<n; i++) {
		toplam+=x[i];
		}
		return toplam;
		}
}
