package array;

import java.util.Scanner;

public class g�nler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []g�nler= {"Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"};
		Scanner klavye=new Scanner(System.in);
		int g�n;
		System.out.println("Bir g�n giriniz:");
		g�n=klavye.nextInt();
		
		if(g�n>0 && g�n<8) {
			System.out.println(g�n+".g�n..."+g�nler[g�n-1]);
		}

	}

}
