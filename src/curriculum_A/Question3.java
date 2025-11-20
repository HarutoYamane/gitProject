package curriculum_A;

public class Question3 {

	public static void main(String[] args) {
		byte byteNum = 10;
		short shortNum = 100;
		int intNum = 1000;
		long longNum = 10000L;
		float floatNum = 9.5f;
		double doubleNum = 10.5;
		char letter = 'a';
		String letters = "ハロー";
		boolean isBoolean = true;
		
		System.out.println(longNum + byteNum + intNum + shortNum);
		System.out.println(byteNum + byteNum);
		System.out.println(letter + " " + letters + " " + isBoolean);
		System.out.println((int)(byteNum + shortNum + intNum + longNum + floatNum + doubleNum));
		System.out.println(byteNum * shortNum * intNum * longNum);
		System.out.println(doubleNum / shortNum);
		System.out.println(byteNum - shortNum);
	}
}
