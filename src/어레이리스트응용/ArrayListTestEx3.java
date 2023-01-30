package 어레이리스트응용;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTestEx3 {
    public static void main(String[] args) {
        List<MemberInfo> memList = new ArrayList<>();
        memList.add(new MemberInfo("정우진", "sun65568","as7300","wjddnwls6556@naver.com","010-7560-6556",26));
        memList.add(new MemberInfo("장원영","jwy","jwy1234","jwy1234@naver.com","010-1243-2345", 20));
        memList.add(new MemberInfo("안유진","ayj", "ayj1234","ayj@naver.com","010-4456-7657",21));


        for(MemberInfo info : memList) {
            info.viewInfo();
        }
    }
}
