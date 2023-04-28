package assignment6;

public class InvalidFile {
	  public static void invalidFile (String file) throws NotVaildAutosarFileException  {
		    if(!(file.endsWith(".arxml"))) {
		    	throw new NotVaildAutosarFileException("Invalid file");
		    }
	
	  }

}
