package generics;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	
	T value;
	List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first(T value) {
		if(list.isEmpty()) {
			throw new IllegalStateException("Don't exists values");
		}
		return list.get(0);
	}
	public void printar() {
		System.out.println(list.get(0));
	}
	
	
	
}
