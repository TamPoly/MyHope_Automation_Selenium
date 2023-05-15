package OOP;

import Access_Modifiers.*;

public class Excercise_Staff extends Staff {

	public static void main(String[] args) {
		Excercise_Staff es = new Excercise_Staff();
		
		if(es.gender == true) {
			es.getInfo();
		} else 
			es.notFound();
		
		System.out.println("\n");
		es.Sum(5, 10);
		es.Duplicate(10, 20);
	}

}
