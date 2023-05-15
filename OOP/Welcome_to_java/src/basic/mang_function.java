package basic;

public class mang_function {

	public static void main(String[] args) {
		// Truyền mảng vào phương thức
		int a[] = { 6, 3, 5, 7 };
		mang(a);
		
		//Truyền giá trị vào đối số
		int func[] = new int[100];
		
		Input(func, 25);
		Print(func);
	}
	
	//So sánh từng phần tử trong mảng
	// Có thể thay void = int/float/string để trả về return
	static void mang(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min < arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min); //return min; trả về min để có thể sử dụng ở những nơi khác
	}
	
	static void Input(int arr[], int number_value) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = number_value;
		}
	}
	
	static void Print(int arr[]) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Phần tử thứ " + (i+1) + " của " + arr[i]);
		}
	}

}