package basic;

public class convert {

	public static void main(String[] args) {
		String str1 = "10";
		String str2 = "20";

		// String to Number
		int in1 = Integer.valueOf(str1).intValue();
		int in2 = Integer.valueOf(str2).intValue();

		// Cách viết khác
		double db1 = Double.parseDouble(str1);
		double db2 = Double.parseDouble(str2);

		System.out.println("Tổng int: " + (in1 + in2));
		System.out.println("Tổng double: " + (db1 + db2));

		System.out.println("\n");

		int num1 = 100;
		int num2 = 200;

		String st1 = Integer.toString(num1);
		String st2 = Integer.toString(num2);

		System.out.println("Nối chuỗi: " + (st1 + st2));
		
	}

}
