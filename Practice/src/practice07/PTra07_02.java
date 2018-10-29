package practice07;
/*
 * PTra07_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_02 {
	public static void main(String[] args) {

		// ★ int型の配列arrayを宣言し、1000個の領域で確保してください
		final int limit = 1000;
		int[]array = new int [limit];

		// ★ 配列arrayに [1,2,3,4,5,6,7,・・・・,998,999,1000] を代入してください
		for(int i = 0; i < array.length; i++) {
			array[i] = 1 + i;  
		}
		//iを使いたいからノーマルfor文
		
		// ★ 変数arrayに格納されている値を前から順番に全て表示してください
		for(int tpm : array) {
			System.out.println(tpm);
		}
		//i使わなくていいから拡張for文
		
//		for (int型 tpm付けたい変数名 : array配列変数名){
//		  	System.out.println(変数名);
//		}
				
				
//		for(int j = 0; j < limit; j++) {
//			System.out.println(array[j]);

		
	}
}
