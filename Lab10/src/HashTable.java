import java.util.LinkedList;

public class HashTable {

	public static Student[] hashTable = new String[500];
	
	public static boolean add(String input) {
		int ascii = hashCode(input);
		Student tempStudent = new Student(input,ascii);
		
		//First take in input, 
		//Then calculate hashcode
		//Next create a student object of that hashCode
		//Finally add it to the table
	}
	
	public static boolean resize() {
		
	}
	
	public static String find(String input) {
		
	}
	
	
	public static String hashCode(String input) {
		//This is a double hashing function
		//First calculate hash of first value
		//Then search the hashTable for that value, if there is a collision probe the second value
	}
	
	
	public static void main(String[] args) {
		System.out.println();

	}

}
