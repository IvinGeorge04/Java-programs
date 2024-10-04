package pratice;
import java.util.*;
public class Tokenizer {
	public static void main(String args[]) {
		StringTokenizer st=new StringTokenizer("Welcome-to java-world students","-");
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
			System.out.println(st.countTokens());
		}
	}
}
