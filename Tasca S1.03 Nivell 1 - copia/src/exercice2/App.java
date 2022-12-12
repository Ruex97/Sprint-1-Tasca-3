package exercice2;
import java.util.*;

public class App {

	public static void main(String[] args) {
		// I create 2 lists of ints and add 10 ints to the first
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		addTenInts(list1);
	
		// I merge first list into second one reversing the order with ListIterator
		reverseList(list1, list2);
		
		// I print both lists to confirm they are in reversed order
		for (Integer x : list1) {
			System.out.println(x);
		}
		
		System.out.println("--Reversed list--");
		
		for (Integer x : list2) {
			System.out.println(x);
		}
		
	}
	
	static void newIntegerToArrayList(Integer x, List<Integer> list1) {
		list1.add(x);
		
	}
	
	static void addTenInts(List<Integer> list1) {
		newIntegerToArrayList(1, list1);
		newIntegerToArrayList(2, list1);
		newIntegerToArrayList(3, list1);
		newIntegerToArrayList(4, list1);
		newIntegerToArrayList(5, list1);
		newIntegerToArrayList(6, list1);
		newIntegerToArrayList(7, list1);
		newIntegerToArrayList(8, list1);
		newIntegerToArrayList(9, list1);
		newIntegerToArrayList(10, list1);
	}
	
	static void reverseList(List<Integer> list1, List<Integer> list2) {
		ListIterator<Integer> it = list1.listIterator(list1.size());
		while (it.hasPrevious()) {
			list2.add((it.previous()));
		}
	}

}
