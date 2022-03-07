package array;
import java.util.*;
public class ödev3 {

	public static void main(String[] args) {

		Scanner klavye=new Scanner(System.in);
		
		int diziboyutu,sonuc=0;
		
		System.out.println("Dizi boyutunu giriniz:");
		diziboyutu=klavye.nextInt();
		
		int[] dizi=new int[diziboyutu];
		
		for(int i=0;i<diziboyutu;i++){
			System.out.println("Sayý giriniz:");
			dizi[i]=klavye.nextInt();
			sonuc=sonuc+(i*dizi[i]);
		}
		
		for(int j=0;j<dizi.length;j++){
			System.out.println("dizi["+j+"] ="+dizi[j]);
		}
		System.out.println("sonuc="+sonuc);
	}
}
