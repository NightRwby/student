package Ch06;

import java.io.BufferedInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.net.URL;

public class C08URLStreamMain {
	public static void main(String[] args) throws Exception{
		URL url = (new URI("https://n.news.naver.com/mnews/article/138/0002203506")).toURL();
		InputStream is = url.openStream();
		
		//보조스트림 추가
		BufferedInputStream buffIn = new BufferedInputStream(is);	//보조스트림(보조공간)추가
		Reader rin = new InputStreamReader(buffIn);	//byte -> char 변환
		
		Writer fout = new FileWriter("C:\\IOTEST\\index.html");
		
		while(true) {
			int data = rin.read();
			if(data==-1)
				break;
			fout.write(data);
			fout.flush();
		}
		fout.close();
		rin.close();
		is.close();
	}
}
