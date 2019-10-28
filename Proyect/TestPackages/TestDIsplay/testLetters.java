package TestDIsplay;

import models.Letter;

public class testLetters {
		public static void main(String[] args) {
			Letter a = new Letter(9,9,'P');
			int[][] as = a.getLetter();
			for (int i = 0; i < as.length; i++) {
				for (int j = 0; j < as[i].length; j++) {
					System.out.print(as[i][j]);
				}
				System.out.println("");
			}
		}
}
