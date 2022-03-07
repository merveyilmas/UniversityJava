package mathProblem;

import java.util.Scanner;

public class FaktöriyelwithMethod {
	
	public static void selam() {
		System.out.println("Merhaba Java");
	}
	
	public static void faktoriyel() {
		Scanner scan=new Scanner(System.in);
		int faktoriyel=1;
		System.out.print("Bir sayi giriniz:");
	    int sayi=scan.nextInt();
	    
	    for(int i=1;i<=sayi;i++) {
	    	
	    faktoriyel*=i;
	    	
	    }
	    System.out.println("Sayinin faktoriyeli:"+faktoriyel);
	}
	
	public static int faktoriyell(int sayi) {
		
		int faktoriyel=1;
	    
	    for(int i=1;i<=sayi;i++) {
	    	
	    faktoriyel*=i;
	   
	    }
	    return faktoriyel;
	}
	
	public static int DortleCarp(int a) {
		 a*=4;
		 return a;
	}

	public static void main(String[] args) {
		// parametresiz fonksiyon cagýrma
		selam();
		faktoriyel();
		
		// parametre ile fonksiyon cagýrma
		int a=5;
		System.out.println("Faktoriyel*4:"+DortleCarp(faktoriyell(a)));

	}

}
