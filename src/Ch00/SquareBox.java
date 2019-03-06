package Ch00;

public class SquareBox extends Box {
	public static void main(String[] args) {
		Box obj2 = new Box();
		System.out.println(obj2.toString());

		Box obj3 = new SquareBox();
		System.out.println(obj3.toString());

		Box obj4 = new Box(10, 10, 10);
		System.out.println(obj4);
	}
}