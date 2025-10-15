import java.io.FileReader;
import java.io.*;
class FileReaderExample
{
	public static void main(String[] args)throws Exception {
	FileReader fr = new FileReader("D:\\HCL Training\\a.txt");
	int i;
	while ((i = fr.read()) != -1)
	System.out.print((char)i);
	fr.close();

	}
}