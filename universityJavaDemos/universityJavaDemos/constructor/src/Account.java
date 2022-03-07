
public class Account {
	
	private String hesapNo;
	private double bakiye;
	private String isim;
	private String email;
	private String telno;
	
	public Account() {
		//System.out.println("Kendi yazdigimiz constructor...");
		
		/*
		this.bakiye=0.0;
		this.email="Bilgi yok";
		this.hesapNo="Bilgi yok";
		this.isim="Bilgi yok";
		this.telno="Bilgi yok"; */
		//yapýcý metot 
		
		this("Bilgi yok",0.0,"Bilgi yok","Bilgi yok","Bilgi yok");
		//üsttekinin kisaltilmiþ hali
	}
	
	public Account(String isim,String email,String telno) {
		this("Bilgi yok",0.0,isim,email,telno);
	}
	
	
	public Account(String hesapNo, double bakiye, String isim, String email, String telno) {
		super();
		this.hesapNo = hesapNo;
		this.bakiye = bakiye;
		this.isim = isim;
		this.email = email;
		this.telno = telno;
		//constructor(yapýcý metot)
	}
	
	public void bilgiGoster() {
		System.out.println("Hesap no:"+this.hesapNo);
		System.out.println("Bakiye:"+this.bakiye);
        System.out.println("Ýsim:"+this.isim);
		System.out.println("Email:"+this.email);
		System.out.println("Tel no:"+this.telno);
		
    }
	
	
    public String getHesapNo() {
		return hesapNo;
	}
	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelno() {
		return telno;
	}
	public void setTelno(String telno) {
		this.telno = telno;
	}
	
	
	public void paraYatir(double miktar) {
		bakiye+=miktar;
		System.out.println("Yeni bakiye:"+bakiye);
	}
	
	public void paraCekme(double miktar) {
		
		if(miktar>1500) {
			System.out.println("Bir günde 1500 den fazla çekemezsiniz!!");
		}
		if(bakiye-miktar<0) {
			System.out.println("Yeterli bakiye yok!!");
		}
		else {
			bakiye-=miktar;
			System.out.println("Yeni bakiye:"+bakiye);
		}
		
		
		
		
	}
	

}
