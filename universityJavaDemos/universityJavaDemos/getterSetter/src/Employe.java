
import java.util.*;

public class Employe {
	String isim;
	String soyisim;
	int TC;
	int saat;
	double toplam�cret;

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public int getTC() {
		return TC;
	}

	public void setTC(int tC) {
		TC = tC;
	}

	public int getSaat() {
		return saat;
	}

	public void setSaat(int saat) {
		this.saat = saat;
	}

	public double getOran() {
		return oran;
	}

	public void setOran(double oran) {
		this.oran = oran;
	}

	public double getMaa�hesapla() {
		return maa�hesapla;
	}

	public void setMaa�hesapla(double maa�hesapla) {
		this.maa�hesapla = maa�hesapla;
	}

	double oran;
	double maa�hesapla;

	public Employe(String isim, String soyisim, int tC, int saat, double oran) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		TC = tC;
		this.saat = saat;
		this.oran = oran;
	}

	void maa�hesapla() {
		maa�hesapla = saat * oran;
		toplam�cret = maa�hesapla;
	}

	class memur extends Employe {

		String kurumad�;
		String pozisyon;
		double maashesapla;
		double toplam�cret;

		public memur(String isim, String soyisim, int tC, int saat, double oran, String kurumad�, String pozisyon) {
			super(isim, soyisim, tC, saat, oran);
			this.kurumad� = kurumad�;
			this.pozisyon = pozisyon;
		}

		public memur(String isim, String soyisim, int tC, int saat, double oran, String kurumad�, String pozisyon,
				double maashesapla, double toplam�cret) {
			super(isim, soyisim, tC, saat, oran);
			this.kurumad� = kurumad�;
			this.pozisyon = pozisyon;
			this.maashesapla = maashesapla;
			this.toplam�cret = toplam�cret;
		}

		public String getKurumad�() {
			return kurumad�;
		}

		public void setKurumad�(String kurumad�) {
			this.kurumad� = kurumad�;
		}

		public String getPozisyon() {
			return pozisyon;
		}

		public void setPozisyon(String pozisyon) {
			this.pozisyon = pozisyon;
		}

		public double getMaashesapla() {
			return maashesapla;
		}

		public void setMaashesapla(double maashesapla) {
			this.maashesapla = maashesapla;
		}

		void maashesapla() {

			if (saat < 100) {
				maashesapla = saat * oran;
				toplam�cret = maashesapla;
			} else {
				maashesapla = saat * oran + (saat - 100) * oran;
				toplam�cret = maashesapla;

			}

		}

		class i��i extends Employe {
			String sekt�rad�;
			int eksaat;
			double ek�cret;
			double maashesapla;
			double toplam�cret;

			public i��i(String isim, String soyisim, int tC, int saat, double oran, String sekt�rad�, int eksaat) {
				super(isim, soyisim, tC, saat, oran);
				this.sekt�rad� = sekt�rad�;
				this.eksaat = eksaat;
			}

			void ek�cret() {
				ek�cret = eksaat * (oran + oran / 4);
			}

			public String getSekt�rad�() {
				return sekt�rad�;
			}

			public void setSekt�rad�(String sekt�rad�) {
				this.sekt�rad� = sekt�rad�;
			}

			public int getEksaat() {
				return eksaat;
			}

			public void setEksaat(int eksaat) {
				this.eksaat = eksaat;
			}

			public double getEk�cret() {
				return ek�cret;
			}

			public void setEk�cret(double ek�cret) {
				this.ek�cret = ek�cret;
			}

			public double getMaashesapla() {
				return maashesapla;
			}

			public void setMaashesapla(double maashesapla) {
				this.maashesapla = maashesapla;
			}

			void maashesapla() {
				maashesapla = saat * oran + (ek�cret);
				toplam�cret = maashesapla;
			}

		}

		public void main(String[] args) {
			Employe �l�n = new Employe("Merve", "Y�lmaz", 306174, 8, 5);
			memur mmr = new memur("Gaye", "Alp", 566778, 6, 3, "Avrasya", "memur");
			i��i i� = new i��i("Asl�", "Ay", 45232, 5, 1, "a���", 3);

			System.out.println(" " + getIsim() + "" + getSoyisim() + "" + getTC() + "" + getSaat() + "" + getOran());

		}
	}

}
