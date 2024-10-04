package Tutorial;
import java.io.*;
public class CopyFile {
	public static void main(String args[]) throws IOException{
		File f1=new File("file1.txt");
		File f2=new File("file2.txt");
		if(f1.exists()&&f2.exists()) {
			System.out.println("file1 exits\nfile2 exists");
			try {
				FileInputStream f1in=new FileInputStream(f1);
				FileOutputStream f2out=new FileOutputStream(f2);
				int c=0;
				while((c=f1in.read())!=-1) {
					f2out.write(c);
				}
				System.out.println("file contents copied from file1 to file2");
				System.out.println("Contents of file1: ");
				FileInputStream f1in1=new FileInputStream(f1);
				while((c=f1in1.read())!=-1) {
					System.out.print((char)c);
				}
				System.out.print("\n");
				System.out.println("Contents of file2: ");
				FileInputStream f2in=new FileInputStream(f2);
				while((c=f2in.read())!=-1) {
					System.out.print((char)c);
				}
				f1in.close();
				f2out.close();
				f2in.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}else{
			System.out.print("Files doesn,t exists");
	}
}
}
