package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		 
		Car car = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		Car[] cars = {car,car2,car3};
		
		car.color= "Red";
		car2.color = "Blue";
		car3.color = "yellow";
		
		car.gasoline =50;
		car2.gasoline =50;
		car3.gasoline =30;
		
		final int distance = 300;
		
		
		for(int i = 0; i < cars.length;i++) {
			
		
		int sum = 0;
		int n = 0;
		
		while(true) {
			
			int run = cars[i].run();
			n++;

			if(run == -1) {
				System.out.println(cars[i].color+"色の車は目的地に到達できませんでした");
				break;
			}


			sum += run;

			if(sum >distance ) {
				System.out.println(cars[i].color+"色の車は目的地にまで"+ n +"時間かかりました。残りのガソリンは、"+cars[i].gasoline+"リットルです。");
				break;
			}
		}
		}
		
	}
}
