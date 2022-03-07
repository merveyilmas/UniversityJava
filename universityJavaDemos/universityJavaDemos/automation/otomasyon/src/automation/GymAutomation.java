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
		System.out.println("Üyeler Baþarýlý Bir Þekilde Listelenmiþtir..");

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
		System.out.println("Üye Kiþi Sayýsýný Belirtiniz..");
		Scanner secimkisi = new Scanner(System.in);
		int secimkisi1 = secimkisi.nextInt();
		int uyesayisi = 0;
		uyesayisi += secimkisi1;
		for (int i = 0; i < secimkisi1; i++) {

			System.out.println("Üye Adý Giriniz :");
			Scanner adgiris = new Scanner(System.in);
			ad = adgiris.nextLine();
			System.out.println("Üye Soyadý Giriniz :");
			Scanner soyadgiris = new Scanner(System.in);
			soyad = adgiris.nextLine();
			System.out.println("Üye Telefonu Giriniz :");
			Scanner telefongiris = new Scanner(System.in);
			telefon = telefongiris.nextInt();

			System.out.println("Cinsiyet Seçiniz :");
			System.out.println("1. Kadýn");
			System.out.println("2. Erkek");
			Scanner cinsiyetgiris = new Scanner(System.in);
			cinsiyet = cinsiyetgiris.nextInt();
			switch (cinsiyet) {
			case 1:
				cins = "Kadýn";
				break;
			case 2:
				cins = "Erkek";
				break;
			}

			System.out.println("Üye Boyu Giriniz :");
			Scanner boygiris = new Scanner(System.in);
			boy = boygiris.nextDouble();
			System.out.println("Üye Kilosu Giriniz :");
			Scanner kilogiris = new Scanner(System.in);
			kilo = kilogiris.nextDouble();
			System.out.println("Üye Yaþý Giriniz :");
			Scanner yasgiris = new Scanner(System.in);
			yas = yasgiris.nextInt();
			System.out.println("Üye Kayýt Tarihi Giriniz :");
			Scanner tarihgiris = new Scanner(System.in);
			tarih = tarihgiris.next();

			System.out.println("Üye Kayýt Süresi Seçiniz :");
			System.out.println("1. 1 Aylýk");
			System.out.println("2. 2 Aylýk");
			System.out.println("3. 3 Aylýk");
			Scanner kayitsuresigiris = new Scanner(System.in);
			kayitsuresi = kayitsuresigiris.nextInt();
			switch (kayitsuresi) {
			case 1:
				kayitsuresiveri = "1 Aylýk";
				break;
			case 2:
				kayitsuresiveri = "2 Aylýk";
				break;
			case 3:
				kayitsuresiveri = "3 Aylýk";
				break;
			}
			System.out.println("Program Seçiniz :");
			System.out.println("1. Kas Programý");
			System.out.println("2. Kardiyo Programý");
			System.out.println("3. Zayýflama Programý");
			Scanner programgiris = new Scanner(System.in);
			program = programgiris.nextInt();
			switch (program) {
			case 1:
				programveri = "Kas Programý";
				break;
			case 2:
				programveri = "Kardiyo Programý";
				break;
			case 3:
				programveri = "Zayýflama Programý";
				break;
			}

			yazar.write("-------ÜYE BÝLGÝLERÝ-------" + "\n");
			yazar.write("Adý : " + ad + "\n");
			yazar.write("Soyadý : " + soyad + "\n");
			yazar.write("Telefon : " + telefon + "\n");
			yazar.write("Cinsiyet : " + cins + "\n");
			yazar.write("Boy : " + boy + "\n");
			yazar.write("Kilo : " + kilo + "\n");
			yazar.write("Yas : " + yas + "\n");
			yazar.write("Tarih : " + tarih + "\n");
			yazar.write("Kayýt Süresi : " + kayitsuresiveri + "\n");
			yazar.write("Antreman Programý : " + programveri + "\n");
			yazar.write("#################################" + "\n" + "\n");
			System.out.println("Üye Kayýt Ýþlemi Tamamlanmýþtýr.." + "\n");
			System.out.println("Adý : " + ad);
			System.out.println("Soyadý : " + soyad);
			System.out.println("Telefon : " + telefon);
			System.out.println("Cins : " + cins);
			System.out.println("Boy : " + boy);
			System.out.println("Kilo : " + kilo);
			System.out.println("Yaþ : " + yas);
			System.out.println("Tarih : " + tarih);
			System.out.println("Kayýt Süresi : " + kayitsuresiveri);
			System.out.println("Antreman Programý : " + programveri + "\n");
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
			System.out.println("              1. YENÝ ÜYE KAYDI");
			System.out.println("          2. KAYITLI ÜYELERÝ LÝSTELE");
			Scanner input = new Scanner(System.in);
			int veri = input.nextInt();
			if (veri == 1) {
				ekle();
			} else if (veri == 2) {
				oku();

			} else {
				System.out.println("Yanlýþ Seçim Yaptýnýz. Tekrar Deneyin..");
			}
		}

	}
}