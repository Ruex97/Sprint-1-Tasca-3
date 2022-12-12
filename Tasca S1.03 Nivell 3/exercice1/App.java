package exercice1;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;



public class App {

	public static void main(String[] args) throws IOException {
		// 1. Read CSV File
		ArrayList<String[]> people = fromCsvToArrayList();
		
		// 2. Store the info into ArrayList of Person
		ArrayList<Person> population = addPeople(people);
		
		// 3. Run menu
		menu(population);
	}
	
	static void menu(ArrayList<Person> population) {
		int option = -1;
		do {
		option = Tools.readInt("What do you want to do? \n\n"
				+ "1.- Enter new person \n"
				+ "2.- Show people by its name (A-Z)\n"
				+ "3.- Show people by its name (Z-A)\n"
				+ "4.- Show people by its surname (A-Z)\n"
				+ "5.- Show people by its surname (Z-A)\n"
				+ "6.- Show people by its id (1-9)\n"
				+ "7.- Show people by its id (9-1)\n"
				+ "0.- Quit.");
		
		
		switch(option) {
			case 1:
				addPerson(population);
			break;
			case 2:
				sortByName(population);
				for (Person person: population) {
					System.out.println(person.toString());
				}
			break;
			case 3:
				sortByName(population);
				for(int i=population.size()-1; i>=0 ; i--) {
					System.out.println(population.get(i).toString());
				}
			break;
			case 4:
				sortBySurname(population);
				for (Person person: population) {
				System.out.println(person.toString());
			}
			break;
			case 5:
				sortBySurname(population);
				for(int i=population.size()-1; i>=0 ; i--) {
					System.out.println(population.get(i).toString());
				}
			break;
			case 6:
				sortById(population);
				for (Person person: population) {
				System.out.println(person.toString());
			}
			break;
			case 7:
				sortById(population);
				for(int i=population.size()-1; i>=0 ; i--) {
					System.out.println(population.get(i).toString());
				}
			break;
			case 0:
				System.out.println("Goodbye!");
			break;
		}
		
		} while (option != 0);
		

	}
	
	static void addPerson(ArrayList<Person> population) {
		String name = Tools.readString("Enter the name");
		String surname = Tools.readString("Enter the surname");
		String id = Tools.readString("Enter the id");
		
		population.add(new Person(name, surname, id));
		
	}
	
	static void sortByName(ArrayList<Person> population) {
		Collections.sort(population, new NameComparator());
		
	}
	
	static void sortBySurname(ArrayList<Person> population) {
		Collections.sort(population, new SurnameComparator());
		
	}
	
	static void sortById(ArrayList<Person> population) {
		Collections.sort(population, new IdComparator());
	}
	
	
	
	static ArrayList<String[]> fromCsvToArrayList() throws IOException {
		ArrayList<String[]> people = new ArrayList<>();
		try {
			BufferedReader myBuffer = new BufferedReader(new FileReader("C:/Users/xavir/Desktop/data_lvl3.csv"));
			String line = "";
			while ((line = myBuffer.readLine()) != null) {
				people.add(line.split(","));
								
			}
			myBuffer.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return people;
		
	}
	
	
	static ArrayList<Person> addPeople(ArrayList<String[]> people){
		ArrayList<Person> population = new ArrayList<Person>(); 
		String name, surname, id;
		
		
		
		for (int i=0; i<people.size();i++) {
			name = people.get(i)[0];
			surname = people.get(i)[1];
			id = people.get(i)[2];
			
			population.add(new Person(name, surname, id));
		}
		
		return population;
		
	}
	
}
