package array;
import java.util.*;
public class �dev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner k�lavye=new Scanner(System.in);
			int b�y�k;
			int dizi[]=new int [5];
			System.out.println("Dizinin elemanlar�n� giriniz:");
			for(int i=0;i<5;i++){
				dizi[i]=k�lavye.nextInt();
			}
			b�y�k=dizi[0];
			for(int j=1;j<5;j++){
				if(dizi[j]>b�y�k){
					b�y�k=dizi[j];
				}
			}
			System.out.println("Dizinin en b�y�k eleman�:"+b�y�k);

		}
	}


