package assignment6;
import assignment6.NotVaildAutosarFileException;
import java.util.Arrays;
import java.util.Scanner;
import assignment6.EmptyAutosarFileException;
import java.time.LocalDate;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;
import java.util.Scanner;

public class EmptyAutosarFileException extends Exception {
	EmptyAutosarFileException()
	{}
	EmptyAutosarFileException(String msg){
		  super(msg);
	}
	
} 
   