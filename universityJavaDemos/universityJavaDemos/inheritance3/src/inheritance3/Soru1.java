package inheritance3;

class Film {
	int biletFiyat;
	int musteriYasi;
	String gun;

	Film(int biletFiyat�, int musteriYasi, String gun) {
		this.biletFiyat = biletFiyat�;
		this.musteriYasi = musteriYasi;
		this.gun = gun;
	}

	void SetBiletFiyat(int biletFiyat) {
		this.biletFiyat = biletFiyat;
	}

	int GetBiletFiyat() {
		return biletFiyat;
	}

	float IndirimliFiyat() {
		int indirim = 0;
		if (musteriYasi <= 12) {
			indirim += 0.15;
			System.out.println("0-12 Ya� indirimi uyguland�!");
		} else if (musteriYasi < 25) {
			indirim += 0.05;
			System.out.println("12-25 Ya� indirimi uyguland�!");
		}

		if (gun == "pazar" || gun == "cumartesi") {
			indirim += 0.05;
			System.out.println("Haftasonu indirimi Uyguland�!");
		}

		return biletFiyat - biletFiyat * indirim;
	}
}

class Aile extends Film {
	int yayinlananYil;

	Aile(int biletFiyat�, int musteriYasi, int yayinlananYil, String gun) {
		super(biletFiyat�, musteriYasi, gun);
		this.yayinlananYil = yayinlananYil;

	}

	void SetYayinlananYil(int yayinlananYil) {
		this.yayinlananYil = yayinlananYil;
	}

	int GetYayinlananYil() {
		return yayinlananYil;
	}

	float IndirimliFiyat() {
		return super.IndirimliFiyat();
	}

}

class Macera extends Film {
	String yonetmen;

	Macera(int biletFiyat�, int musteriYasi, String gun, String yonetmen) {
		super(biletFiyat�, musteriYasi, gun);
		this.yonetmen = yonetmen;
	}

	void SetYonetmen(String yonetmen) {
		this.yonetmen = yonetmen;
	}

	String GetYonetmen() {
		return yonetmen;
	}

	float IndirimliFiyat() {
		return super.IndirimliFiyat();
	}

}

class Cocuk extends Film {
	String yapimci;

	Cocuk(int biletFiyat�, int musteriYasi, String gun, String yapimci) {
		super(biletFiyat�, musteriYasi, gun);
		this.yapimci = yapimci;
	}

	void SetYapimci(String yapimci) {
		this.yapimci = yapimci;
	}

	String GetYapimci() {
		return yapimci;
	}

	float IndirimliFiyat() {
		System.out.println("�ocuk filmi indirimi uyguland�!");
		return super.IndirimliFiyat() - biletFiyat * 0.15f;
	}

}

class Komedi extends Aile {
	String basrolOyuncu;

	Komedi(int biletFiyat�, int musteriYasi, int yayinlananYil, String gun, String basrolOyuncu) {
		super(biletFiyat�, musteriYasi, yayinlananYil, gun);
		this.basrolOyuncu = basrolOyuncu;
		System.out.println("-----------\n" + IndirimliFiyat() + " TL\tYa� " + this.musteriYasi + "\t" + this.gun
				+ "\tYayinlanan Yil : " + this.yayinlananYil + "\tBasrol : " + this.basrolOyuncu + "\n");
	}

	void SetBasrolOyuncu(String basrolOyuncu) {
		this.basrolOyuncu = basrolOyuncu;
	}

	String GetBasrolOyuncu() {
		return basrolOyuncu;
	}

	float IndirimliFiyat() {
		System.out.println("Komedi filmi indirimi uyguland�!");
		return super.IndirimliFiyat() - biletFiyat * 0.1f;
	}

}

class Romantik extends Aile {
	int begenmeRekoru;

	Romantik(int biletFiyat�, int musteriYasi, int yayinlananYil, int begenmeRekoru, String gun) {
		super(biletFiyat�, musteriYasi, yayinlananYil, gun);
		this.begenmeRekoru = begenmeRekoru;
		System.out.println("-----------\n" + IndirimliFiyat() + " TL\tYa� " + this.musteriYasi + "\t" + this.gun
				+ "\tYayinlanan Yil : " + this.yayinlananYil + "\tBegenmeRekoru" + this.begenmeRekoru + "\n");

	}

	void SetBegenmeRekoru(int begenmeRekoru) {
		this.begenmeRekoru = begenmeRekoru;
	}

	int GetBegenmeRekoru() {
		return begenmeRekoru;
	}

	float IndirimliFiyat() {
		System.out.println("Romantik film indirimi uyguland�!");
		return super.IndirimliFiyat() - biletFiyat * 0.06f;
	}
}

class Korku extends Macera {
	int korkuDerecesi;

	Korku(int biletFiyat�, int musteriYasi, int korkuDerecesi, String gun, String yonetmen) {
		super(biletFiyat�, musteriYasi, gun, yonetmen);
		this.korkuDerecesi = korkuDerecesi;

		System.out.println("-----------\n" + IndirimliFiyat() + " TL\tYa� " + this.musteriYasi + "\t" + this.gun
				+ "\tYonetmen : " + this.yonetmen + "\tKorku Derecesi : " + this.korkuDerecesi + "\n");
	}

	void SetKorkuDerecesi(int korkuDerecesi) {
		this.korkuDerecesi = korkuDerecesi;
	}

	int GetKorkuDerecesi() {
		return korkuDerecesi;
	}

	float IndirimliFiyat() {
		System.out.println("Korku filmi indirimi uyguland�!");
		return super.IndirimliFiyat() - biletFiyat * 0.04f;
	}
}

class Animasyon extends Cocuk {
	int goruntuKalitesi;

	Animasyon(int biletFiyat�, int musteriYasi, int goruntuKalitesi, String gun, String yapimci) {
		super(biletFiyat�, musteriYasi, gun, yapimci);
		this.goruntuKalitesi = goruntuKalitesi;
		System.out.println("-----------\n" + IndirimliFiyat() + " TL\tYa� " + this.musteriYasi + "\t" + this.gun
				+ "\tYap�mc� : " + this.yapimci + "\tG�r�nt� Kalitesi : " + this.goruntuKalitesi + "\n");
	}

	void SetGoruntuKalitesi(int goruntuKalitesi) {
		this.goruntuKalitesi = goruntuKalitesi;
	}

	int GetGoruntuKalitesi() {
		return goruntuKalitesi;
	}

	float IndirimliFiyat() {
		return super.IndirimliFiyat();
	}
}

class CizgiFilm extends Cocuk {
	String karakterIsmi;

	CizgiFilm(int biletFiyat�, int musteriYasi, String gun, String yapimci, String karakterIsmi) {
		super(biletFiyat�, musteriYasi, gun, yapimci);
		this.karakterIsmi = karakterIsmi;
		System.out.println("-----------\n" + IndirimliFiyat() + " TL\tYa� " + this.musteriYasi + "\t" + this.gun
				+ "\tYap�mc� : " + this.yapimci + "\tKarakter : " + this.karakterIsmi + "\n");
	}

	void SetKarakterIsmi(String karakterIsmi) {
		this.karakterIsmi = karakterIsmi;
	}

	String GetKarekterIsmi() {
		return karakterIsmi;
	}

	float IndirimliFiyat() {
		return super.IndirimliFiyat();
	}
}

public class Soru1 {
	public static void main(String[] args) {
		Komedi k = new Komedi(15, 18, 1998, "pazar", "Ahmet");
		Romantik r = new Romantik(10, 29, 2016, 9, "sal�");
		Korku ko = new Korku(25, 17, 3, "cumartesi", "Tar�k");
		Animasyon a = new Animasyon(15, 12, 9, "cumartesi", "pixar");
		CizgiFilm c = new CizgiFilm(15, 15, "sal�", "Cihan", "Melik");
	}

}
