package Ch09;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class C01Server {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String line=null;
		
			
		//서버 소켓 생성
		Socket client = new Socket("192.168.5.50",7000); // IP:192.168.5.50 PORT : 7000

		
		
		while(true) {
			
			Socket client = server.accept();
			OutputStream out = client.getOutputStream();
			DataOutputStream dout = new DataOutputStream(out);
			System.out.println("접속자 IP : " + client.getInetAddress());
			dout.writeUTF("[SERVER] WELCOM TO SERVER" + new Date());
			dout.flush();
			dout.writeUTF(line);
			dout.flush();
			dout.close();
			out.close();
			client.close();
		}
	}
}
