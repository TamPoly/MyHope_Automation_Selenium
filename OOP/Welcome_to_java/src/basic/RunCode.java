package basic;


public class RunCode {
	
	/*
	 * Biến local (cục bộ) được khai báo trong các phương thức, hàm contructor, block
	 * Biến local được lưu trên vùng nhớ STACK của bộ nhớ
	 * Không sử dụng "access modifier" (public, private, default...) để khai báo biến local 
	*/
	
	public void local() {
		String name = "Dinh Van Tam";
		int n = 10;
		double v = 10.00;
		System.out.println(n + " & " + v + " là biến local!");
	}

	
	
	public static void main(String[] args) {
		System.out.println("==== Start Veriable====");
		RunCode runCode = new RunCode();
		runCode.local();
			
	}

}
