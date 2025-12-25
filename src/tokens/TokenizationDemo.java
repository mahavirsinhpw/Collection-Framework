package tokens;

import java.util.StringTokenizer;

public class TokenizationDemo {
	public static void main(String[] args) {
		String str = "welcome to jtc";
		
		StringTokenizer st = new StringTokenizer(str);
		System.out.println(st.hasMoreTokens());
		System.out.println(st.countTokens());
		
		while(st.hasMoreTokens()) {
			String str1 = st.nextToken();
			System.out.println(str1);
		}
		System.out.println(st.hasMoreTokens());
		System.out.println(st.countTokens());
		
		StringTokenizer token = new StringTokenizer(str, "cm");
		System.out.println(token.hasMoreTokens());
		System.out.println(token.countTokens());
		
		while(token.hasMoreElements()) {
			Object o = token.nextElement();
			System.out.println(o);
		}
		
	}
}
