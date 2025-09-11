package Ch06;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class C02ReaderMain {
	public static void main(String[] args) throws IOException {
		Reader fin = new FileReader("C:\\IOTEST\\test1.txt");
		
//		int data=0;
//		while(data!=-1) {
//			data = fin.read();
//			System.out.print((char)data);
//		}
		
//		while(true) {
//			int data = fin.read();
//			if(data==-1) 
//				break;
//			else
//				System.out.print((char)data);
//		}
		
		int data;
		while((data = fin.read())!=-1) 
			System.out.print((char)data);
		
		fin.close();
		
	}


}
