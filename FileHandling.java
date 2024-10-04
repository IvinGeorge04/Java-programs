package pratice;
import java.util.*;
import java.io.*;
public class FileHandling {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			File f= new File("file.txt");
		if (f.createNewFile()) {
			System.out.println("File created: " + f.getName());
		} else {
			System.out.println("File already exists.");
		}
		
		System.out.println("\nFile operations:\n "); 
		System.out.println("File name : "+f.getName());
		System.out.println("Path: "+f.getPath());
		System.out.println("Absolute path:" +f.getAbsolutePath());
		System.out.println("Parent:"+f.getParent());
		System.out.println("Exists : "+f.exists());
		if(f.exists())
		{
			System.out.println("Is writeable:"+f.canWrite());
			System.out.println("Is readable"+f.canRead());
			System.out.println("Is a directory:"+f.isDirectory());
		}
		
		//reading file
		FileInputStream fin=new FileInputStream("file.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fin));
		String s;
		System.out.println("\nReading from a file: \n");
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
		
		//write file
		System.out.println("\nWriting onto a file: \n");
		FileOutputStream fout=new FileOutputStream("file.txt");
		System.out.println("Enter the content to write: ");
		String con=sc.nextLine();
		fout.write(con.getBytes());
		System.out.println("\nWritten");
		
		
		} catch (IOException e) {
			System.out.println("An error occurred: "+e);
		}
	}
}
