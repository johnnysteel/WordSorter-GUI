package project4;

import java.awt.*;
import javax.swing.*;

public class WordGUI extends JFrame {
	
	//Static variables which will be used to display the window
	//Will be instantiated in the createAndShowGUI() method
	static JFrame myFrame;
	static Container myContentPane;
	static TextArea a, e, i, o, u, nonVowels;
	
	public WordGUI() {
		//Calls the function which will display the window
		createAndShowGUI();
	}
	
	public void createAndShowGUI() { 
		//Includes properties which help create and set up the window
		//Instantiate the JFrame window
		myFrame = new JFrame();
		//Obtains the contentPane for the window, which will contain all of the information
	    myContentPane = myFrame.getContentPane();
	    //Sets up specific textAreas for each vowel, and a textArea for nonVowels
	    //These textAreas can not be edited by the user
	    a = new TextArea();
	    a.setEditable(false);
	    e = new TextArea();
	    e.setEditable(false);
	    i = new TextArea();
	    i.setEditable(false);
	    o = new TextArea();
	    o.setEditable(false);
	    u = new TextArea();
	    u.setEditable(false);
	    nonVowels = new TextArea();
	    nonVowels.setEditable(false);
	    //Adds the textAreas to the contentPane
	    myContentPane.add(a);
	    myContentPane.add(e);
	    myContentPane.add(i);
	    myContentPane.add(o);
	    myContentPane.add(u);
	    myContentPane.add(nonVowels);
	    //Shaping the GUI
	    myFrame.setSize(400,400);
	    myFrame.setLocation(10, 100);
	    //Creates a gridLayout with two rows and three columns
	    myFrame.setLayout(new GridLayout(2,3));
	    myFrame.setTitle("Project 4 - Word GUI");
	    
	    // Instantiates the menubar and adds it to the jframe
	    // Instantiates an openItem, which will open a file
	    // Instantiates a quitItem, which will terminate the program
	    // Instantiates an addItem, which will prompt the user for another word to add to the GUI
        JMenuBar menubar = new JMenuBar();
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem quitItem = new JMenuItem("Quit");
        JMenuItem addItem = new JMenuItem("Add");
        myFrame.setJMenuBar(menubar);
        
        // Instantiates a fileMenu
        // Adds the fileMenu to the menubar
        // Adds the items to the fileMenu
        JMenu fileMenu = new JMenu("File");
        FileMenuHandler fmh  = new FileMenuHandler(this);
        menubar.add(fileMenu);
        fileMenu.add(openItem);
        openItem.addActionListener(fmh);
        fileMenu.addSeparator();
        fileMenu.add(quitItem);
        quitItem.addActionListener(fmh);
        
        // Instantiates an editMenu
        // Adds the editMenu to the menubar
        // Adds the addItem to the editMenu
        JMenu editMenu = new JMenu("Edit");
        EditMenuHandler emh = new EditMenuHandler(this);
        menubar.add(editMenu);
        editMenu.add(addItem);
        addItem.addActionListener(emh);
	    
        //Application ends when user closes the window
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //Sets the GUI to be visible, large enough to fit all of the information
	    myFrame.pack();
	    myFrame.setVisible(true);
	}
	
}