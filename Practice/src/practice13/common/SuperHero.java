package practice13.common;

public class SuperHero extends Hero {


	public SuperHero() {
	}

	private Item equipment;

	public Item getEquipment() {
		return this.equipment;
	}


	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

	
	
	public int attack() {
		return super.attack()+this.equipment.getAdditionalDamage();
  //親クラス(super)のアタックを(itemの変数名)equipmentの
  //(Itemクラスの)getAdditionalDamageを加えてオーバーライド。
  //equipmentはこのクラス内で宣言されてるからthisが付く
		
	}



	/*
	 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 *
	 * フィールド
	 * 		equipment	:	common.Item
	 * メソッド
	 * 		attackメソッドをオーバーライドし、
	 * 		powerに加えて、additionalDamage分を加算した値としてください
	 *
	 * 		equipmentのアクセサ
	 */

}
