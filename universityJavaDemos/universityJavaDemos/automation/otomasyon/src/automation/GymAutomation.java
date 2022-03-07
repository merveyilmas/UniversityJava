package automation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class GymAutomation {

	public static void oku() {
		try {
			String dosyaAdi = "sporsalonuotomasyon.txt";

			BufferedReader oku = new BufferedReader(new InputStreamReader(new FileInputStream(dosyaAdi)));

			String str;

			while ((str = oku.readLine()) != null) {
				System.out.println(str);
			}

			oku.close();
		} catch (UnsupportedEncodingException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("�yeler Ba�ar�l� Bir �ekilde Listelenmi�tir..");

	}

	public static void ekle() throws IOException {
		int secimverisi;
		String ad = "";
		String soyad = "";
		int telefon = 0;
		double boy = 0;
		double kilo = 0;
		int yas = 0;
		int cinsiyet = 0;
		String tarih = null;
		int kayitsuresi = 0;
		int program = 0;
		String programveri = "";
		String kayitsuresiveri = "";
		String cins = "";

		String dosyaAdi = "sporsalonuotomasyon.txt";
		FileWriter yazar = new FileWriter(dosyaAdi, true);
		System.out.println("�ye Ki�i Say�s�n� Belirtiniz..");
		Scanner secimkisi = new Scanner(System.in);
		int secimkisi1 = secimkisi.nextInt();
		int uyesayisi = 0;
		uyesayisi += secimkisi1;
		for (int i = 0; i < secimkisi1; i++) {

			System.out.println("�ye Ad� Giriniz :");
			Scanner adgiris = new Scanner(System.in);
			ad = adgiris.nextLine();
			System.out.println("�ye Soyad� Giriniz :");
			Scanner soyadgiris = new Scanner(System.in);
			soyad = adgiris.nextLine();
			System.out.println("�ye Telefonu Giriniz :");
			Scanner telefongiris = new Scanner(System.in);
			telefon = telefongiris.nextInt();

			System.out.println("Cinsiyet Se�iniz :");
			System.out.println("1. Kad�n");
			System.out.println("2. Erkek");
			Scanner cinsiyetgiris = new Scanner(System.in);
			cinsiyet = cinsiyetgiris.nextInt();
			switch (cinsiyet) {
			case 1:
				cins = "Kad�n";
				break;
			case 2:
				cins = "Erkek";
				break;
			}

			System.out.println("�ye Boyu Giriniz :");
			Scanner boygiris = new Scanner(System.in);
			boy = boygiris.nextDouble();
			System.out.println("�ye Kilosu Giriniz :");
			Scanner kilogiris = new Scanner(System.in);
			kilo = kilogiris.nextDouble();
			System.out.println("�ye Ya�� Giriniz :");
			Scanner yasgiris = new Scanner(System.in);
			yas = yasgiris.nextInt();
			System.out.println("�ye Kay�t Tarihi Giriniz :");
			Scanner tarihgiris = new Scanner(System.in);
			tarih = tarihgiris.next();

			System.out.println("�ye Kay�t S�resi Se�iniz :");
			System.out.println("1. 1 Ayl�k");
			System.out.println("2. 2 Ayl�k");
			System.out.println("3. 3 Ayl�k");
			Scanner kayitsuresigiris = new Scanner(System.in);
			kayitsuresi = kayitsuresigiris.nextInt();
			switch (kayitsuresi) {
			case 1:
				kayitsuresiveri = "1 Ayl�k";
				break;
			case 2:
				kayitsuresiveri = "2 Ayl�k";
				break;
			case 3:
				kayitsuresiveri = "3 Ayl�k";
				break;
			}
			System.out.println("Program Se�iniz :");
			System.out.println("1. Kas Program�");
			System.out.println("2. Kardiyo Program�");
			System.out.println("3. Zay�flama Program�");
			Scanner programgiris = new Scanner(System.in);
			program = programgiris.nextInt();
			switch (program) {
			case 1:
				programveri = "Kas Program�";
				break;
			case 2:
				programveri = "Kardiyo Program�";
				break;
			case 3:
				programveri = "Zay�flama Program�";
				break;
			}

			yazar.write("-------�YE B�LG�LER�-------" + "\n");
			yazar.write("Ad� : " + ad + "\n");
			yazar.write("Soyad� : " + soyad + "\n");
			yazar.write("Telefon : " + telefon + "\n");
			yazar.write("Cinsiyet : " + cins + "\n");
			yazar.write("Boy : " + boy + "\n");
			yazar.write("Kilo : " + kilo + "\n");
			yazar.write("Yas : " + yas + "\n");
			yazar.write("Tarih : " + tarih + "\n");
			yazar.write("Kay�t S�resi : " + kayitsuresiveri + "\n");
			yazar.write("Antreman Program� : " + programveri + "\n");
			yazar.write("#################################" + "\n" + "\n");
			System.out.println("�ye Kay�t ��lemi Tamamlanm��t�r.." + "\n");
			System.out.println("Ad� : " + ad);
			System.out.println("Soyad� : " + soyad);
			System.out.println("Telefon : " + telefon);
			System.out.println("Cins : " + cins);
			System.out.println("Boy : " + boy);
			System.out.println("Kilo : " + kilo);
			System.out.println("Ya� : " + yas);
			System.out.println("Tarih : " + tarih);
			System.out.println("Kay�t S�resi : " + kayitsuresiveri);
			System.out.println("Antreman Program� : " + programveri + "\n");
		}
		yazar.close();
	}

	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.println("----------------- **********--------------------");

			System.out.println("|                                              " + "|");
			System.out.println("|         SPOR SALONU OTOMASYONU V.1.0         " + "|");
			System.out.println("|                                              " + "|");
			System.out.println("----------------- **********--------------------");
			System.out.println("              1. YEN� �YE KAYDI");
			System.out.println("          2. KAYITLI �YELER� L�STELE");
			Scanner input = new Scanner(System.in);
			int veri = input.nextInt();
			if (veri == 1) {
				ekle();
			} else if (veri == 2) {
				oku();

			} else {
				System.out.println("Yanl�� Se�im Yapt�n�z. Tekrar Deneyin..");
			}
		}

	}
}