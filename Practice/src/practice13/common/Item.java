package practice13.common;

public class Item {
	
	/*
	 * common.Itemクラスを作成してください
	 *
	 * フィールド
	 * 		name	:	String
	 * 		additionalDamage	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 * コンストラクタ
	 * 		name, additionalDamageに初期値を設定するコンストラクタ
	 * 		上記2つを設定するための引数を持つ
	 */


	private String name;
	private int additionalDamage;
	
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	
	public int getAdditionalDamage() {
		return this.additionalDamage;
	}
	
	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}



   
	//インスタンス化した時に備え付けにする為のものが
	//コンストラクタ
	public Item(String name,int additionalDamage) {  
        this.name = name;
        this.additionalDamage = additionalDamage;
        //mainでname.additionalDamageを設定出来るようにしてる
    }

	/*
	 * ★ common.Itemクラスを作成してください
	 *
	 * フィールド
	 * 		name	:	String
	 * 		additionalDamage	:	int
	 * メソッド
	 * 		各フィールドのアクセサ
	 * コンストラクタ
	 * 		name, additionalDamageに初期値を設定するコンストラクタ
	 * 		上記2つを設定するための引数を持つ
	 */

}
