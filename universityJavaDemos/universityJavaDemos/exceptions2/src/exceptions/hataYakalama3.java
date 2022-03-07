package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class hataYakalama3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int gelir, gider;
		try {
			System.out.println("geliri giriniz:");
			gelir = scan.nextInt();
			System.out.println("gideri giriniz:");
			gider = scan.nextInt();
		} catch (InputMismatchException hata) {
			System.out.println("oluþan hata..." + hata.getMessage());
			System.out.println("***************");
			//System.out.println("oluþan hata..." + hata.getStackTrace());
			//System.out.println("***************");
			hata.printStackTrace();
			System.out.println("***************");
			System.out.println("oluþan hata..." + hata.toString());

		}

	}

}
