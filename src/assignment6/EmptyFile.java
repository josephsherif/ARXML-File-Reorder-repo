package assignment6;


import java.io.IOException;
import java.util.Scanner;

public class EmptyFile  {
	
	public static void empty(Scanner file) throws EmptyAutosarFileException, IOException  {
	 	   if (file.hasNext() == false) {
	 	 throw new EmptyAutosarFileException("Empty AUTOSAR file");
	 	   }
	 	
	  
	    }	
	}



