package array;
import java.util.*;
public class diziMetod2 {

	public static void main(String[] args) {
		
		Scanner klavye=new Scanner(System.in);
		int diziBoyutu,sonuc;
		
		System.out.println("Dizi boyutunu giriniz:");
		diziBoyutu=klavye.nextInt();
		
		int [] dizi=new int[diziBoyutu];
		
		for(int i=0;i<dizi.length;i++){
		System.out.println("Dizinin "+(i+1)+".eleman�:");
		dizi[i]=klavye.nextInt();
		}
		b�y�kK�c�k(dizi,dizi.length);
		}
	
		private static void b�y�kK�c�k(int[] dizi, int length) {
			
		for(int i=0;i<length;i++){
		if(dizi[i]==10){
		System.out.println("Dizinin "+(i+1)+".eleman� 10'a e�ittir:"+dizi[i]);
		}
		else if(dizi[i]<10){
		System.out.println("Dizinin "+(i+1)+".eleman� 10'dan k���kt�r:"+dizi[i]);
		}
		else{
		System.out.println("Dizinin "+(i+1)+".eleman� 10'dan b�y�kt�r:"+dizi[i]);
		}
		}
		}
}
