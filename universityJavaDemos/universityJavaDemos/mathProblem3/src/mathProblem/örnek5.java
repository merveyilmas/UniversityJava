package mathProblem;

import java.util.Scanner;

public class örnek5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner klavye=new Scanner(System.in);
		
		System.out.println("Dizi boyutu giriniz:");
		int a=klavye.nextInt();
		double dizi[]=new double[a];
		
		
		for(int i=0;i<dizi.length;i++) {
			a=klavye.nextInt();
		}
		
		tamYap(dizi);

	}
	
	public static void tamYap(double dizi[]) {
		
		for(int i=0;i<dizi.length;i++) {
				
            System.out.println(dizi[i]);
		}
	}

}
