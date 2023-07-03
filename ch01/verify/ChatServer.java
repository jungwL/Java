package ch01.verify;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {
		InputStream is;
		ObjectInputStream ois;
		OutputStream os;
		ObjectOutputStream oos;
		String msg;
		try {
			ServerSocket ss=new ServerSocket(7000);
			System.out.println("연결중...");
			while(true) {
				Socket socket=ss.accept();	//클라이언트가 들어오는 것을 받아들이는 소켓
				is=socket.getInputStream();
				ois=new ObjectInputStream(is);
				msg=(String)ois.readObject();
				System.out.println(msg);
				
				os=socket.getOutputStream();
				oos=new ObjectOutputStream(os);
				oos.writeObject(msg);
			}
		} catch (Exception e) {
			
		}

	}

}
