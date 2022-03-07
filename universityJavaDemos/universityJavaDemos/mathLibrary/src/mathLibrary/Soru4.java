package mathLibrary;

class kitapl�k {
	private String yayinevi, yayinyili;
	public String type;

	public enum kitap {
		WebProgramlama, JavaProgramlama, CProgramlama, VisualBasic, MobilAplication
	}

	public kitapl�k(kitap type) {
		setYayinEvi(type);
		setYayinYili(type);
		this.type = type.toString();
	}

	void setYayinEvi(kitap type) {
		if (type == kitap.WebProgramlama) {
			yayinevi = "Papatya";
		} else if (type == kitap.JavaProgramlama) {
			yayinevi = "Pusula";
		} else if (type == kitap.CProgramlama) {
			yayinevi = "Kodlab";
		} else if (type == kitap.VisualBasic) {
			yayinevi = "Aktif";
		} else if (type == kitap.MobilAplication) {
			yayinevi = "Palme";
		}
	}

	void setYayinYili(kitap type) {
		if (type == kitap.WebProgramlama) {
			yayinyili = "2012";
		} else if (type == kitap.JavaProgramlama) {
			yayinyili = "2008";
		} else if (type == kitap.CProgramlama) {
			yayinyili = "2016";
		} else if (type == kitap.VisualBasic) {
			yayinyili = "2005";
		} else if (type == kitap.MobilAplication) {
			yayinyili = "2010";
		}
	}

	String getYayinEvi() {
		return yayinevi;
	}

	String getYayinYili() {
		return yayinyili;
	}
}

public class Soru4 {
	public static void main(String[] args) {
		kitapl�k[] kitaplar = new kitapl�k[5];
		kitaplar[0] = new kitapl�k(kitapl�k.kitap.WebProgramlama);
		kitaplar[1] = new kitapl�k(kitapl�k.kitap.JavaProgramlama);
		kitaplar[2] = new kitapl�k(kitapl�k.kitap.CProgramlama);
		kitaplar[3] = new kitapl�k(kitapl�k.kitap.VisualBasic);
		kitaplar[4] = new kitapl�k(kitapl�k.kitap.MobilAplication);

		System.out.println(
				"\t\t\t\t*** Kitap Bilgileri ***\nKitapAd�\t\t\t\tYayinEvi\t\t\t\tYayinYili\n............................................................................................");
		for (int i = 0; i < 5; i++)
			System.out.println(kitaplar[i].type + "\t\t\t\t" + kitaplar[i].getYayinEvi() + "\t\t\t\t\t   "
					+ kitaplar[i].getYayinYili());

	}
}
