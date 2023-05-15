package Access_Modifiers;

public class Access_Modifiers {
	protected void msg_out_Pro() {
		System.out.println("Protected được gọi từ ngoài package nhưng phải kế thừa");
	}
	
	public static void main(String[] args) {
		//Call default trong cùng package
		defa df = new defa();
		df.msgDefa();
		
		System.out.println("\n");
		
		//Call protected trong cùng package
		pro pr = new pro();
		pr.msg_in_Pro();
	}
	
}


// private không thể gọi từ class khác, chỉ có thể sử dụng trong cùng class
class pri {
	private int data = 40; 
	
	private void msgPri() {
		System.out.println("Không thể gọi ra ngoài");
	}
}

// Default có thể được gọi khi ở cùng lớp hoặc cùng package
class defa {
	void msgDefa() {
		System.out.println("Default được gọi khi cùng lớp hoặc cùng package");
	}
}

// Protected có thể được gọi khi ở cùng class, cùng package hoặc từ 1 package khác
class pro {
	protected void msg_in_Pro() {
		System.out.println("Protected được gọi khi cùng class hoặc cùng package");
	}
	
}

