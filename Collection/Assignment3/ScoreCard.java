import java.util.HashMap;
import java.util.Map;

public class ScoreCard {

	public static void main(String[] args) {
		Map<String,Integer> playermap = new HashMap<>();
		playermap.put("Rahane",20);
		playermap.put("Rahul",30);
		playermap.put("Kohli",150);
		playermap.put("Dhoni",50);
		playermap.put("Lokesh",2);
		
		int maxrun = 150;
		
		System.out.println("Players who batted : ");
		for(Map.Entry<String,Integer> map : playermap.entrySet()) {
			
			System.out.println(map.getKey());}
		
		System.out.println();
		System.out.println("Scores by Players : ");
		
		int sum = 0;
		for(Map.Entry<String,Integer> map : playermap.entrySet()) {
			System.out.println(map.getKey() +":"+map.getValue());
		     sum = sum +map.getValue();
		     
		     
			}
		
		System.out.println();
		String a = null;
		for(Map.Entry<String,Integer> map : playermap.entrySet()) {
			if(map.getValue()==maxrun) {
				 a = map.getKey();
		     }
			
		}
		System.out.println("Maximum runs scored by : "+ a);

			
				
			System.out.println("Total Score is : " + sum);
			System.out.println("Score by dhoni : " + playermap.get("Dhoni"));
		
		
		

	}

}
