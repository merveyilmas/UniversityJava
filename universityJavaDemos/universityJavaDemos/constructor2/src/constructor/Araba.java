package constructor;

public class Araba {
	//private yap�nca de�i�kenleri dogrudan test class�ndan ula��lm�yo bu y�zden set get metotlar� yapt�k
	//public olsayd� eri�ebilirdik

	private String renk;
	private int kapilar;
	
	// sag tik source dan get setleri yazd�rabiliyoruz
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
			System.out.println("Kapi degeri 0 dan k���k olamaz");
		}
		else {
			this.kapilar = kapilar;
		}
		
	}
	
	

	
	
}
