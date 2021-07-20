package File_Handling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ProverbReader  {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("TopProvreb");
		BufferedInputStream b = new BufferedInputStream(fin);
		
		int data = 0;
		while((data = fin.read()) != -1)
		{
			System.out.print((char)data);
		}
		
		fin.close();
		

	}

}
