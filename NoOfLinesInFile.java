package Tutorial;
import java.io.*;
public class NoOfLinesInFile {
	public static void main(String[] args) throws IOException{
		try {
			File f=new File("input.txt");
			String s;
			int i=0;
			BufferedReader br=new BufferedReader(new FileReader(f));
			while((s=br.readLine())!=null) {
				System.out.println(s);
				i++;
			}
			System.out.println("the number of lines is: "+i);
		}catch(Exception e) {
			System.out.println("An error occured: "+e.getMessage());
		}
	}

}
