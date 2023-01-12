package Person상속;
// 인간(Person) 클래스 만들기
// - age (정수값 : 나이) : 필드와 세터/ 게터
// - sleep (정수값: 시간)
// 인간의 특성을 상속 받아 직장인 만들기
//-worker(정수값 : 일하는 시간) : 필드와 세터/게터
// 인간의 특성을 상속 받아학생 만들기
// - 공부한다 (열심히/적당히/놀면서) : 필드와 세터/게터
public class PersonInheritance {
    public static void main(String[] args) {
     Worker worker = new Worker();
     worker.setWorker(4);
     worker.setAge(26);
     worker.setSleep(10);
     System.out.println("직장인이 " +worker.getAge() + "살 입니다");
     System.out.println("직장인이 " +worker.getWorker() + "시간 만큼 일합니다");
     System.out.println("직장인이 " +worker.getSleep() + "시간 만큼 잡니다");

     Study study = new Study();
     study.setStudy(1);
     study.setAge(26);
     study.setSleep(10);
     System.out.println("학생의 나이는 " + study.getAge() + "살 입니다");
     System.out.println("학생이 " + study.getStudy() + " 공부합니다");
     System.out.println("학생이 " + study.getSleep() + "시간 만큼 잡니다");


    }
}
