package fst;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// Declaring ArrayList of String objects
		ArrayList<String> myList = new ArrayList<String>();
		// Adding objects to Array List at default index
		myList.add("Varun");
		myList.add("Ankit");
		myList.add("Bhuvan");
		// Adding object at specific index
		myList.add(3, "Shivaprasad");
		myList.add(1, "Sathvik");

		System.out.println("Print All the Objects:");
		for (String s : myList) {
			System.out.println(s);
		}

		System.out.println("3rd element in the list is: " + myList.get(2));
		System.out.println("Is Sathvik is in list: " + myList.contains("Sathvik"));
		System.out.println("Size of ArrayList: " + myList.size());

		myList.remove("Ankit");

		System.out.println("New Size of ArrayList: " + myList.size());
	}

}
