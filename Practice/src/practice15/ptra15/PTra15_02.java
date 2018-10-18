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


		// roomに格納されたJava2MonthインスタンスのgetCurriculumメソッドを呼び出してください



		Room room = new Java2Month();
		//roomにgetCurriculumはない
		//Java2MonthのgetCurriculumを呼ぶ


		Java2Month j2m = (Java2Month)room;
		//このままだとj2mにroom代入できないからキャストする。→(Java2Month)
		//関係ないやつはダメ

		String[] list = j2m.getCurriculum();
        //戻り値ありのメソッド呼び → String[] list =



		// 取得したカリキュラム情報を全て出力してください

		//全て、一つずつ出力 → for文
		for( int i= 0 ; i<list.length; i++) {
			System.out.println(list[i]);
		}


	}
}
