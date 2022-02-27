
public class MemoryMapsPractice1 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 10;
		String test = "hi";
		test = test + "hello";
		int c = a + b;
		int maybe = c > 0 ? 100 : 200;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(test);
		System.out.println(maybe);
		
		String test2 = "hello";
		System.out.println(test2.substring(test2.length()-2, test2.length()));

	}

}
