package basic;

public class veriable_static {
	/*
	 * Biến static được khai báo trong class với từ khóa là static, bên ngoài các phương thức, contructor, block
	 * Chỉ có duy nhất 1 bản sao của biến static được tạo ra
	 * Biến static được lưu trữ trong bộ nhớ static riêng
	 * Biến static được truy cập thông qua tên của class chứa nó, cú pháp: TenClass.TenBien
	 */
	
	//Biến static
	public static String name = "Đinh Văn Tâm";
	public static int age = 21;

	//Hàm có static mới gọi được biến static
	public static void main(String[] args) {
		//Sử dụng biến static bằng cách gọi trực tiếp
		System.out.println("Tôi tên là: " +name);
		
		//Sử dụng biến static bằng cách gọi thông qua tên class
		System.out.println("Năm nay tôi " + veriable_static.age + " tuổi");

	}

}
