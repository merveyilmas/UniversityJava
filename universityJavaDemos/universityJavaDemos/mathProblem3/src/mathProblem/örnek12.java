package mathProblem;

import java.util.Scanner;

public class örnek12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][][] cokboyutludizi = new int[3][2][2];
		for(int i=0;i<3;i++) {
		for(int j=0;j<2;j++) {
		for(int k=0;k<2;k++) {
		System.out.print("("+(i+1)+", "+(j+1)+", "+(k+1)+") konumundaki elemanýn deðerini giriniz: ");
		cokboyutludizi[i][j][k]=input.nextInt();
		}
		}
		}
		int[] toplam =new int[3];
		for(int i=0;i<3;i++) {
		toplam[i]=0;
		for(int j=0;j<2;j++) {
		for(int k=0;k<2;k++) {
		toplam[i]+=cokboyutludizi[i][j][k];
		}
		}
		}}
}
