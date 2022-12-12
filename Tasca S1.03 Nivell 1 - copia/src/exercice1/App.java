package exercice1;
import java.util.*;

public class App {

	public static void main(String[] args) {

		// I create an ArrayList of months called year and the month August
		ArrayList<Month> year = new ArrayList<Month>();
		Month august = new Month("August");
		
		// I add to the arrayList 11 months, and after that I add August in index 7, 
		addMonths(year);
		year.add(7, august);
		
		// Finally i print ArrayList
		for (int i=0;i<year.size();i++) {
			System.out.println(year.get(i).getName());
		}
		
		// I change the array into a HashSet and try to add a repeated element
		HashSet<Month> hashSet = new HashSet<>(year);
		hashSet.add(august);
	
		
		// I print the collection with for loop and an iterator.
		
		System.out.println("----Printing hashSet with for loop----");
		for (Month months : hashSet) {
			System.out.println(months.getName());
		}
		
		System.out.println("----Printing hashSet with an iterator----");
		Iterator<Month> it = hashSet.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}
		
		/* As we will see if we execute the program, i tried to add same object twice, but the
		 return of .add is false, so our program will only print once August. */
		
		
		
		
		

	}
	
	static void newMonthToArrayList(String name, ArrayList<Month> year) {
		Month myMonth = new Month(name);
		year.add(myMonth);
		
	}
	
	
	static void addMonths(ArrayList<Month> year) {
		newMonthToArrayList("January", year);
		newMonthToArrayList("February", year);
		newMonthToArrayList("March", year);
		newMonthToArrayList("April", year);
		newMonthToArrayList("May", year);
		newMonthToArrayList("June", year);
		newMonthToArrayList("July", year);
		newMonthToArrayList("September", year);
		newMonthToArrayList("October", year);
		newMonthToArrayList("November", year);
		newMonthToArrayList("December", year);
	}

}
