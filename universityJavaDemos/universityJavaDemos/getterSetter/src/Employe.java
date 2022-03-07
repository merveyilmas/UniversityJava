
import java.util.*;

public class Employe {
	String isim;
	String soyisim;
	int TC;
	int saat;
	double toplamücret;

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

	public double getMaaþhesapla() {
		return maaþhesapla;
	}

	public void setMaaþhesapla(double maaþhesapla) {
		this.maaþhesapla = maaþhesapla;
	}

	double oran;
	double maaþhesapla;

	public Employe(String isim, String soyisim, int tC, int saat, double oran) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		TC = tC;
		this.saat = saat;
		this.oran = oran;
	}

	void maaþhesapla() {
		maaþhesapla = saat * oran;
		toplamücret = maaþhesapla;
	}

	class memur extends Employe {

		String kurumadý;
		String pozisyon;
		double maashesapla;
		double toplamücret;

		public memur(String isim, String soyisim, int tC, int saat, double oran, String kurumadý, String pozisyon) {
			super(isim, soyisim, tC, saat, oran);
			this.kurumadý = kurumadý;
			this.pozisyon = pozisyon;
		}

		public memur(String isim, String soyisim, int tC, int saat, double oran, String kurumadý, String pozisyon,
				double maashesapla, double toplamücret) {
			super(isim, soyisim, tC, saat, oran);
			this.kurumadý = kurumadý;
			this.pozisyon = pozisyon;
			this.maashesapla = maashesapla;
			this.toplamücret = toplamücret;
		}

		public String getKurumadý() {
			return kurumadý;
		}

		public void setKurumadý(String kurumadý) {
			this.kurumadý = kurumadý;
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
				toplamücret = maashesapla;
			} else {
				maashesapla = saat * oran + (saat - 100) * oran;
				toplamücret = maashesapla;

			}

		}

		class iþçi extends Employe {
			String sektöradý;
			int eksaat;
			double ekücret;
			double maashesapla;
			double toplamücret;

			public iþçi(String isim, String soyisim, int tC, int saat, double oran, String sektöradý, int eksaat) {
				super(isim, soyisim, tC, saat, oran);
				this.sektöradý = sektöradý;
				this.eksaat = eksaat;
			}

			void ekücret() {
				ekücret = eksaat * (oran + oran / 4);
			}

			public String getSektöradý() {
				return sektöradý;
			}

			public void setSektöradý(String sektöradý) {
				this.sektöradý = sektöradý;
			}

			public int getEksaat() {
				return eksaat;
			}

			public void setEksaat(int eksaat) {
				this.eksaat = eksaat;
			}

			public double getEkücret() {
				return ekücret;
			}

			public void setEkücret(double ekücret) {
				this.ekücret = ekücret;
			}

			public double getMaashesapla() {
				return maashesapla;
			}

			public void setMaashesapla(double maashesapla) {
				this.maashesapla = maashesapla;
			}

			void maashesapla() {
				maashesapla = saat * oran + (ekücret);
				toplamücret = maashesapla;
			}

		}

		public void main(String[] args) {
			Employe çlþn = new Employe("Merve", "Yýlmaz", 306174, 8, 5);
			memur mmr = new memur("Gaye", "Alp", 566778, 6, 3, "Avrasya", "memur");
			iþçi iþ = new iþçi("Aslý", "Ay", 45232, 5, 1, "aþçý", 3);

			System.out.println(" " + getIsim() + "" + getSoyisim() + "" + getTC() + "" + getSaat() + "" + getOran());

		}
	}

}
