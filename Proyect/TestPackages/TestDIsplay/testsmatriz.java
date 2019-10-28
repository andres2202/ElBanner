package TestDIsplay;

public class testsmatriz {
	public static void main(String[] args) {
		int[][] a = new int[8][8];
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = 0;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[a.length-1-i][a[i].length-1-j] = 1;
				System.out.print(a[i][j]);
			}
			System.out.println("");
		}
	}
}
