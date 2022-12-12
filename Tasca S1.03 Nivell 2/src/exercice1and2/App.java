package exercice1and2;

import java.util.*;

public class App {

	public static void main(String[] args) {
		HashSet<Restaurant> restaurants = new HashSet<Restaurant>();
		
		restuarantToHashSet("ratatouille", 10, restaurants);
		restuarantToHashSet("ratatouille", 10, restaurants);
		restuarantToHashSet("ratatouille", 8, restaurants);
		restuarantToHashSet("ratatouille", 8, restaurants);
		restuarantToHashSet("mcdonalds", 3, restaurants);
		restuarantToHashSet("mcdonalds", 4, restaurants);
		restuarantToHashSet("ABAC", 9, restaurants);
		restuarantToHashSet("Karlos arguinyano", 7, restaurants);
		
		
		for(Restaurant myRestaurants: restaurants) {
			System.out.println("Restaurant: " + myRestaurants.getName() + " Puntuacio: " + myRestaurants.getScore());
			
		}
		
		//-------- Exercice 2 -------
		
		 TreeSet<Restaurant> orderedRestaurants = new TreeSet<Restaurant>(restaurants);
		 for(Restaurant myRestaurants: orderedRestaurants) {
				System.out.println("Restaurant: " + myRestaurants.getName() + " Puntuacio: " + myRestaurants.getScore());
				
			}

	}
	/**
	 * 
	 * @param name
	 * @param score
	 * @param restaurants
	 */
	static void restuarantToHashSet(String name, int score,HashSet<Restaurant> restaurants) {
		Restaurant rest = new Restaurant(name, score);
		restaurants.add(rest);
	}

}
