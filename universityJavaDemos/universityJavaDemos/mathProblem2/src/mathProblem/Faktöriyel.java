package mathProblem;

import java.util.*;

public class Fakt�riyel {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		
		int faktoriyel=1;
		System.out.print("Bir sayi giriniz:");
	    int sayi=scan.nextInt();
	    
	    for(int i=1;i<=sayi;i++) {
	    	/* if(i==3) {
	    		break;  (burda i 3 oldu�unda d�ng�den ��kart�r)
	    	} 
	    	if(i==50) {
	    		contunie;  (burda i 50 oldu�unda 50'yi atlay�p devam eder)
	    	} */
	   
	    	faktoriyel*=i;
	    	
	    }
	 
		System.out.println("Sayinin faktoriyeli:"+faktoriyel);


}}
