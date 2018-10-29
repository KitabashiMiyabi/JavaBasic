package practice06;
/*
 * PTra06_05.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_05 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * ■■■■■
		 * ■■■■■
		 * ■■■■■
		 * ■■■■■
		 * ■■■■■
		 */
		for( int i = 0 ; i < 25 ; i++ ) {//25コの■を
			System.out.print("■");
			if( i % 5 == 0 ) {           //５個で
				System.out.println();    //改行
			}
		}
		
//		for (int i = 0; i < 5; i++) {        2.５回繰り返す
//			for (int j = 0; j < 5; j++) {
//				System.out.print("■");      1.■＊５の一行を
//			}
//			System.out.println();
//		}

	}
}
