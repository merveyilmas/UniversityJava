package string;

public class EquelString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String a2 = "ay�eg�l";//iki objede ayn� yerde oldu�u i�in
        String a3 = "ay�eg�l";//sonuc esitler olarak yaz�l�r
        
        if(a2==a3){
            System.out.println("e�itler");
        }
        
        String c1 =new String("ay�eg�l");//bunlar bellekte farkl� yerleri g�steriyor
        String c2 =new String("ay�eg�l");
        
        if(c1==c2){//if(c1.equals(c2)) �eklinde kullan�lmal�
            System.out.println("e�itler");
        }else{
            System.out.println("e�it de�iller");
        }//i�erik kotrol edilmek istendi�inde equals() metodu kullan�lmal�

	}

}
