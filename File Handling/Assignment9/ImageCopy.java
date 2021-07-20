package File_Handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy 
{
 
		public static void main(String[] args) throws IOException {
			FileInputStream fis=new FileInputStream("D:\\Badminton\ss.png");//Create input stream objects, associated images
			 FileOutputStream fos=new FileOutputStream("copy.png");//Create output stream object, associated copy
			int b;
			 while((b=fis.read())!=-1) {//Continuously read each byte
				 fos.write(b);//write each byte out
			}
			 fis.close();//Offflow release resources
			fos.close();
			 System.out.println("completed execution");
			
		}
	 

	}

		
		






