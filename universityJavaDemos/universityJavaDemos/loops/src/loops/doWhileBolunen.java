package loops;

public class doWhileBolunen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do { 
			i++;
			if(i%5==0 && i%3==0) {
				System.out.println(i);
			}
			
		}while(i<100);

	}

}
