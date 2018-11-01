/*
 * PTra17_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice17.ptra17;

import java.io.IOException;

import practice17.common.ThrowExceptionUtil;

public class PTra17_03 {
	public static void main(String[] args) {
		quiz();
	}

	public static void quiz() {
		final String[] question = {
				 "Javaの予約語となっている単語は次のうちどれか。\n1:static\t2:Sample\t3:java"
				,"次の中からMicrosoftの製品はどれか。\n1:GitHub\t2:サクラエディタ\t3:SQL Server"
				,"Javaが誕生した年は？（西暦で答えなさい）"
		};
		final int[] answer = {1, 3, 1995};

		int score = 0;

		System.out.println("クイズを始めます");

		/*
		 * ここから、例外処理を含めたプログラムになっています。
		 *
		 * ★入力された値が、数字以外であった場合、
		 * 「回答を数字で入力してください」
		 * から再度入力を求めるような形に仕様変更してください。
		 *
		 */
		for (int i = 0; i < question.length; i++) {   //ここは繰り返さなくていいから
			System.out.println("問題：" + (i + 1));   //whileに入れない
			System.out.println(question[i]);

			while(true) {            //繰り返したい部分は入力プログラム
				System.out.println("回答を数字で入力してください");
				try {
					String input = ThrowExceptionUtil.inputValue();//入力メソッド
					int num = Integer.parseInt(input); //intに変換メソッド
					if (answer[i] == num) {
						score++;
					}
					break; //trueの時はここで終了

					} catch(NumberFormatException e) {  //例外の時だけtry catch文で以下が実行される
						System.out.println("数字以外が入力されました");//ここはまだwhile文の中だから
					} catch(IOException e) {                           //入力プログラムに戻る
						System.out.println("例外が発生しました");
					}

				}
			}


		System.out.println("全ての問題が終わりました。");
		System.out.println("あなたの得点は・・・" + score + "点です！");
//		try {
//			for (int i = 0; i < question.length; i++) {
//				System.out.println("問題：" + (i + 1));
//				System.out.println(question[i]);
//				while(true) {
//					System.out.println("回答を数字で入力してください");
//					String input = ThrowExceptionUtil.inputValue();
//
//					try {
//						int num = Integer.parseInt(input);
//
//						if (answer[i] == num) {
//							score++;
//						}
//
//						break;
//					} catch(NumberFormatException e) {
//						System.out.println("数字以外が入力されました");
//					}
//				}
//			}
//		} catch(IOException e) {
//			System.out.println("例外が発生しました");
//		}
//
//		System.out.println("全ての問題が終わりました。");
//		System.out.println("あなたの得点は・・・" + score + "点です！");




	}

}
