package inheritance;

public class Employe {
	private String isim;
	private int maas;
	private String departman;
	
	public Employe(String isim, int maas, String departman) {
		this.isim = isim;
		this.maas = maas;
		this.departman = departman; }
		
		public void calis() {
			System.out.println("calisan calisiyor..");
		}
		
		public void bilgigoster() {
			System.out.println("isim:"+isim);
			System.out.println("maas:"+maas);
			System.out.println("departman:"+departman);
		}
		public void departmandegistir(String yeni_departman) {
			System.out.println("departman degistiriliyor...");
			this.departman=yeni_departman;
			System.out.println("yeni departman:"+this.departman);
		}
	
	
	
	

}
