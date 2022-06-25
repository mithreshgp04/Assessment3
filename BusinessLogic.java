package com.prodapt.Assessment3;
import java.util.ArrayList;

public class BusinessLogic {
	
	public ArrayList<Library> addbucket(){
		
		
		Library l = new Library(1, "HarryPotter", "JK Rowling"); 
		Library l1 = new Library(2, "Java", "James"); 
		Library l2 = new Library(3, "Cpp", "Muthu"); 
		Library l3 = new Library(4, "Python", "Joan"); 
		Library l4 = new Library(5, "MySQL", "Punitha"); 
		
		ArrayList<Library> libRecords = new ArrayList<Library>();
		
		libRecords.add(l);
		libRecords.add(l1);
		libRecords.add(l2);
		libRecords.add(l3);
		libRecords.add(l4);
		
		return libRecords;
	}
	
	void addbooks() {
		
		System.out.println("The books details are being added");
		
	}
	
	void displaybooks(ArrayList<Library> libRecords) {
		
		System.out.println("Currently the books available are " );
	for(Library lb : libRecords) {
		
		System.out.println(lb);
	}
	}
	
	void updatebooks(ArrayList<Library> libRecords) {
		
		Library updateLibrary = new Library(4,"HTML","Goushika");
		libRecords.add(updateLibrary);
		System.out.println("The updated Record is "+libRecords);
	}
	
	void deletebooks(ArrayList<Library> libRecords) {
		
		libRecords.remove(3);
		System.out.println("One Data has been removed");
		System.out.println("The New Record is shown here"+libRecords);
	}

}
