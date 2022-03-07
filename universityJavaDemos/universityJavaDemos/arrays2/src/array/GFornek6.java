package array;
import java.util.*;
public class GFornek6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner klavye=new Scanner(System.in);
			
			String[] gun = new String[7];
			for(int i=0;i<7;i++) {
				System.out.println("gün ismini giriniz:");
				gun[i]=klavye.next();
			}
			
	for(String i:gun) {
			System.out.println(i);
			
			}

		}
	}

