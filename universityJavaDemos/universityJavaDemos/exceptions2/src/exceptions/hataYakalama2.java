package exceptions;
import java.util.*;
public class hataYakalama2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random=new Random();
		int sayi;
		int b�l�m=1;
		
		for(int i=0;i<6;i++) {
			
				if(i==0) {
			b�l�m=random.nextInt(100);
			}
			else {
				sayi=random.nextInt(100);
				try{
					b�l�m/=sayi;  //random say� 0 gelirse 0a b�lme hatasi olur
				}
				catch(Exception e) {
					System.out.println("hata...."+e);
				}
            }
		} } }


