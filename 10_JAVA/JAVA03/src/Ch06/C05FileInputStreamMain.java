package Ch06;

import java.io.FileInputStream;
import java.io.IOException;

public class C05FileInputStreamMain {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\IOTEST\\test.pdf");
		long startTime = System.currentTimeMillis();
		StringBuffer stringBuffer = new StringBuffer();
		byte [] buff = new byte[4096];
		while(true) {
			int data = fis.read();
			if(data==-1)
				break;
//			stringBuffer.append((char)data);
//			stringBuffer.append(buff);
		}
		System.out.println("총길이 : " + stringBuffer.length());
		fis.close();
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : "+(endTime-startTime)+"ms");
	}
}
