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
import java.util.*;

public class FileMenuHandler implements ActionListener {
    WordGUI wordgui;
    // Instantiates the treemap which will be used to store and sort the words
    static TreeMap<Word, Word> wordTreeMap = new TreeMap<Word, Word>();
    
    // Constructor which takes in the WordGUI and allows access to its functions
    public FileMenuHandler (WordGUI wg) {
        wordgui = wg;
    }
    
    // Handles the logic for when the user clicks on either the "Open" button or the "Quit" button
    public void actionPerformed(ActionEvent event) {
    	// If user clicks on open, then open and read the file
        String menuName = event.getActionCommand();
        if (menuName.equals("Open")) 
    	    openFile();
        // If user clicks on quit, then terminate the program
        else if (menuName.equals("Quit"))
            System.exit(0); 
    } 
    
    // Instantiates	a JFileChooser so the user can choose any file or directory from their computer
    public void openFile() {
	    JFileChooser chooser = new JFileChooser();
	    chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
	    chooser.showOpenDialog(null);
	    // Calls the function which will read the selected file that the user chose
	    readSource(chooser.getSelectedFile());
    }
    
    // Converts	the file name to a string and inserts it into TextFileInput to read the file
    public void readSource(File chosenFile) {
    	// Instantiate the TextFileInput object which will contain the content of the file
	    String chosenFileName = chosenFile.getPath();
	    TextFileInput inFile = new TextFileInput(chosenFileName);
	    // Reads the first line in the input file, and stores it in a string variable
	    String line = inFile.readLine();
	    // While the line exists
	    // Enter a try catch block which will determine the validity of the words in that line, and act accordingly
	    while (line != null) {
	    	// Instantiates a StringTokenizer object to read multiple words in the line
	    	// The StringTokenizer will contain each of the substrings which are separated by the delimiter (",. ")
	    	StringTokenizer myWordTokens = new StringTokenizer(line,",. ");
	    	// While the next token (word) exists
	    	while (myWordTokens.hasMoreTokens()) {
	    		// Create a string variable that stores the next token in the line
	    		String wordToken = myWordTokens.nextToken();
		    	// Attempt to instantiate a Word object using the token
		    	// If this is successful, then use that word object as a key for a (key, value) pair
		    	// Add that key value pair into the wordTreeMap
			    try {
				    Word w = new Word(wordToken);
				    wordTreeMap.put(w, null);
			    }
			    // If the word is not valid, then catch the exception, and print the invalid word to the console
			    catch(IllegalWordException iwe) {
				    System.out.println("IllegalWordException: INVALID WORD ENTERED: " +wordToken);
			    }
	    	}
	    	// Once there are no more tokens, move on to the next line and repeat the process
	    	line = inFile.readLine();
	    }
	    
	    // Since maps don't have iterators, the treemap must be converted to a set
	    // The set includes a collection of key/value pairs
	    Set<Entry<Word, Word>> set = wordTreeMap.entrySet();
	    // Iterate through the set
	    Iterator<Entry<Word, Word>> i = set.iterator(); 
	    Map.Entry <Word,Word> me;
	    while (i.hasNext()) {
	    	// Extract the first element of the set, which is a key/value pair
	        me = (Entry<Word, Word>) i.next();
	        // Retrieve the key, convert it to a string, and store it in a variable
	        String word = me.getKey().toString();
	        // The first letter of the key
	        char firstLetter = word.charAt(0);
	    	//If the firstLetter is an 'A' or 'a', add the word to the 'a' textArea
	    	if (firstLetter == 'A' || firstLetter == 'a') {
	    		WordGUI.a.append(word + "\n");
	    	}
	    	//If the firstLetter is an 'E' or 'e', add the word to the 'e' textArea
	    	else if (firstLetter == 'E' || firstLetter == 'e') {
	    		WordGUI.e.append(word + "\n");
	    	}
	    	//If the firstLetter is an 'I' or 'i', add the word to the 'i' textArea
	    	else if (firstLetter == 'I' || firstLetter == 'i') {
	    		WordGUI.i.append(word + "\n");
	    	}
	    	//If the firstLetter is an 'O' or 'o', add the word to the 'o' textArea
	    	else if (firstLetter == 'O' || firstLetter == 'o') {
	    		WordGUI.o.append(word + "\n");
	    	}
	    	//If the firstLetter is a 'U' or 'u', add the word to the 'u' textArea
	    	else if (firstLetter == 'U' || firstLetter == 'u') {
	    		WordGUI.u.append(word + "\n");
	    	}
	    	//If the firstLetter is not a vowel, add the word to the 'nonVowels' textArea
	    	else {
	    		WordGUI.nonVowels.append(word + "\n");
	    	}
	    }
	      
    }
   
}
