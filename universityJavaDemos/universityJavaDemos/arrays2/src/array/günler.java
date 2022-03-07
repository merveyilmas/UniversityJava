package array;

import java.util.Scanner;

public class günler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []günler= {"Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"};
		Scanner klavye=new Scanner(System.in);
		int gün;
		System.out.println("Bir gün giriniz:");
		gün=klavye.nextInt();
		
		if(gün>0 && gün<8) {
			System.out.println(gün+".gün..."+günler[gün-1]);
		}

	}

}
