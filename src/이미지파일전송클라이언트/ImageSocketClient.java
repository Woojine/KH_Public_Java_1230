package 이미지파일전송클라이언트;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ImageSocketClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 6556);
        Scanner sc = new Scanner(System.in);
        System.out.println("전송 완료");
        InputStream is = socket.getInputStream();
        System.out.print("서버에서 파일이 전송되었습니다. 저장할 파일 경로를 지정 하세요 :");
        OutputStream ops = new FileOutputStream(sc.next());
        while(true) {
            int readByteNo = is.read();
            if(readByteNo == -1) break;
            ops.write(readByteNo);
        }
        is.close();
        ops.close();
        socket.close();

    }
}
