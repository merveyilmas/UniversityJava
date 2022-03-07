
public class Test {

	public static void main(String[] args) {
		/*
		Account account1=new Account();
		account1.setHesapNo("12345");
		account1.setBakiye(1000);
		account1.setIsim("Merve Yilmaz");
		account1.setEmail("yilmaz.67@outlook.com");
		account1.setTelno("***");
		
		System.out.println("Bakiye:"+account1.getBakiye());  */
			
		Account account2=new Account("123456",1000.0,"Merve YÝLMAZ","yilmaz.67@outlook.com","11111");
		
		/*
		account2.paraYatir(500);
		account2.paraCekme(2000); */
		
		Account account1=new Account(); //default deðerler veren yapýcý metot
		System.out.println("Hesap no:"+account1.getHesapNo());
		
		Account account3=new Account("Merve","yilmaz.67@outlook.com","12345");
		System.out.println("Email:"+account3.getEmail());
		System.out.println("Bakiye:"+account3.getBakiye());
		
		account3.bilgiGoster();
		

	}

}
