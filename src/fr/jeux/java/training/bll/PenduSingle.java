package fr.jeux.java.training.bll;

public class PenduSingle {
	
	static Pendu instance;
	
	public static Pendu getInstance() {
		if (instance == null ) instance = new PenduBase();
		return instance;
		
	}
}
