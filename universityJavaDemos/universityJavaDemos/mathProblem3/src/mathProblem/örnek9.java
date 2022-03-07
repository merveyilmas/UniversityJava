package mathProblem;

public class örnek9 {

	public static void main(String[] args) {
		int[][] matris = {
		{3,3,3},
		{1,2,3},
		{4,5,6}
		};
		int[] toplam = elemanToplam(matris);
		System.out.println("toplamlar dizisi");
		for(int s:toplam) {
		System.out.println(s);
		}
		}
		public static int[] elemanToplam(int[][] m) {
		int[] toplam = new int[m.length];
		for(int i=0;i<m.length;i++) {
		toplam[i]=0;
		for(int j=0;j<m[i].length;j++) {
		toplam[i]+=m[i][j];
		}
		}
		return toplam;
		}
}
