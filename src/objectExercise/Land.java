package objectExercise;

public class Land extends Property {
	private double size;
	
	Land(String name, String owner, String type, int price, double size) {
		super(name, owner, type, price);
		this.size = size;
	}
	public double getSize() {
		return this.size;
	}
	public void setLayout (double size) {
		this.size = size;
	}
	public void info() {
		super.info();
		System.out.println("広さ：" + size + "㎡");
		System.out.println("=============================");
	}
}
