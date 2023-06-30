package Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hmap {

	public static void main(String[] args) {
		
	    Map<Integer, String> map = new HashMap<>();
	    
	    
		map.put (20,"Helloo");
		map.put (21,"How");
		map.put (22,"are");
		map.put (23,"you");
		//System.out.println(map);
		map.forEach((key,value)->System.out.println("K" +key+ " v" +value));
		Set<Entry<Integer,String>>set= map.entrySet();	
		System.out.println(map);
		System.out.println(set);

	}

}
