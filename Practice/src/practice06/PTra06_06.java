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
	 /  i/j 0 1 2 3 4(x)
	   * 0 □□□□□
	   * 1 ■□□□□   i0 j1 が■
	   * 2 ■■□□□
	   * 3 ■■■□□
	   * 4 ■■■■□
	   */

		for (int i = 0; i<5; i++) {     //6.５回(縦)
			for (int j = 0; j<5; j++) { //1.横一行↓その中身
				if( j<i ) {             //2.横より縦の数ご大きかったら
					System.out.print("■");//3.■ 改行なし
				} else {
					System.out.print("□");//4.そうでなかったら□ 改行なし
				}
			}
			System.out.println();        //5.改行
		}
		//■一つずつ


		for (int i = 0; i < 5;i++) {//↓の中身を5回繰り返す(縦5行)

			for (int j = 0; j < i; j++) {//ここが繰り返された回数+1の■を(i(5)回まで繰り返す)
				System.out.print("■");  //改行無しだからすぐ↓
			}
			for (int x = i; x < 5; x++) {//2週目だったら1<5で□□□□
				System.out.print("□");
			}
			System.out.println();//改行
		}

	}
}
