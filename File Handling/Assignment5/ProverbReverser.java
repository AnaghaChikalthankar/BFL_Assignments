package File_Handling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ProverbReverser {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("TopProvreb");
		BufferedInputStream b = new BufferedInputStream(fin);
		
		int data = 0;int count = 0;
		
		Scanner scan = new Scanner(fin);
		 /*while((data = fin.read()) != -1)
			{
				System.out.print((char)data);
			}
			*/
		
	    while (scan.hasNextLine()) {
	      String reverse = new StringBuffer(scan.nextLine()).reverse().toString();
		  System.out.print(reverse);
	      }
		fin.close();
	  }

	}

