package File_Handling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class DocumentFormatter {
	public static void main(String[] args) throws IOException  {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter file name");
		String a = scan.nextLine();
		
		FileInputStream f = new FileInputStream("write1");
		BufferedInputStream b = new BufferedInputStream(f);
		FileOutputStream fos=new FileOutputStream(a);
	    
		int ch[]=new int[9999];
		  for(int i=1;i<=100;i++)
		  {
		  while((ch[i]=f.read())!=-1)
		   {
		      if(ch[i] == ' ') {
		    	continue;  
		      }
		      else {
		    	  fos.write(ch[i]);
		      }}}
		     		
		f.close();
		System.out.println("Done");	
	}}
