package VIIII_Araba;

import java.util.ArrayList;

public abstract class Araba {
	
	protected String model;
	protected ArrayList<String>guzergah = new ArrayList<String>();
	
	public Araba() {
		
	}
	
	public void modeliYazdir() {
		System.out.println("Model : " + model);
	}
	
	public abstract void hizlan(int hizArtisMiktari);
	public abstract void bilgiler();
	public abstract void guzergahEkle(String lokasyon);
	public abstract void guzergahListele();
		
	
	
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	

}
