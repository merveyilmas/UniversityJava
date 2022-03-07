package bagliListeler;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlists {

	public static void sirali_ekle(LinkedList<String> gidilecek_yerler, String yeni) {
		// son geleni baþa ekliyor

		ListIterator<String> iterator = gidilecek_yerler.listIterator();

		while (iterator.hasNext()) {
			int karsilastir = iterator.next().compareTo(yeni);
			// iterator da olan deger ile yeni gelen deðeri karþýlastýrýyor
			if (karsilastir == 0) {
				// bu iki deðer birbirine eþit
				System.out.println("listenizde bu eleman zaten var");
				return;
			} else if (karsilastir < 0) {
				// yeni deðer iterator.next den daha büyük
				// direk olarak iþlem yapmadan baþa dönücek
				// karþýlastýrýlacak eleman kalmayýnca
				// while döngüsünden çýkarak aþaðýda listeye ekliyor
			} else if (karsilastir > 0) {
				iterator.previous();// iterator geri alýnýr
				// böylece sýralý olarak ekleme yapýlýr
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
		gidilecek_yerler.add("kütüphane");
		gidilecek_yerler.add("spor salonu");
		gidilecek_yerler.add("ev");
		listeyi_bastir(gidilecek_yerler);

		// ekrana metot yazarak bastýralým

		System.out.println("*************************************");
		// 4.index e deðer eklemek
		gidilecek_yerler.add(4, "alýþveriþ merkezi");
		// 3.index i silmek
		gidilecek_yerler.remove(3);
		listeyi_bastir(gidilecek_yerler);
		System.out.println("*************************************");
		// main metodu
		LinkedList<String> gidilecek_yerler1 = new LinkedList<String>();
		sirali_ekle(gidilecek_yerler1, "postane");
		sirali_ekle(gidilecek_yerler1, "market");
		sirali_ekle(gidilecek_yerler1, "ev");
		// sirali_ekle(gidilecek_yerler, "züccaciye");
		// sirali_ekle(gidilecek_yerler, "ciçekçi");
		listeyi_bastir(gidilecek_yerler1);

	}
}
