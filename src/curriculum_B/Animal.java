package curriculum_B;

public class Animal {
	private String animalName ; // 動物の名前
	private double bodyLength ; // 体長
	private int speed ; // 速度
	
	// デフォルトコンストラクタ（今回は処理なし）
	public Animal() {
	}
	
	// 動物の名前を返すメソッド
	public String getAnimalName() {
		return animalName;
	}
	
	// 体長を返すメソッド
	public double getBodyLength() {
		return bodyLength;
	}
	
	// 速度を返すメソッド
	public int getSpeed() {
		return speed;
	}
	
	// 動物の名前をフィールドに設定するメソッド
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	
	// 体長をフィールドに設定するメソッド
	public void setBodyLength(double bodyLength) {
		this.bodyLength = bodyLength;
	}
	
	// 速度をフィールドに設定するメソッド
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
