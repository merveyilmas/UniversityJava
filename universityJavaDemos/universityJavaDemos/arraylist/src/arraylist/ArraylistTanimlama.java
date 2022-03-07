package arraylist;

import java.util.ArrayList;

public class ArraylistTanimlama {

	public static void yazd�r(ArrayList<String> a) {
		for (int i = 0; i < a.size(); i++) {
			System.out.println("indis" + (i + 1) + " " + a.get(i));
		}
	}

	public static void main(String[] args) {

		ArrayList<String> arraylist = new ArrayList<String>();

		arraylist.add("�stanbul");
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

		arraylist.remove(1);// de�er ya da index belirtebiliriz
		yazd�r(arraylist);

		System.out.println("*********************");
		System.out.println(arraylist.indexOf("�stanbul"));
//soldan ba�layarak ilerliyor ve ilk �stanbul g�rd��� yerde ekrana index i verir
		System.out.println("*********************");
//listeye 1 tane daha �stanbul ekleyelim
		arraylist.add("�stanbul");
		System.out.println(arraylist.lastIndexOf("�stanbul"));

		System.out.println("*********************");

		yazd�r(arraylist);
		System.out.println("*********************");
//bu sefer sondan taramaya ba�lar ve ilk g�rd��� index i yazar
//************************
//arrayList de g�ncelleme
//Arraylist.set(index, String eleman); hangi indise hangi eleman�n koyulaca�� yaz�l�r
		arraylist.set(3, "Rize");
		yazd�r(arraylist);

	}

}
