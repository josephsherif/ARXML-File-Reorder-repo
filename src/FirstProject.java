package firstProject;
import assignment6.NotVaildAutosarFileException;
import assignment6.*;
import java.util.Arrays;
import java.util.Scanner;
import assignment6.EmptyAutosarFileException;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import assignment6.Containers;
import assignment6.EmptyFile;
import assignment6.InvalidFile;


public class FirstProject {
	public static void main(String args[]) {
		String filename = args[0];

		try {	
	String start = null,end = null,id = null,encoding = null, endEncoding = null ,shortName = null,longName = null;
		    File f = new File(filename);
			Scanner sc = new Scanner(f);
			System.out.println(f.length());
			EmptyFile.empty(sc);	
			InvalidFile.invalidFile(filename);
			ArrayList<Containers> containers = new ArrayList<>();
			Containers [] array = new Containers[10];
			int counter=0,counter2 = 0;
			while (sc.hasNextLine()) {
			String buffer = sc.nextLine(); 
			if (buffer.contains("xml")) {
				encoding =buffer;
				continue;
			}
			else if ((!(buffer.contains("CONTAINER")) ||buffer.contains("AUTOSAR")) && counter2==0) {
				     start = buffer;
				     counter2++;
				     continue;
			}
			else if (buffer.contains("CONTAINER")) {
				id = buffer;
				shortName = sc.nextLine();
				longName = sc.nextLine();
				end = sc.nextLine();

				array[counter] = new Containers(shortName , longName , id , start , encoding , end );
					 containers.add(array[counter]);
					 counter++;

				continue;
				
			}
			else if (buffer.contains("AUTOSAR")) {
				endEncoding = buffer;
			}
		
			
			
			}
		Collections.sort(containers);
		String NewFile = filename.substring(0, filename.lastIndexOf(".arxml")) + "_mod.arxml";
		FileWriter writer = new FileWriter (NewFile);
		String newFile = "";
		for(int i = 0 ; i<containers.size() ; i++ ) {
			newFile += containers.get(i).getStartEncoding() + '\n';
			newFile += containers.get(i).getStart() + '\n';
			newFile += containers.get(i).getId() + '\n';
			newFile += containers.get(i).getShortName() + '\n';
			newFile += containers.get(i).getLongName() + '\n';
			newFile += containers.get(i).getEnd()+ '\n';
			
		}
		newFile +="</AUTOSAR>";
		writer.write(newFile);
		writer.close();
			
			
		}
		catch(EmptyAutosarFileException x) {
			         System.out.println(x);
		}
		catch(NotVaildAutosarFileException x) {
			System.out.println(x);
		}
		catch (IOException x) {
			System.out.println(x);
		}
		
	
	
	}

	

	
}





