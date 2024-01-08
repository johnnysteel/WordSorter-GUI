package project4;

import java.util.regex.*;
public class Word implements Comparable<Word> {
	
	// One instance variable
	private String word;
	
	// One argument constructor with string parameter
	public Word (String w) {
		// If the word is invalid, then throw an exception
		if (!wordisValid(w)) {
			throw new IllegalWordException("Invalid word");
		}
		// Otherwise, set the instance variable to the string parameter
		else {
			this.word = w;
		}
	}
	
	// Uses regular expressions to check the validity of the word
	// Return true if the word contains only letters, and false if it does not
	public boolean wordisValid (String wordInput) {
	    Pattern p;
	    Matcher m;
	    p = Pattern.compile("^[a-zA-Z]*$");
	    m = p.matcher(wordInput);
	    return m.matches();
	}
	
	// Get method which returns the string representation of the word
	public String getWord() {
		return this.word;
	}
	
	// Set method which assigns the string parameter to the word variable
	public void setWord(String w) {
		this.word = w;
	}
	
	/* Determines if this Word object is equal to the parameter object. 
	 * They are equal if the parameter is of class Word and the two objects 
	 * contain the same word variable. 
	 */
	public boolean equals(Object other) {
		if (other == null || getClass() != other.getClass() || !getWord().equals(((Word) other).getWord())) {
			return false;
		}
			return true;
	}
		
	/* Returns a string representation of the word. 
	 * Overrides toString(). 
	 */
	public String toString() {
		return this.word; 
	}
	
	/* Compares a word to another Word object. 
	 * Returns either a positive or negative integer based on which 
	 * word comes first lexicographically.
	 */
	public int compareTo(Word other) {
		return word.compareTo(other.toString());
	}
}
