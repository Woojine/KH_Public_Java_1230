package 소켓명함다중전송서버;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class MultiChatThread extends Thread{
    Socket socket;
    static List<Socket> sockets = new ArrayList<>();
    public MultiChatThread(Socket socket) {
        this.socket = socket;
        sockets.add(socket);
    }
    @Override
    public void run() {
        try {
            for(int i = 0; i < sockets.size(); i++) {
                        OutputStream os = sockets.get(i).getOutputStream();
                        ObjectOutputStream oos = new ObjectOutputStream(os);
                        oos.writeObject(MultiSerialEx2.ncWrite()); //직렬화를 위해 객체를 write
                        oos.flush();
                        oos.close();
                        System.out.println(sockets.get(i).getRemoteSocketAddress().toString() + "에게 전송 완료");
                        os.close();
                    }
        } catch (IOException e) {}
    }
}
