package string;

public class EquelString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String a2 = "ayþegül";//iki objede ayný yerde olduðu için
        String a3 = "ayþegül";//sonuc esitler olarak yazýlýr
        
        if(a2==a3){
            System.out.println("eþitler");
        }
        
        String c1 =new String("ayþegül");//bunlar bellekte farklý yerleri gösteriyor
        String c2 =new String("ayþegül");
        
        if(c1==c2){//if(c1.equals(c2)) þeklinde kullanýlmalý
            System.out.println("eþitler");
        }else{
            System.out.println("eþit deðiller");
        }//içerik kotrol edilmek istendiðinde equals() metodu kullanýlmalý

	}

}
