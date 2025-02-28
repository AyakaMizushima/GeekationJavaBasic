package basicSyntax;

public class Main {

	public static void main(String[] args) {
		int age = 30;
		double height = 181.9;
		
		int myAge = GeekIntroduction.ageResult(age);
		double myHeight = GeekIntroduction.heightResult(height);
		
		System.out.println("こんにちは!私はGeek君でごわす。");
		
		GeekIntroduction.greeting(myAge, myHeight);
		
		//main2を実行*
	    main2(args);
	}
	
	public static void main2(String[] args) {
		int num1 = 55;
		int num2 = 50;
		
		GeekIntroduction.specialSkill(num1, num2);
	}
	
}
