package loops;

public class whileBolunen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while( i<100) {
			i++;
			if(i%3==0 && i%5==0) {
				System.out.println(i);
			}
		}

	}

}
