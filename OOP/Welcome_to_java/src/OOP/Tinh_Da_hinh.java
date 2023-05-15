package OOP;

public class Tinh_Da_hinh extends Bike{

	void mesRun() {
		System.out.println("Con chạy bộ");
	}
	
	void mesStop() {
		System.out.println("Dừng");
	}
	
	public static void main(String[] args) {
		
		Bike bk = new Tinh_Da_hinh();
		bk.mesRun();
		
		Bike bi = new Bike();
		bi.mesRun();
		
		Tinh_Da_hinh dh = new Tinh_Da_hinh();
		dh.mesRun();
		dh.mesStop();

	}

}

class Bike{
	void mesRun() {
		System.out.println("Cha chạy bộ");
	}
}
