package File_Handling;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ProverbCollection {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter proverbs");
		String pro[] = new String[20];
		int count = 0;
		
		FileOutputStream f = new FileOutputStream("TopProvreb");
		BufferedOutputStream b = new BufferedOutputStream(f);
		
		for(int i =0;i<=19;i++) { 
			pro[i] = scan.nextLine();			
			if(pro[i].equals("STOP")) {
				break;										
		}
			else {count++;}	}
		String a1 = " ";
		for(int i =0;i<count;i++) {	
			byte[] a = pro[i].getBytes();
			
			f.write(a);
			
			f.write(a1.getBytes());			
		} 
		f.close();
		System.out.println("Done");
	}
}	
		
	


