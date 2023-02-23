package lesschtroumpfs;

public class Schtroumpf {
	private String nom;
	private int age;
	private boolean content;
	
	public Schtroumpf(String pfnom,int pfage) {
		this.nom=pfnom;
		this.age=pfage;
		content=true;
	}
	
	public String getNom() {
		return this.nom;
	}
	public int getAge() {
		return this.age;
	}
	public boolean estContent() {
		return this.content;
	}
	public  String toString() {
		if (this.content==true) {
			return("Je suis"+this.nom+", j'ai "+this.age+"ans et je suis content");
	}	else {
			return("Je suis"+this.nom+", j'ai "+this.age+"ans et je suis PAS content");
	}
	}
	public  void sePresenter() {
		if (this.content==true) {
			System.out.println("Je suis"+this.nom+", j'ai "+this.age+"ans et je suis content");
	}	else {
			System.out.println("Je suis"+this.nom+", j'ai "+this.age+"ans et je suis PAS content");
	}
	}
	public String leChant() {
		if (this.content==true) {
			return("la, la, la Schtroumpf la, la");
		}else {
			return("gloups");
		}
	}
	public void chanter() {
		if (this.content==true) {
			System.out.println("la, la, la Schtroumpf la, la");
		}else {
			System.out.println("gloups");
		}
	}
	public void anniversaire() {
		this.age=this.age+1;
	}
	public void manger(int pfQte) {
		 if (pfQte>0) {
			this.content=true; 
	}else {
		this.content=false;
	}
		 }
	public void allerTravailler() {
		this.content=false;
	}
	
	
	
	
	
	
}