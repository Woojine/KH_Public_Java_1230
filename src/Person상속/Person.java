package Person상속;



public class Person {
    int age;
    int sleep;
    void setAge(int age){
        this.age = age;
    }
    int getAge(){
        return age;
    }
    void setSleep(int sleep){
        this.sleep = sleep;
    }
    int getSleep(){
        return sleep;
    }
}
class Worker extends Person{
    int work;
    void setWorker(int work){
        this.work = work;
    }
    int getWorker(){
        return work;
    }
}
class Study extends Person {
    int study ;

    void setStudy(int study) {
       this.study =study;
    }

    String getStudy() {
        String[] studyStr = {"", "\"열심히\"", "\"적당히\"", "\"놀면서\""};
        return studyStr[study];
    }
}
