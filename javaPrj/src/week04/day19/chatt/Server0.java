package week04.day19.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server0 {
	
	ServerSocket sc;
	Socket cs;
	
	DataInputStream dis; //보조스트림
	DataOutputStream dos; //보조스트림
	
	
	public Server0() {
		try {
			sc = new ServerSocket(6100);
			System.out.println("서버 준비!!");
			cs = sc.accept();
			System.out.println("server start");
			String clientIp = cs.getInetAddress().toString();
			System.out.println(clientIp);
			
			dis = new DataInputStream(cs.getInputStream());
			dos = new DataOutputStream(cs.getOutputStream());
			//받기
			dataRecv();
			dataSend();
			
			//보내기
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //포트번호
	}
	private void dataSend() {
		
		
		try {
	
		Scanner sc = new Scanner (System.in);
		System.out.println("보낼메시지: ");
		String sendMsg = sc.nextLine();
			dos.writeUTF(sendMsg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void dataRecv() {
		// TODO Auto-generated method stub
		try {
			String recvMsg = dis.readUTF();
			System.out.println(recvMsg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new Server0();
	}

}
