package InternalIteration;

import java.util.Arrays;
import java.util.List;

public class Java8Demo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		//list.forEach(System.out::println);
		
		//list.stream().forEach(System.out::println);
		
		//list.forEach(i -> System.out.println(doubleit(i)));
		
		//list.forEach(Java8Demo::doubleit);
		
		System.out.println(list.stream()
								.map(i -> i*2)
								.reduce(0, (c, e) -> c + e));
	}
	
	
	public static Integer doubleit(int i) {
		return i*2;
	}
	
}

