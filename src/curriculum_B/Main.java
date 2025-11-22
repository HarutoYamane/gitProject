package curriculum_B;

public class Main {

	public static void main(String[] args) {
		// Q4
		// Greetingクラスのインスタンスを生成し、sayHelloメソッドを呼び出す
		Greeting greeting = new Greeting();
		greeting.sayHello();
		
		System.out.println(); // 改行
		
		// Q5
		// Animalクラスのインスタンスを生成
		Animal animal = new Animal();
		animal.setAnimalName("ライオン"); //名前にライオンをセット
		animal.setBodyLength(2.1); //体長2.1mをセット
		animal.setSpeed(80); //速度に80km/hをセット
		
		System.out.println("動物の名前:" + animal.getAnimalName());
		System.out.println("体長:" + animal.getBodyLength() + "m");
		System.out.println("速度:" + animal.getSpeed() + "km/h");
	}
}
