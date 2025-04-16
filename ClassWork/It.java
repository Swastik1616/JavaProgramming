package learning;
import java.util.*;

public class It {
	public static void main(String[] args) {
		ArrayList<String>names = new ArrayList<>();
		names.add("Java");
		names.add("Python");
		names.add("Swift");
		
//		Iterator<String> itr = names.iterator();
//		while(itr.hasNext()) {
//			String next = itr.next();
//			System.out.println(next);
//		}
		
		ListIterator<String> litr = names.listIterator(names.size());
		while(litr.hasPrevious()) {
			String previous = litr.previous();
			System.out.println(previous);
		}
	}
}
