package 명함전송클라이언트;

import 명함전송서버.NameCard;
import 명함전송서버.NameCardServer;

import javax.print.attribute.standard.MediaSize;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class NameCardClient {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("192.168.10.245", 8990);
            InputStream is = socket.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(is);
            List<NameCard> ncList = new ArrayList<>();
            ncList = (List<NameCard>) ois.readObject();
            ois.close();
            socket.close();
            for(NameCard e : ncList) {
                System.out.println("=========명함 정보 출력========");
                System.out.println("이름 : " + e.getName());
                System.out.println("번호 : " + e.getPhNumber());
                System.out.println("메일 : " + e.getEmail());
                System.out.println("소속 : " + e.getAddress());
            }
        }catch (ConnectException e) {
            System.out.println("연결 실패");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
