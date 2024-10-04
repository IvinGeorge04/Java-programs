package Tutorial;

import java.io.*;

public class WritingDisplay {
	public static void main(String[] args) throws IOException {
		File f3=new File("file3.txt");
		BufferedReader br=new BufferedReader(new FileReader(f3));
		String s;
		int i=1;
		while((s=br.readLine())!=null){
			System.out.println(i+" :"+s);
			i++;
		}
	}
}
