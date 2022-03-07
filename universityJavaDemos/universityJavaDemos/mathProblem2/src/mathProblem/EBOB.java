package mathProblem;

public class EBOB {
	
	public static int ebob(int a,int b) {
		int ebob=1;
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0) {
				ebob=i;
			}
			
		}
		return ebob;
		}

	public static void main(String[] args) {
		// EBOB
		int x=10, y=5;
		ebob(x,y);
		System.out.println(ebob(x,y));
		

	}

}
