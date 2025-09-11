package Ch11;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ServerSendThread implements Runnable{
	
	DataOutputStream dout;
	Scanner sc = new Scanner(System.in);
	
	public ServerSendThread(DataOutputStream dout) {
		this.dout = dout;
	}

	@Override
	public void run() {
		String send=null;
		while(true) {
			System.out.println("[Server (q:종료)] : ");
			send = sc.nextLine();
			//Server->Client(송신)
			try {
				dout.writeUTF(send);
				dout.flush();
				if(send.equals("q")) break;
					break;
			} catch (Exception e) {
				System.out.println("[EXCEPTION] 예외발생 SEND THREAD 종료");
			}
		}
		sc.close();
	}

}
