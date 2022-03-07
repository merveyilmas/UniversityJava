package mathProblem;

import java.util.Scanner;

public class örnek4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Dizi boyutunu giriniz: ");
		int boyut = input.nextInt();
		int[] sayiDizisi = new int[boyut];
		for(int i=0;i<boyut;i++) {
		System.out.print((i+1)+". Sayýyý giriniz: ");
		sayiDizisi[i] = input.nextInt();
		}
		fonksiyon(sayiDizisi);
		}
		public static void fonksiyon(int[] a) {
		int sonuc=0;
		for(int i=0;i<a.length;i++) {
		if(i%2==0) {
		System.out.print("-("+a[i]+") ");
		sonuc-=a[i];
		}else {
		System.out.print("+("+a[i]+") ");
		sonuc+=a[i];
		}
		}
		System.out.print("= "+sonuc);
		}
	}


