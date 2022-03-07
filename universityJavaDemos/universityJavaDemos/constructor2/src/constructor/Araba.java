package constructor;

public class Araba {
	//private yapýnca deðiþkenleri dogrudan test classýndan ulaþýlmýyo bu yüzden set get metotlarý yaptýk
	//public olsaydý eriþebilirdik

	private String renk;
	private int kapilar;
	
	// sag tik source dan get setleri yazdýrabiliyoruz
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public int getKapilar() {
		return kapilar;
	}
	public void setKapilar(int kapilar) {
		if(kapilar<0) {
			System.out.println("Kapi degeri 0 dan küçük olamaz");
		}
		else {
			this.kapilar = kapilar;
		}
		
	}
	
	

	
	
}
