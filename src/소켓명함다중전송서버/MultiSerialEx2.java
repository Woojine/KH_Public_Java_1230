package 소켓명함다중전송서버;

import 명함전송서버.NameCard;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 이름, 전화번호, 회사명, 이메일 포함된 10개의 명함 정보 생성후 다른 컴퓨터로 전송하기
// 연결된 클라이언트의 개수에 상관 없이 모든 클라이언트에 전송하기
public class MultiSerialEx2 {
    static List<NameCard> ncList = new ArrayList<>();
    public static void main(String[] args) {
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
                    Thread nameTh = new MultiChatThread(socket);
                    nameTh.start();

                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        static List<NameCard> ncWrite() {
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
            return ncList;
        }
    }
