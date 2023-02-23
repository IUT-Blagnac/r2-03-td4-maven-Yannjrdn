package lesschtroumpfs;


public class Village {
	private String Village;
	private Schtroumpf[] elts;
	private int nbst;
	private int salsepareille;
	
	public Village (String pfNomV, int pfStockSalsepareille, String[] pfNomsDesSchtroumpfs) {
		this.salsepareille=pfStockSalsepareille;
		this.Village=pfNomV;
		for (int i=0; i<pfNomsDesSchtroumpfs.length;i++) {
			this.elts[i]= new Schtroumpf(pfNomsDesSchtroumpfs[i], (int)(Math.random()*150));
		}
	}
	public String getNom() {
		return this.Village;	
	}
	public int getNbSchtroumpf() {
		return this.nbst;
	}
	public int getStockSalsepareille() {
		return this.salsepareille;
	}
	public  void solstice_d_ete() {
		for (int i =0; i<nbst;i++) {
			elts[i].sePresenter();
			elts[i].chanter();
		}
		System.out.println(Village);
		System.out.println("Nb de Schtroumpf="+nbst);
		int j=0;
		for (int i=0; i<nbst;i++) {
			if (elts[i].estContent()==true) {
				j++;
			}
		}
	System.out.println("il y a"+j+"Schtroumpf content");
	}
	
	
	
	


}

