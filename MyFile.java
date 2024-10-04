package Tutorial;
import java.io.*;
public class MyFile {

	public static void main(String[] args) throws IOException {
		File f=new File("MyFile.txt");
		f.createNewFile();
		try {
			FileOutputStream fin=new FileOutputStream(f);
			String s="This is the University Exam for OODP.\n This a program to illustrate the use of files";
			fin.write(s.getBytes());
			System.out.println("content written");
			FileInputStream fout=new FileInputStream(f);
			int c;
			while((c=fout.read())!=-1) {
				System.out.print((char)c);
			}
		}catch(Exception e) {
			System.out.println("An error occured: "+e.getMessage());
		}

	}

}
