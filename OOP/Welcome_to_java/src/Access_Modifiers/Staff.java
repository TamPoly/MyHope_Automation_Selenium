package Access_Modifiers;

public class Staff {
	public String fullName = "Tam";
	public int age = 21;
	public boolean gender = true;

	public void getInfo() {
		Staff st = new Staff();
		String gd = (st.gender) ? "Nam" : "Nữ";
		System.out.println("Staff Infomation include:");
		System.out.println(st.fullName);
		System.out.println(st.age);
		System.out.println(gd);
	}

	public int Sum(int a, int b) {
		return a + b;
	}

	public int Duplicate(int c, int d) {
		return c * d;
	}

	public void notFound() {
		System.out.println("Not Found");
	}
}