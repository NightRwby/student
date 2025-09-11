package Ch11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	
	public static void main(String[] args) throws Exception {
		
		ServerSocket server = new ServerSocket(7000);
		Socket client = server.accept();
		System.out.println("SERVER 와 연결 되었습니다");
		
		//
		InputStream in = client.getInputStream();
		OutputStream out = client.getOutputStream();
		//
		DataInputStream din = new DataInputStream(in);
		DataOutputStream dout = new DataOutputStream(out);
		
		//Worker생성
		ServerRecvThread recv = new ServerRecvThread(din);
		ServerSendThread send = new ServerSendThread(dout);
		//
		Thread th1 = new Thread(recv);
		Thread th2 = new Thread(send);
		//
		th1.start();
		th2.start();
		
		//
		th1.join();
		th2.join();
		
		//자원제거
		dout.close();
		din.close();
		out.close();
		in.close();
		client.close();
		server.close();	
		System.out.println("[Server] 연결 종료합니다");
	}
}
