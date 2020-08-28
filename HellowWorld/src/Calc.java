
public class Calc {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 16;
		int b = 4;
		CalcLogic calc = new CalcLogic();

		int total = calc.tasu(a,b);
		System.out.println(total);

		int delta = calc.hiku(a, b);
		System.out.println(delta);
		System.out.println("さとる");
	}

}
