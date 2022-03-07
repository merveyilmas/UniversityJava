package loops;

public class returnDeyimi {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			if(i==5) {
				return;
			}
			else {
				System.out.println("i="+i);
			}
		}

	}

}
