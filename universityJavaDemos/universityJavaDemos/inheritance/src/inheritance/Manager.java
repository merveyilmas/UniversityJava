package inheritance;

public class Manager extends Employe{
	private int sorumluKisi;

	public Manager(String isim, int maas, String departman,int sorumluKisi) {
		super(isim, maas, departman);
		this.sorumluKisi=sorumluKisi;
		
	}
	public void zamYap(int zamMiktari) {
		System.out.println("calisanlara"+zamMiktari+"tl zam yapilmistir..");
	}
	
	@Override
	public void bilgigoster() {
		super.bilgigoster();
		System.out.println("Sorumlu kisi sayisi:"+this.sorumluKisi);
	}
	

}
