package OOP;

import java.util.Scanner;

public class Student {
	String name;
	int age;

	public void cons(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void getInfo() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		
		System.out.println("\n");

		System.out.println("My name: " + name);
		System.out.println("My age: " + age);
		
	}
}
