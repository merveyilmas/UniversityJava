package exceptions;
import java.util.*;
public class hataYakalama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tara=new Scanner(System.in);
		
		int data=0,i=0;
		int[] a=new int[10];
		
		try {
			System.out.println("bir sayi giriniz:");
			data=tara.nextInt();
			System.out.println("dizinin indisini giriniz:");
			i=tara.nextInt();
			a[i]=data;
		}
		catch(InputMismatchException hata) {
			System.out.println("oluþan hata:"+hata.getMessage());
			hata.printStackTrace();
		}
		catch(IndexOutOfBoundsException hata) {
			System.out.println("oluþan hata:"+hata.toString());
			hata.printStackTrace();
		}
		finally {
			System.out.println("programdan çýkýldý..");
		}

	}

}
