package array;
import java.util.*;
public class ödev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner kýlavye=new Scanner(System.in);
			int büyük;
			int dizi[]=new int [5];
			System.out.println("Dizinin elemanlarýný giriniz:");
			for(int i=0;i<5;i++){
				dizi[i]=kýlavye.nextInt();
			}
			büyük=dizi[0];
			for(int j=1;j<5;j++){
				if(dizi[j]>büyük){
					büyük=dizi[j];
				}
			}
			System.out.println("Dizinin en büyük elemaný:"+büyük);

		}
	}


