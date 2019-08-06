package fr.jeux.java.training.bll;

public interface Pendu {
	
	public void initGame(String word);
	public boolean gagne();
	public String tryLetter(char letter);
	public String displayWord();
	public String usedLetters();
	public Integer remainingOpportunities();
}
