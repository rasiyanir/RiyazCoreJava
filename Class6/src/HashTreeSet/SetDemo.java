package HashTreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		Set<String> t = new TreeSet<String>();
		s.add("Peeyush");
		s.add("Peeyu");
		s.add("Peeyus");
		s.add("Ped");
		s.add("Dinesh");
		s.add("Rakshit");
		t.add("Peeyush");
		t.add("Dinesh");
		t.add("Rakshit");
		System.out.println("Hash Set: ");
		for(Iterator<String> it = s.iterator();it.hasNext();) {
			System.out.println("\t" + it.next());
		}
			System.out.println("Tree Set: ");
		for(Iterator<String> it2 = t.iterator();it2.hasNext();) {
			System.out.println("\t" + it2.next());
		}
			
			
		}
}
