package string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "ayþegül";
        String b = new String("ayþegül");
        System.out.println(b);
        
        
        System.out.println("harf sayýsý:" +b.length());
        System.out.println("0.index: "+b.charAt(0));
        System.out.println("3.index: "+b.charAt(3));
        System.out.println("son harf: "+b.charAt(b.length()-1));
        
       for (int i = 0; i < b.length(); i++) {
            //string ifadenin karakterlerini ekrana yazar
            System.out.println(b.charAt(i));
        }
       
        System.out.println(b.startsWith("ay"));       
       System.out.println(b.endsWith("ül"));
        System.out.println(b.indexOf('þ'));
        System.out.println(b.lastIndexOf('l'));
        System.out.println(b.toLowerCase());
        System.out.println(b.toUpperCase());
        
        String c= "1991";
        int d = Integer.parseInt(c);
        System.out.println("string-->integer "+ (d-1));
        
        int b1=1991;
        String a1 = String.valueOf(b1);
        System.out.println("integer---->string" +b1);

	}

}
