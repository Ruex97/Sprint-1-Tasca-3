package exercice3;

import java.io.*;
import java.util.*;


public class App {

	public static void main(String[] args) {
			
		HashMap<String, String> countriesAndCapitals = new HashMap<String, String>();
		FileReader data = null;
		
		// i read file countrties.txt 
			
		try {
			data = new FileReader("C:/Users/formacio/Desktop/xavi Rue/countries.txt");
			BufferedReader myBuffer = new BufferedReader(data);
			String line;
			String [] parts;
			
			
			while ((line = myBuffer.readLine()) != null ) {
					parts = line.split(" ");
					countriesAndCapitals.put(parts[0], parts[1]);		
				}
			data.close();
				
		} catch (IOException e) {
			System.out.println("file not found");
		} 
		
		String username = typeString("Enter a username");
		int rounds = 10;
		int i = 0;
		int score = 0;
		Random generator = new Random();
		Object[] keys = countriesAndCapitals.keySet().toArray();
		

				
		while (i < rounds) {
			Object randomKey = keys[generator.nextInt(keys.length)];
			String answer = typeString("Country: " + randomKey + ". Enter its capital");
			if (answer.equalsIgnoreCase(countriesAndCapitals.get(randomKey)))// MAL, com faig que coincideixi {
				score += 1;
			i++;
			}
		
		FileWriter myWriter = null;;
			try {
				myWriter = new FileWriter("C:\\Users\\formacio\\Desktop\\xavi Rue\\Ranking.txt");
				myWriter.write("Username: " + username + " has " + score + " points.");
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					myWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
			System.out.println("Congrats " + username + ", you obtained " + score + " points.");

		}

		
		

	
	static String typeString(String str) {
		Scanner input = new Scanner(System.in);
		System.out.println(str);
		String sentence = input.nextLine();
		return sentence;
	}
	
	
}
