package practice11;

import java.util.Scanner;

/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します
		Book[] books = FileReaderClass.readBookDataFile();
		//Book[] なのは、ReadFileクラスのとこに"配列"が返ってくるって書いてあったから
		//変数は何でもいいからとりあえず、books
		
		System.out.println("探したい本のタイトル（又はその一部）を入力してください");
		
		String line = new Scanner(System.in).nextLine(); //先ず入力プログラムの変数を宣言
		
		for(int i = 0; i < books.length; i++) {  //一つの本を取り出す
			if(books[i].title.contains(line)) {	 //containsは一部を含む、みたいな
			
			System.out.println(books[i]);
			}
		}
		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください

	}
}
