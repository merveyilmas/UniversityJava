package array;
import java.util.*;
public class �dev2 {
	public static void main(String[] args) {
		
		Scanner k�lavye=new Scanner(System.in);
		
		int diziboyutu;
		
		System.out.println("Dizi boyutunu giriniz:");
		diziboyutu=k�lavye.nextInt();	
		
		int[] dizi=new int[diziboyutu];
		int a=0,b=0;
		
		System.out.println("Say� giriniz:");
		
		for(int i=0;i<diziboyutu;i++){
			
			dizi[i]=k�lavye.nextInt();
			
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
		
		System.out.println("�ift say�lar:"+a+" tane");
		System.out.println("Tek say�lar:"+b+" tane");

	}
}
