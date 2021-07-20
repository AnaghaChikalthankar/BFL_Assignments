package File_Handling;

import java.io.File;
import java.io.IOException;

public class TestFile {

	public static void main(String[] args) throws IOException {
		File dir = new File("D:\\Badminton");
		dir.mkdir();
		File dir1 = new File("D:\\Badminton\\courts");
		dir1.mkdir();
		File file1 = new File("D:\\Badminton\\singles");
		file1.createNewFile();
		
		File file2 = new File("D:\\Badminton\\doubles");
		file2.createNewFile();
		File filenew = new File("D:\\Badminton\\doubbles");
		boolean b = file2.renameTo(filenew);
		
		boolean b1 = file1.delete();
	
		
	}

}
