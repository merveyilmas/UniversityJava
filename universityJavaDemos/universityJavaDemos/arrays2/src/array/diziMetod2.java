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
		System.out.println("Dizinin "+(i+1)+".elemaný:");
		dizi[i]=klavye.nextInt();
		}
		büyükKücük(dizi,dizi.length);
		}
	
		private static void büyükKücük(int[] dizi, int length) {
			
		for(int i=0;i<length;i++){
		if(dizi[i]==10){
		System.out.println("Dizinin "+(i+1)+".elemaný 10'a eþittir:"+dizi[i]);
		}
		else if(dizi[i]<10){
		System.out.println("Dizinin "+(i+1)+".elemaný 10'dan küçüktür:"+dizi[i]);
		}
		else{
		System.out.println("Dizinin "+(i+1)+".elemaný 10'dan büyüktür:"+dizi[i]);
		}
		}
		}
}
