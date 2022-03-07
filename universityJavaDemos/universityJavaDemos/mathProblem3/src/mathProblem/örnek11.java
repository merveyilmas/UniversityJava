package mathProblem;
import java.util.*;
public class örnek11 {
	public static void main(String[] args) {
		int[][][] cokboyutludizi = {
		{{1,2},{3,4}},
		{{5,6},{7,8}}
		};
		for(int i=0;i<2;i++) {
		for(int j=0;j<2;j++) {
		for(int k=0;k<2;k++) {
		System.out.print(cokboyutludizi[i][j][k]+"\t");
		}
		System.out.println("");
		}
		System.out.println("------------");
		}
		}
	}
