package mathProblem;

public class örnek8 {
	public static void main(String[] args) {
		int [][] matris = new int[9][9];
		for(int i=0;i<9;i++) {
		for(int j=0;j<9;j++) {
		matris[i][j]=(i+1)*(j+1);
		}
		}
		for(int i=0;i<9;i++) {
		for(int j=0;j<9;j++) {
		System.out.print(matris[i][j]+"\t");
		}
		System.out.println();
		}
		}
}
