import java.io.File;

public class DirChange {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String strDirBefore = "/Users/kenichi/temp/test_dir_change.txt";
		String strDirAfter = "/Users/kenichi/temp2/test_dir_change.txt";
		File beforeDir = new File("/Users/kenichi/temp/test_dir_change.txt");
		File afterDir = new File ("/Users/kenichi/temp2/test_dir_change.txt");
		System.out.println("ディレクトリ移動開始");
		System.out.println("移動前ディレクトリ:" + strDirBefore);
		System.out.println("移動後ディレクトリ:" + strDirAfter);

		if(beforeDir.renameTo(afterDir)) {
			System.out.println("移動成功");
		}else {
			System.out.println("失敗");
		}

	}

}
