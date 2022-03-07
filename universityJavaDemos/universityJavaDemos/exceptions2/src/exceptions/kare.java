package exceptions;
import java.util.*;
public class kare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner klavye=new Scanner(System.in);
		int sayi,kare;
		
		System.out.println("bir sayi giriniz:");
		
		try{
			sayi=klavye.nextInt();
			kare=sayi*sayi;
			System.out.println(sayi+"sayinin karesi:"+kare);
		}
		catch(Exception hata1) {
			System.out.println("yanlýþ sayi girdiniz:");
			System.out.println("programi yeniden çalýþtýrýz....");
		}

	}

}
