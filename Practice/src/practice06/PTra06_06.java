package practice06;
/*
 * PTra06_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_06 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
	 /  j/i 0 1 2 3 4
	   * 0 □□□□□
	   * 1 ■□□□□   i0 j1 が■
	   * 2 ■■□□□
	   * 3 ■■■□□
	   * 4 ■■■■□
	   */

		for (int i = 0; i<5; i++) { //一行を５回(横)
			for (int j = 0; j<5; j++) { //縦
				if( j<i ) { //縦より横が大きかったら■１
					System.out.print("■");
				} else {
					System.out.print("□");
				}
			}
			System.out.println();
		}


		for (int yo = 0; yo < 5;yo++) {//中身を5回繰り返し
			
			for (int ta = 0; ta < yo; ta++) {//左側から■の数
				System.out.print("■");
			}
			for (int gy = yo; gy < 5; gy++) {//右側から□の数
				System.out.print("□");
			}
			System.out.println();
		}

	}
}
