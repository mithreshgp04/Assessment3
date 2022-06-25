package com.prodapt.Assessment3;
import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BusinessLogic bl =new BusinessLogic();
		ArrayList<Library> libRecords = bl.addbucket();
		bl.addbooks();
		bl.displaybooks(libRecords);
		bl.updatebooks(libRecords);
		bl.deletebooks(libRecords);

	}

}
