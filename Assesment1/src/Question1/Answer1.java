package Question1;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Answer1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new LinkedHashMap<>();
		map.put(1, "AAA");
		map.put(2, "BBB");
		map.put(3, "CCC");
		map.put(4, "DDD");
		map.put(5, "EEE");
		
		Answer1 a = new Answer1();
		

		a.printValue(map, 3);
	}
	
	
	public void printValue(Map<Integer, String> map1, int key) {
		
		Set<Integer> keys = map1.keySet();
		if(map1.containsKey(key)) {
			System.out.println(map1.get(key));
		}
	}
}
