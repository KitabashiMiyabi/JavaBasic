/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import practice18.entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<>();
		try (Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
			while (scanner.hasNext()) {
				String line = scanner.nextLine();

				// ★lineをsplitして配列型にしてください

				String[] list = line.split(",");

				// Plaerインスタンスを作ってください

				Player player = new Player();

				// 配列の中身をインスタンスのフィールドにセット
				player.setPosition(list[0]);
				player.setName(list[1]);
				player.setCountry(list[2]);
				player.setTeam(list[3]);
				// インスタンスをarrayに追加してください

				array.add(player);

			}
		} catch (FileNotFoundException e) {
			System.out.println("ファイルが見つかりません");
		}


		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください

		Collections.shuffle(array);
		int GKcount = 0;

		for( Player player :array) {
			if(player.getPosition().equals("GK")) {
				System.out.println(player);
				GKcount++;
				if(GKcount>=1) {
					break;
				}
			}
			
		}
		
		int DFcount = 0;
		
		for( Player player :array) {
			if(player.getPosition().equals("DF")) {
				System.out.println(player);
				DFcount++;
				if(DFcount>=4) {
					break;
				}
			}
			
		}
		
		int MFcount = 0;
		for( Player player :array) {
			if(player.getPosition().equals("MF")) {
				System.out.println(player);
				MFcount++;
				if(MFcount>=4) {
					break;
				}
			}
			
		}
		
		int FWcount = 0;
		for( Player player :array) {
			if(player.getPosition().equals("FW")) {
				System.out.println(player);
				FWcount++;
				if(FWcount>=2) {
					break;
				}
			}
			
		}
		
		
		


	}
}
