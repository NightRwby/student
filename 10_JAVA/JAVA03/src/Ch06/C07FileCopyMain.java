package Ch06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class C07FileCopyMain {
	
	private static final String PATH="C:\\IOTEST\\";
	
	public static void main(String[] args) throws IOException {
		//args[0] : 원본파일경로(원본파일명)
		//args[1] : 복사대상경로(복사파일명)
		FileInputStream fis = new FileInputStream(PATH+args[0]);
		FileOutputStream fos = new FileOutputStream(PATH+args[1]);
		
		long startTime = System.currentTimeMillis();
		byte [] buff = new byte[4096];
		while(true) {
			int data = fis.read(buff);
			if(data==-1)
				break;
			fos.write(buff,0,data);
			fos.flush();
		}
		fos.close();
		fis.close();
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : "+(endTime-startTime)+"ms");
	}
}