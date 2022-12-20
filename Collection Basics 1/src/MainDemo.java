import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainDemo {

	public static void main(String[] args) {

		List<Integer> lst = new ArrayList();
		lst.add(10);
		lst.add(30);
		lst.add(20);
		lst.add(50);
		lst.add(40);
		
		System.out.println("List : ");
		System.out.println("is ordered collection of elements");
		System.out.println("allows duplicates");
		System.out.println("List Is : "+lst);
		
		
		Set<Integer> set = new TreeSet();
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(50);
		set.add(40);
		System.out.println("\n\nSet : ");
		System.out.println("is unordered collection of elements");
		System.out.println("does NOT allow duplicates");
		System.out.println("Set Is : "+set);
		
		
	}

}
