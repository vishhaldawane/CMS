import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		
		numbers.add(50);
		numbers.add(10);
		numbers.add(60);
		numbers.add(20);
		numbers.add(80);
		
		Iterator<Integer> numIterator = numbers.iterator();
		
		while(numIterator.hasNext()) {
			
			Integer value = numIterator.next();
			System.out.println("value : "+value);
		}
		
		
	}
}
