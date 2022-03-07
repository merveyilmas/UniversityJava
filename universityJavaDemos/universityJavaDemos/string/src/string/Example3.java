package string;

public class Example3 {

	public static void main(String[] args) {

		String string = "abcdefghijklmnoprstuvwxyz";
		
		for(int i=0;i<string.length();i+=5)
		
		System.out.println(string.substring(i,i+5));
		
	}
}
