package OOP;

public class Tinh_Dong_Goi {
	
	String fullName;
	int age;
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Tinh_Dong_Goi pack = new Tinh_Dong_Goi();
		
		pack.setFullName("Dinh Van Tam");
		pack.setAge(18);
		
		System.out.println("Ten đay du: " + pack.getFullName());
		System.out.println("Tuoi: " + pack.getAge());
	}

}
