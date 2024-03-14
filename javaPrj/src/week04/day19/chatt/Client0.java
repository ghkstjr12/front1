package week04.day19.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client0 {
	
	Socket cs;
	
	DataInputStream dis; //보조스트림입력용
	DataOutputStream dos;	// 보조스트림출력용

	public Client0() {
		
		//server Ip, port
		try {
			cs = new Socket("192.168.0.6", 6100);
			System.out.println("connection...ok");
			
			dis = new DataInputStream(cs.getInputStream()); //들어오는길
			dos = new DataOutputStream(cs.getOutputStream()); //나가는 길
			
			dataSend();
			dataRecv();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void dataRecv() {
		try {
			String recvMsg = dis.readUTF();
			System.out.println(recvMsg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private void dataSend() {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("보낼 메시지");
			String sendMsg = sc.nextLine();
			dos.writeUTF(sendMsg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {

		Client0 c =  new Client0();
		
	}

}
