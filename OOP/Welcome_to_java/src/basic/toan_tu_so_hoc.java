package basic;

public class toan_tu_so_hoc {
	
	static int ten = 10;
	static int five = 5;
	
	static int a = 1;
	
	static float chieu_dai = 20;
	static float chieu_rong = 10;
	
	static String first_name = "Tâm";
	static String last_name = "Đinh";
	
	public static void main(String[] args) {
		
		//Cộng, Trừ, Nhân, Chia
		float tong = ten + five;
		float tru = ten - five;
		float nhan = ten * five;
		float chia_nguyen = ten / five;
		float chia_du = ten % five;
		
		//Chu vi, Diện tích
		float chuvi = (chieu_dai + chieu_rong) * 2;
		float dientich = chieu_dai * chieu_rong;
		
		System.out.println("Tổng giữa 2 số là: " + tong);
		System.out.println("Hiệu giữa 2 số là: " + tru);
		System.out.println("Tích giữa 2 số là: " + nhan);
		System.out.println("Thương chia lấy phần nguyên là: " + chia_nguyen);
		System.out.println("Thương chia lấy phần dư là: " + chia_du);
		
		System.out.println("Chu vi là: " + chuvi);
		System.out.println("Diện tích là: " + dientich);
		
		System.out.println("\n");
		
		//Với a = 1 thì:
		
		//In ra, rồi mới tăng
		System.out.println(a++); 
		
		//Tăng, rồi mới in
		System.out.println(++a);
		
		//Cộng 1 và in, rồi mới tăng
		System.out.println(a+++1); 
		
		//Tăng, rồi mới cộng 1 và in ra
		System.out.println(++a+1);
		
		int a = 5;
		int b = 10;
		int c = 15;
		int d = 20;
		int e = 25;
		int f = 30;
		
		//b += a <=> b = b + a
				
		System.out.println(b += a);
		System.out.println(c -= a);
		System.out.println(d *= a);
		System.out.println(e /= a);
		System.out.println(f %= a);
		
	}
}