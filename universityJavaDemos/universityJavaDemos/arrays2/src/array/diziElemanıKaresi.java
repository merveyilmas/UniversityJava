package array;
import java.util.*;
public class diziElemanýKaresi {
	
	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		int diziBoyutu,sonuc;
		System.out.println("Dizi boyutunu giriniz:");
		diziBoyutu=klavye.nextInt();
		
		int [] dizi=new int[diziBoyutu];
		int [] sonuclar=new int[diziBoyutu];
		
		for(int i=0;i<dizi.length;i++){
			
		System.out.println("Dizinin "+(i+1)+".elemaný:");
		dizi[i]=klavye.nextInt();
		sonuclar[i]=dizi[i]*dizi[i];
		}
		
		for(int j=0;j<diziBoyutu;j++){
			
		System.out.println("Dizinin "+(j+1)+".elemanýnýn karesi:"+sonuclar[j]);
		}
		
		}
}
