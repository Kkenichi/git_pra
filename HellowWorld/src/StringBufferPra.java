import java.util.ArrayList;
import java.util.List;

public class StringBufferPra {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		StringBuilder sb = new StringBuilder();
		List<String> strListA = new ArrayList<String>();
		strListA.add("1");
		strListA.add("2");
		strListA.add("3");
		strListA.add("4");
		System.out.println(strListA);
		System.out.println(concatStrList(sb, strListA));
	}

	private static String concatStrList(StringBuilder sb, List<String> strListA) {
		for(String str : strListA) {
			sb.append(str);
		}
		String strConCat = sb.toString();
		return strConCat;
	}

}
