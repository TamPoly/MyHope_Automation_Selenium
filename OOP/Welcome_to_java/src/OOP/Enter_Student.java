package OOP;

import java.util.Scanner;

public class Enter_Student {
	String title = "Enter Staff Information";
	
	
	
	public static void main(String[] args) {
		
		Enter_Student es = new Enter_Student();
		System.out.println(es.title);
		
		Student sd = new Student();
		sd.getInfo();
	}
}
