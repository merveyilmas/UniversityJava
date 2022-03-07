package string;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		
		String s="string";
		
		Scanner klavye=new Scanner(System.in);
		
		System.out.println("0 ile 6 arasýnda n deðeri giriniz:");
		int n=klavye.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print(s.substring(s.length()-n,s.length()));
		}
		

	}

}
