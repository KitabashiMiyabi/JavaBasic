package practice10;

public class Car {

	
	
	int serialNo;
	String color;
	int gasoline;


	int run() {
		this.gasoline--;
		int random = new java.util.Random().nextInt(15)+1;

		if(this.gasoline<0) {
			return -1;
		}

		return random;




	}

	/* メソッド
	 * 		戻り値(int)、メソッド名(run)、引数(なし)
	 * 			ガソリンを1消費して、ランダムな距離(1～15)進む（戻り値が進んだ距離）
	 * 			ガソリンが負の数になった場合（もう進めない）は-1を返します。
	 */



}
