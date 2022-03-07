package bagliListeler;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlists {

	public static void sirali_ekle(LinkedList<String> gidilecek_yerler, String yeni) {
		// son geleni ba�a ekliyor

		ListIterator<String> iterator = gidilecek_yerler.listIterator();

		while (iterator.hasNext()) {
			int karsilastir = iterator.next().compareTo(yeni);
			// iterator da olan deger ile yeni gelen de�eri kar��last�r�yor
			if (karsilastir == 0) {
				// bu iki de�er birbirine e�it
				System.out.println("listenizde bu eleman zaten var");
				return;
			} else if (karsilastir < 0) {
				// yeni de�er iterator.next den daha b�y�k
				// direk olarak i�lem yapmadan ba�a d�n�cek
				// kar��last�r�lacak eleman kalmay�nca
				// while d�ng�s�nden ��karak a�a��da listeye ekliyor
			} else if (karsilastir > 0) {
				iterator.previous();// iterator geri al�n�r
				// b�ylece s�ral� olarak ekleme yap�l�r
				iterator.add(yeni);
				return;
			}
		}
		iterator.add(yeni);
	}

	public static void listeyi_bastir(LinkedList<String> gidilecek_yerler) {
		ListIterator<String> iterator = gidilecek_yerler.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

	public static void main(String[] args) {
		LinkedList<String> gidilecek_yerler = new LinkedList<String>();
		gidilecek_yerler.add("postane");
		gidilecek_yerler.add("market");
		gidilecek_yerler.add("okul");
		gidilecek_yerler.add("k�t�phane");
		gidilecek_yerler.add("spor salonu");
		gidilecek_yerler.add("ev");
		listeyi_bastir(gidilecek_yerler);

		// ekrana metot yazarak bast�ral�m

		System.out.println("*************************************");
		// 4.index e de�er eklemek
		gidilecek_yerler.add(4, "al��veri� merkezi");
		// 3.index i silmek
		gidilecek_yerler.remove(3);
		listeyi_bastir(gidilecek_yerler);
		System.out.println("*************************************");
		// main metodu
		LinkedList<String> gidilecek_yerler1 = new LinkedList<String>();
		sirali_ekle(gidilecek_yerler1, "postane");
		sirali_ekle(gidilecek_yerler1, "market");
		sirali_ekle(gidilecek_yerler1, "ev");
		// sirali_ekle(gidilecek_yerler, "z�ccaciye");
		// sirali_ekle(gidilecek_yerler, "ci�ek�i");
		listeyi_bastir(gidilecek_yerler1);

	}
}
