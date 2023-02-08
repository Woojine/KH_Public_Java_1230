package 쓰레드예제7번;

import java.util.Scanner;

// 쓰레드의 안정한 종료(Stop 플래그, interrupt())
public class ThreadEx7 {
    public static void main(String[] args) throws InterruptedException {
//        RunThread runThread = new RunThread();
//        runThread.start();
//        Scanner sc = new Scanner(System.in);
//        runThread.start();
//        Thread.sleep(5);
//        runThread.setStop(true);
        InterruptThread interruptThread = new InterruptThread();
        interruptThread.start();
    }
}
