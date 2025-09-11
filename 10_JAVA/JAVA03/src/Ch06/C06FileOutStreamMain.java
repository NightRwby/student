package Ch06;

import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class C06FileOutStreamMain {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:\\IOTEST\\test6.txt");
		fos.write("가나다\n".getBytes(StandardCharsets.UTF_8));
		fos.write('a');
		fos.write('b');
		fos.write('c');
		fos.flush();
		fos.close();
	}
}
