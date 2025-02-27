package basicSyntax;

public class Main {

	public static void main(String[] args) {
		int age = 30;
		double height = 181.9;
		
		int ageResult = GeekIntroduction.ageResult(age);
		double heightResult = GeekIntroduction.heightResult(height);
		
		System.out.println("こんにちは!私はGeek君でごわす。");
		
		GeekIntroduction.greeting("age", String.valueOf(ageResult));
		GeekIntroduction.greeting("height", String.valueOf(heightResult));
		
		//main2を実行*
	    main2(args);
	}
	
	public static void main2(String[] args) {
		int num1 = 10;
		int num2 = 50;
		
		GeekIntroduction.specialSkill(num1, num2);
	}
	
}
