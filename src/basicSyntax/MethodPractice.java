package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 12;
		int b = 3;	
		
		int result1 = sumNum(a,b);
		int result2 = subNum(a, b);
		int result3 = byNum(a,b);
		int result4 = divNum(a,b);
		
		System.out.println("計算結果は" + result1 + "です。");
		System.out.println("計算結果は" + result2 + "です。");
		System.out.println("計算結果は" + result3 + "です。");
		System.out.println("計算結果は" + result4 + "です。");
	}
	//method 1
	public static int sumNum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	//method 2
	public static int subNum(int a, int b) {
		int sub = a - b;
		return sub;
	}
	//method 3
	public static int byNum(int a, int b) {
		int by = a * b;
		return by;
	}
	//method 4
	public static int divNum(int a, int b) {
		int div = a / b;
		return div;
	}	
}
