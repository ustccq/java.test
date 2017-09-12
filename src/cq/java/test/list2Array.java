package cq.java.test;

import java.util.Arrays;
import java.util.List;

/**
 * @author meteor
 *
 */
public class list2Array {
 
	public static void main(String[] args) {
		String[] s = {"a","b","c"};
		List<String> list = Arrays.asList(s);
		System.out.println(list);
		
		String[] strings = new String[list.size()];
		list.toArray(strings);
		System.out.println(strings);
		
	}
	
}
