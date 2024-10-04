package oopj24csb38;
//import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
    	char[] c={'b'};
        removeCharFromString("abcbcdjfkd", c);
       // removeCharFromString("Pankaj", 'a');
    }

    private static void removeCharFromString(String input,char c[]) {
    	String str=new String(c);
        String result = input.replaceAll(str,"");
        System.out.println(result);
    }
}
