package project4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Iterator;

public class EditMenuHandler implements ActionListener {
    WordGUI wordgui;

    // Constructor which takes in the WordGUI and allows access to its functions
    public EditMenuHandler (WordGUI wg) {
        wordgui = wg;
    }
    
    // Handles the logic for when the user clicks on the "Add" button
    public void actionPerformed(ActionEvent event) {
    	// If user clicks on add, then prompt the user to type in a new word
        String menuName = event.getActionCommand();
        String wordInput;
        if (menuName.equals("Add")) {
        	wordInput = JOptionPane.showInputDialog(null, "Enter a New Word to add to the GUI:");
        	// Attempt to instantiate a Word object using the inputed word
        	// If the new word is a valid word, then append it to the appropriate textArea 
        	try {
        		Word w = new Word(wordInput);
    	        // The first letter of the new word
    	        char firstLetter = wordInput.charAt(0);
    	    	//If the firstLetter is an 'A' or 'a', add the word to the 'a' textArea
    	    	if (firstLetter == 'A' || firstLetter == 'a') {
    	    		WordGUI.a.append(wordInput + "\n");
    	    	}
    	    	//If the firstLetter is an 'E' or 'e', add the word to the 'e' textArea
    	    	else if (firstLetter == 'E' || firstLetter == 'e') {
    	    		WordGUI.e.append(wordInput + "\n");
    	    	}
    	    	//If the firstLetter is an 'I' or 'i', add the word to the 'i' textArea
    	    	else if (firstLetter == 'I' || firstLetter == 'i') {
    	    		WordGUI.i.append(wordInput + "\n");
    	    	}
    	    	//If the firstLetter is an 'O' or 'o', add the word to the 'o' textArea
    	    	else if (firstLetter == 'O' || firstLetter == 'o') {
    	    		WordGUI.o.append(wordInput + "\n");
    	    	}
    	    	//If the firstLetter is a 'U' or 'u', add the word to the 'u' textArea
    	    	else if (firstLetter == 'U' || firstLetter == 'u') {
    	    		WordGUI.u.append(wordInput + "\n");
    	    	}
    	    	//If the firstLetter is not a vowel, add the word to the 'nonVowels' textArea
    	    	else {
    	    		WordGUI.nonVowels.append(wordInput + "\n");
    	    	}
        	}
        	// If the new word is not valid, then catch the exception, and print the invalid word to the console
        	catch (IllegalWordException iwe) {
        		System.out.println("IllegalWordException: INVALID WORD ENTERED: " +wordInput);
        	}
        }   
    } 
}
