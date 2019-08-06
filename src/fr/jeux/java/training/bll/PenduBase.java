package fr.jeux.java.training.bll;

public class PenduBase implements Pendu {
	
	private Integer plays = 11;
	private String wordToFind;
	private String newWord = "";
	private StringBuilder oldWord = new StringBuilder();
	private StringBuilder letters = new StringBuilder();
	
	@Override
	public void initGame(String word) {
		wordToFind  = word;
	}
	
	@Override
	public boolean gagne() {
		return oldWord.toString().equals(wordToFind);
	}
	
	@Override
	public String displayWord() {
		if (wordToFind.length() != oldWord.length()) {
			for (int i = 0; i < wordToFind.length(); i++) {
				oldWord.append("-");
			}
		}
		
		return oldWord.toString();
	}
	
	@Override
	public String tryLetter(char letter) {
			for (int i = 0; i < wordToFind.length(); i++) {
				if (wordToFind.charAt(i) == letter) {
					oldWord.setCharAt((i), letter);
				}
			}
			letters.append(letter).append(" ");
			newWord = oldWord.toString();
			return newWord;
	}

	@Override
	public String usedLetters() {
		return letters.toString();
	}

	@Override
	public Integer remainingOpportunities() {
		return plays--;
	}

	
	
}
