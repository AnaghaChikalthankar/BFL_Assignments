package Collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashSet;

public class states {

	public static void main(String[] args) throws IOException {
		
		File file = new File("States");
		file.createNewFile();
		FileReader fr = new FileReader("states");
		BufferedReader br = new BufferedReader(fr);
		
		LinkedHashSet<String> stateSet = new LinkedHashSet();
		
		String s=" ";
		while((s=br.readLine())!=null) {

			stateSet.add(s);
		} 
        br.close();    
        fr.close(); 
        
        System.out.println(stateSet);
        System.out.println("Total no. of states is : "+ stateSet.size());
        stateSet.remove("Delhi");
        System.out.println("After removing Delhi : ");
        System.out.println(stateSet);

       
        
		

	}

}
