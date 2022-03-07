package arraylist;

import java.util.ArrayList;

public class ArraylistTanimlama {

	public static void yazdır(ArrayList<String> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.println("indis" + (i + 1) + " " + a.get(i));
		}
	}

	public static void main(String[] args) {

		ArrayList<String> arraylist = new ArrayList<String>();

		arraylist.add("İstanbul");
		arraylist.add("Ankara");
		arraylist.add("Trabzon");
		arraylist.add("Samsun");

		System.out.println(arraylist.get(0));
		System.out.println("listenin boyutu: " + arraylist.size());

		System.out.println("*********************");

		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
		System.out.println("*********************");

		arraylist.remove(1);// değer ya da index belirtebiliriz
		yazdır(arraylist);

		System.out.println("*********************");
		System.out.println(arraylist.indexOf("İstanbul"));
//soldan başlayarak ilerliyor ve ilk İstanbul gördüğü yerde ekrana index i verir
		System.out.println("*********************");
//listeye 1 tane daha İstanbul ekleyelim
		arraylist.add("İstanbul");
		System.out.println(arraylist.lastIndexOf("İstanbul"));

		System.out.println("*********************");

		yazdır(arraylist);
		System.out.println("*********************");
//bu sefer sondan taramaya başlar ve ilk gördüğü index i yazar
//************************
//arrayList de güncelleme
//Arraylist.set(index, String eleman); hangi indise hangi elemanın koyulacağı yazılır
		arraylist.set(3, "Rize");
		yazdır(arraylist);

	}

}
