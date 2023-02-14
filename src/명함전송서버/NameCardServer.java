package 명함전송서버;


import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.BindException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 1. 명함 정보를 담을 클래스 생성
// 2. list 생성 후 10명에 대한 명함 정보 입력
// 3. 서버는 accept() 에서 클라이언트 연결을 기다리다가 연결 요청이 오면 연결을 수락하고
// 4. 명함 전송 여부를 물어본 (전송 하시겠습니까? (Yes/ No)
// 5. 클라이언트에서 명합을 수신하면 출력하기
public class NameCardServer {
    static List<NameCard> ncList = new ArrayList<>();
    public static void main(String[] args) {
        ncWrite();
        ServerSocket serverSocket = null;
        Scanner sc = new Scanner(System.in);
        try {
            serverSocket = new ServerSocket(6556);
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("[클라이언트 : " + socket.getRemoteSocketAddress() + "] 연결");
                System.out.print("클라이언트로 명함을 전송하시겠습니까?(yes/no) : ");
                String select = sc.next();
                if (select.equalsIgnoreCase("yes")) {
                    OutputStream os = socket.getOutputStream();
                    ObjectOutputStream oos = new ObjectOutputStream(os);
                    oos.writeObject(ncList);
                    oos.flush();
                    oos.close();
                    os.close();
                }
            }
        } catch(IOException e) {}
    }

    static void ncWrite() {
        ncList.add(new NameCard("김진수", "010-4359-3454", "asd@naver.com", "부산"));
        ncList.add(new NameCard("손흥민", "010-3454-6565", "lse@naver.com", "서울"));
        ncList.add(new NameCard("이강인", "010-5462-8767", "kjg@naver.com", "광주"));
        ncList.add(new NameCard("황희찬", "010-1043-4723", "mzd@naver.com", "영국"));
        ncList.add(new NameCard("정우영", "010-7243-6571", "dge@naver.com", "울산"));
        ncList.add(new NameCard("조규성", "010-8916-4834", "trt@naver.com", "수원"));
        ncList.add(new NameCard("이재성", "010-9412-4815", "gre@naver.com", "인천"));
        ncList.add(new NameCard("황의조", "010-8889-7985", "gdc@naver.com", "평양"));
        ncList.add(new NameCard("황인범", "010-3314-4982", "ade@naver.com", "김해"));
        ncList.add(new NameCard("김민재", "010-9699-2258", "ngt@naver.com", "안산"));
    }
}