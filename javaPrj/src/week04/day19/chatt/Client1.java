package week04.day19.chatt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {

   Socket cs;
   
   DataInputStream dis;  //보조스트림 입력물
   DataOutputStream dos; //보조스트림 출력용
   
   
   public Client1() {
      
      //server Ip , port
      
      try {
         cs = new Socket("192.168.0.25",6100);
         System.out.println("connection ... ok");
         
         dis = new DataInputStream(cs.getInputStream()); //들어오는 길
         dos = new DataOutputStream(cs.getOutputStream()); // 나가는 길
         
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
      
      Thread th = new Thread( new Runnable() {

         @Override
         public void run() {
            try {
               while(true) {
               String recvMsg = dis.readUTF();
               System.out.println(recvMsg);
               }
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
            // TODO Auto-generated method stub
            
         }});
      /*
      try {
         while(true) {
         String recvMsg = dis.readUTF();
         System.out.println(recvMsg);
         }
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      */
      
      th.start();
      
   }






   private void dataSend() {
      
      Scanner sc = new Scanner(System.in);
      
      Thread th = new Thread(new Runnable() {

         @Override
         public void run() {
            // TODO Auto-generated method stub
            try {   
                while(true) {
               System.out.println("보낼 메세지");
               String  sendMsg = sc.nextLine();
               dos.writeUTF(sendMsg);
                }
               
            } catch (IOException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
            }
         }});
       
       /*try {   
          while(true) {
         System.out.println("보낼 메세지");
         String  sendMsg = sc.nextLine();
         dos.writeUTF(sendMsg);
          }
         
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      */
      th.start();
   }






   public static void main(String[] args) {
      
      new Client1();

   }

}