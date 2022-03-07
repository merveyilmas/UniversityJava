package mathProblem;

public class örnek14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dizi[][]= {{1,2,3,4,5},{6,7,8,9,10}};
		int kopya[][]=new int[2][5];
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<5;j++) {
				kopya[i][j]=dizi[i][j];
			}
		}
		for(int i=0;i<2;i++) {
			System.out.println();
			for(int j=0;j<5;j++) {
				System.out.print(" "+kopya[i][j]);
			}
		}
			
		}

	

}
