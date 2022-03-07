package mathProblem;

public class ödev2 {
	
	public static void dizininTersi(int[][][] dizi2) {
	
}
	public static void diziyiBastir(int dizii[][][]) {
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					System.out.print(dizii[i][j][k]);
				}
				System.out.println("");
			}
			System.out.println("------------");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] dizi= {{{1,2},{3,4}},
				{{5,6},{7,8}}};
		int[][][] kopya=new int[2][2][2];
		
		System.arraycopy(dizi, 0, kopya, 0, dizi.length);
		
		diziyiBastir(dizi);
		diziyiBastir(kopya);

    }
}
