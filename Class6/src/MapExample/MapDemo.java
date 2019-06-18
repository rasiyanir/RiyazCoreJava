package MapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("actor", "John");
		map.put("myName", "Riyaz");
		map.put("subject", "Java");
		
		System.out.println(map);
		
		Set<String> keys = map.keySet();
		
		for(String key : keys) {
			System.out.println(key + " " + map.get(key));
		}
		System.out.println();
		
		Set<Map.Entry<String, String>> key1 = map.entrySet();
		
		for(Map.Entry<String, String> k : key1) {
			System.out.println(k.getKey() + ":" + k.getValue());
		}
	}
}
