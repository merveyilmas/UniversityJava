package mathProblem;

import java.util.*;

public class Faktöriyel {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		
		int faktoriyel=1;
		System.out.print("Bir sayi giriniz:");
	    int sayi=scan.nextInt();
	    
	    for(int i=1;i<=sayi;i++) {
	    	/* if(i==3) {
	    		break;  (burda i 3 olduðunda döngüden çýkartýr)
	    	} 
	    	if(i==50) {
	    		contunie;  (burda i 50 olduðunda 50'yi atlayýp devam eder)
	    	} */
	   
	    	faktoriyel*=i;
	    	
	    }
	 
		System.out.println("Sayinin faktoriyeli:"+faktoriyel);


}}
