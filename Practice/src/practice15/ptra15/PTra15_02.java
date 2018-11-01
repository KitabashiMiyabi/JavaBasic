/*
 * PTra15_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice15.ptra15;

import practice15.common.Java2Month;
import practice15.common.Room;

public class PTra15_02 {
	public static void main(String[] args) {


		Room room = new Java2Month();
		
		//★ roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください

		//roomにgetCurriculumはないから
		//roomを継承したJava2MonthのgetCurriculumを呼びたい
        //多態性は親クラスにあるメソッドしか呼び出せない
		
		Java2Month j2m = (Java2Month)room;
		//このままじゃ呼べないから親クラスを子クラスに入れたい
		//普通じゃ入れられないからキャストする
		//親子関係だからおｋ。関係ないやつはダメ

		


		// 取得したカリキュラム情報を全て出力してください

		
		String[] list = j2m.getCurriculum();
        //戻り値ありのメソッド呼び → String[] list =
		
		//一つずつ出力 → for文
		for( int i= 0 ; i<list.length; i++) {
			System.out.println(list[i]);
		}


	}
}
