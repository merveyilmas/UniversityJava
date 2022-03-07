package array;
import java.util.*;
public class ödev2 {
	public static void main(String[] args) {
		
		Scanner kýlavye=new Scanner(System.in);
		
		int diziboyutu;
		
		System.out.println("Dizi boyutunu giriniz:");
		diziboyutu=kýlavye.nextInt();	
		
		int[] dizi=new int[diziboyutu];
		int a=0,b=0;
		
		System.out.println("Sayý giriniz:");
		
		for(int i=0;i<diziboyutu;i++){
			
			dizi[i]=kýlavye.nextInt();
			
			if(dizi[i]%2==0){
				a++;
			}
			else{
				b++;
			}
		}
		
		for(int j=0;j<dizi.length;j++){
			System.out.println("dizi="+dizi[j]);
		}
		
		System.out.println("Çift sayýlar:"+a+" tane");
		System.out.println("Tek sayýlar:"+b+" tane");

	}
}
