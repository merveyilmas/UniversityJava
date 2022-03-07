package exceptions;
import java.util.*;
public class hataYakalama2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random=new Random();
		int sayi;
		int bölüm=1;
		
		for(int i=0;i<6;i++) {
			
				if(i==0) {
			bölüm=random.nextInt(100);
			}
			else {
				sayi=random.nextInt(100);
				try{
					bölüm/=sayi;  //random sayý 0 gelirse 0a bölme hatasi olur
				}
				catch(Exception e) {
					System.out.println("hata...."+e);
				}
            }
		} } }


