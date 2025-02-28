package objectExercise;

public class Apartment extends Property {
	private String layout;
	
	Apartment(String name, String owner, String type, int price, String layout) {	
		super(name, owner, type, price);
		this.layout = layout;
	}
	public String getLayout() {
		return this.layout;
	}
	public void setLayout (String layout) {
		this.layout = layout;
	}
	public void info() {
		super.info();
		System.out.println("間取り：" + layout);
		System.out.println("=============================");
	}
}
