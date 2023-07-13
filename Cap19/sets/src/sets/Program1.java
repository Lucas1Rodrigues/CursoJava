package sets;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program1 {
	public static void main(String[] args) {
		
	Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,6,8,10));
	Set<Integer> b = new TreeSet<>(Arrays.asList(1,3,5,7,9));
	
	//union
	Set<Integer> c = new TreeSet<>(a);
	c.addAll(b);
	System.out.println(c);
	
	//intersection
	Set<Integer> d = new TreeSet<>(a);
	d.retainAll(b);
	System.out.println(d);
	
	
	
	}
}