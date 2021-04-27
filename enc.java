package enc;

public class enc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "system";
		int key = 5;
		System.out.println(text);

		char[] chars = text.toCharArray();
		for (char c : chars) {
			c += key; // Change this to 1, and you can see how the acii chart is 
			// ex . (h) + 1i + 2j + k3 + 4l + 5m... so h -> m in +5
			System.out.print(c);
		}
		System.out.println(".");
		String dec = "x~xyjr";
		
		
		char[] decchars= dec.toCharArray();
		for (char c : chars) {
			
			c -= 3;
			System.out.print(c);
		}
	}
			
		

}
