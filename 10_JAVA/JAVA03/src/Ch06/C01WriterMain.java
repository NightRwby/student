package Ch06;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class C01WriterMain {
	public static void main(String[] args) throws IOException {
//		Writer fout = new FileWriter("C:\\IOTEST\\test1.txt",false);	//덮어쓰기
		Writer fout = new FileWriter("C:\\IOTEST\\test1.txt",true);		//이어쓰기
		String[] strs = {"aa","bb","cc","dd","ee"};
		for(String arr : strs) {FileWriter::fout};
		
		fout.write("TEST1\n");
		fout.write("TEST2\n");
		fout.write("TEST3\n");
		
		fout.flush();
		fout.close();
	}
}
