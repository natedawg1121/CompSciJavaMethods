public class Convert {
	public static void main(String[] args) {
		int x = 7;
		
		Integer i1 = new Integer(x);
		Double i2 = new Double(x);
		String i3 = new String(Integer.toString(x));
		
		int z = 1;
		double y = 1234.5678;
		
		System.out.printf("z = %02d y = %2.2f", z, y);
	}
}