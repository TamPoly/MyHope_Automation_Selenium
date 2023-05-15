package OOP;

public class Tinh_Nap_Chong {
	
	public int fun1(int a, int b) {
		return a + b;
	}
	
	public int fun1(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		
		Tinh_Nap_Chong total = new Tinh_Nap_Chong();
		
		System.out.println(total.fun1(5, 10));
		System.out.println(total.fun1(5, 10, 20));
	}
}
