package basicSyntax;

public class GeekIntroduction {
	public static void greeting(String type, String result) {
		String typeName = "";
		
		switch (type) {
			case "age":
				typeName = "年";
				break;
			case "height":
				typeName = "身長";
				break;
		}
		System.out.println(typeName + "は" + result + "でごわす。");
	}
	public static int ageResult(int age) {
		return age;
	}
	public static double heightResult(double height) {
		return height;
	}
	
	public static void specialSkill(int num1, int num2) {
		int num = num1;
		
		while(num1 <= num && num <= num2) {
						
			if (num1 < 1 || num2 < 1) {
				System.out.println("num1とnum2は0より大きい値にしてください。");
				break;
			}
			else if (num1 >= num2) {
				System.out.println("num2はnum1より大きい値にしてください。");
				break;
			}
			else if (num1 > 300 || num2 >300) {
				System.out.println("num1とnum2は300以下にしてください。");
				break;
			}
			else if (num % 3 == 0 && num % 5 == 0) {
				System.out.println(num + "は3の倍数かつ5の倍数です。");
			}
			else if (num % 3 == 0) {
				System.out.println(num + "は3の倍数です。");
			}
			else if (num % 5 == 0) {
				System.out.println(num + "は5の倍数です。");
			}
			else {
				System.out.println(num);
			}
			num++;
		}
	}
}
