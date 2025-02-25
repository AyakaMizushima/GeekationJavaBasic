package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		//1
		int a = 30;
		int b = 15;

		boolean isGreaterA = ( a > b );
		System.out.println(isGreaterA);

		//2
		int isSunny = 1; //0なら晴れ以外、1なら晴れ
		int isWarm = 1; //0なら寒い、１なら暖かい

		boolean SandW = ( isSunny == 1 && isWarm == 1 );
		System.out.println(SandW); 

		//3
		int x = 5;
		int y = 10;

		boolean andResultA = ( x >= 0 && y % 2 == 0 );
		System.out.println(andResultA);

		//4
		int hasPermission = 1; //0なら許可なし、1なら許可あり

		boolean noPermission = !(hasPermission == 0);
		System.out.println(noPermission);
	}

}
