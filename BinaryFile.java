package Tutorial;
import java.io.*;
public class BinaryFile {

	public static void main(String[] args) throws IOException {
		try {
			File f=new File("binary.bin");
			InputStream fin=new FileInputStream(f);
			File f1=new File("binaryCopy.bin");
			f1.createNewFile();
			OutputStream fout=new FileOutputStream(f1);
			int i;
			while((i=fin.read())!=-1) {
				fout.write(i);
			}
		}catch(Exception e) {
			System.out.println("An error occurred: "+e.getMessage());
		}

	}

}
