package constructor;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		
        Araba araba1=new Araba();
		
		/* araba1.renk="k�rm�z�";
		   araba1.kapilar=4; 
		araba calss�ndan eri�ebilmek i�in public tanimli olmal�  */
        
		araba1.setRenk("Mavi");
		System.out.println("Arabanin rengi:"+araba1.getRenk());
		
		araba1.setKapilar(-3);
		
		/* 
		Araba araba2;
		araba2.setRenk("k�rm�z�);
		bu �ekilde kullanam�yoruz  */
		
	}

}
