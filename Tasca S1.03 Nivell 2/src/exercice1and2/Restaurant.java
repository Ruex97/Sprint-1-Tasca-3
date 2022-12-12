package exercice1and2;
import java.util.*;

public class Restaurant implements Comparable<Restaurant>{
	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", score=" + score + "]";
	}
	private String name;
	private int score;
	
	public Restaurant(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		Restaurant restaurant = (Restaurant) obj;
		boolean equality = this.name.equalsIgnoreCase(restaurant.getName()) 
				&& this.score == restaurant.getScore();
		return equality;
	} 
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	/* To consider that 2 object are equal 2 conditions must be fulfilled: 
	 * equals(object) return true
	 * if equals(object) return true, then hashCode() must return true aswell.
	 * Even though equals() isn't calling hashCode() it is necessary to keep the 
	 * contract between both methods: Two equal object must return same hash value for
	 */

	
	@Override
	public int compareTo(Restaurant o) {
		int x = -1;
		if(name.compareTo(o.getName()) == 0) {
			x = o.getScore() - score;
			
		} else if (name.compareTo(o.getName()) > 0){
			x = 1;
			
		}
		return x;
	}
			
	

}
