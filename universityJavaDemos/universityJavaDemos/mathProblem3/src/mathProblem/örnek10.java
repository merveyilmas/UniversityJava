package mathProblem;
import java.util.*;
public class örnek10 {
	
	public int determinant(int[][] a){
		int sonuc=0;
		
		if(a.length==1) {
			sonuc=a[0][0];
			return sonuc;
		}
		if(a.length==2) {
			sonuc=a[0][0]*a[1][1]-a[0][1]*a[1][0];
			return sonuc;
		}
		for(int i=0;i<a[0].length;i++) {
			int gecici[][]=new int[a.length-1][a[0].length-1];
			for(int j=0;j<a.length;j++) {
				for(int k=0;k<a[0].length;k++) {
				if(k<i) {
					gecici[j-1][k]=a[j][k];
				}
				else if(k>i) {
					gecici[j-1][k-1]=a[j][k];
				}
			}
		}
			sonuc+=a[0][i]*Math.pow(-1, (int) i)*determinant(gecici);
	}
		return sonuc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] dizi= {{1,2,3},{4,5,6},{7,8,9}};
		
		örnek10 d=new örnek10();
		int sonuc=d.determinant(dizi);
		System.out.println(sonuc);
		
	}

}
