package File_Handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FolderInfo {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter path of folder");
		try {		
		String path = scan.nextLine();
		File[] directories = new File(path).listFiles(File::isDirectory);
		 int l = directories.length;
	      System.out.println("List of Directories in folder :");
	      for(int i=0; i<l; i++)
	      {
	         System.out.println("name - "+directories[i].getName()+"\npath - "+directories[i]);
	      }
	      File[] file = new File("D:\\Java\\Eclipse Workspace\\D5Assignment").listFiles(File::isFile);
	      System.out.println("\nList of files : ");
	      for(int i=0; i<file.length; i++) {
	    	  System.out.println("name - "+file[i].getName()+"\npath - "+file[i].getAbsolutePath());
	      }}
	      catch(Exception e) {
	    	  System.out.println("No folder exist with the given name");
	    	  e.getMessage();}
}

}
