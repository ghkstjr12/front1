package week04.day19.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {

   ServerSocket sc;  //서버소켓
   Socket cs;        //클라이언트 소켓  <-> 클라이언트랑 통신할수 있는 소켓 
   
   DataInputStream dis;  //보조스트림 입력물
   DataOutputStream dos; //보조스트림 출력용
   
   
   //생성자
   
   public Server1() {
      try {
         sc = new ServerSocket(6100);
         System.out.println(" 서버 준비!!!!");
         cs = sc.accept();
         System.out.println("server start");
         String clientIp=cs.getInetAddress().toString();
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
      // TODO Auto-generated method stub
      //스레드로 만들기
      Thread th = new Thread(new Runnable() {

         @Override
         public void run() {
            try {
               
               Scanner sc = new Scanner( System.in);
               
               while(true) {
               System.out.println("보낼메시지: ");
               String sendMsg = sc.next();
               dos.writeUTF(sendMsg);
               }   
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            
         }});
      th.start();
      /*
      try {
         
         Scanner sc = new Scanner( System.in);
         
         while(true) {
         System.out.println("보낼메시지: ");
         String sendMsg = sc.next();
         dos.writeUTF(sendMsg);
         }   
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      */
   }
   

   private void dataRecv() {
      Thread th = new Thread( new Runnable() {

         @Override
         public void run() {
            try {
               while(true){
               String recvMsg =dis.readUTF();
               System.out.println(recvMsg);
               }
            } catch (IOException e) {
               
               e.printStackTrace();
            }
            
            
         }});
      /*
      try {
         while(true){
         String recvMsg =dis.readUTF();
         System.out.println(recvMsg);
         }
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      */
      
      th.start();
      
   }

   public static void main(String[] args) {
      
      new Server1();

   }

}