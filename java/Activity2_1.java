package JavaActivity2_1;

public class Activity2_1 {

	public static void main(String[] args) {
		MyBook obj = new MyBook();
		String title = "Harry Potter & Half Blood Prince";
		obj.setTitle(title);
		System.out.println("The title is: " + obj.getTitle());
	}
}
