import java.util.ArrayList;
import java.util.List;

public class SampleList {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		List<String> aaList = new ArrayList<>();
		aaList.add("a");
		aaList.add(null);
		System.out.println(aaList);
		conatString(aaList);
	}
	public static void conatString(List<String> aaList) {
		String a = "1111";
		/*
		 *
		 */

		for(int i =0; i < aaList.size(); i++) {
			a = a + aaList.get(i);
			System.out.println(a);
		}
		System.out.println(a);

	}
}
