package 이미지파일전송서버;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ImageSocketServer {
    public static void main(String[] args) throws IOException {
       ServerSocket serverSocket = new ServerSocket(6556);
       Scanner sc = new Scanner(System.in);
       System.out.print("전송할 파일을 선택하세요(경로명/파일이름) :");
       Socket socket = serverSocket.accept();
       OutputStream ops = socket.getOutputStream();
       InputStream is = new FileInputStream(sc.next());
       while(true) {
           int readByteNo = is.read();
           ops.write(readByteNo);
           if(readByteNo == -1) break;
       }
       is.close();
       ops.flush();
       ops.close();
       socket.close();
       serverSocket.close();
    }
}
