package Map기본;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap : 키와 값의 쌍(pair)로 구성되어 있음, 키는 중복 될 수 없고 값은 중복 가능
// 키의 중복 여부 확인은 HashCode를 이용해서 확인
// hash 알고리즘의 특징으 키 값을 해시함수의 입력으로 전달하여 정수값의 결과를 반환함
public class MapTestEx1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        // 객체 저장
        map.put("우영우", 99);
        map.put("동그라미", 55);
        map.put("최수연", 95);
        map.put("이준호", 80);
        map.put("동그라미", 99); // 키값이 같기 때문에 나중에 들어온 값으로 대체
        System.out.println("총 Entry 수 : " +map.size()); // 맵의 객체수 확인
        // 객체 찾기
        System.out.println(map.get("동그라미"));
        // map 순회 방법(반복자 : iterator 사용)
//        Set<String> keyset = map.keySet();
//        Iterator<String> iterator = keyset.iterator();
//        while(iterator.hasNext()) {
//            String key = iterator.next();
//            Integer value = map.get(key);
//            System.out.println(key + " : " + value);
//        } `
        map.remove("최수연"); // 키로 Map.entry 제거
        System.out.println("총 Entry 수 : " +map.size());
        // replace() 메소드를 이용해 값 수정
        map.replace("이준호", 91);
        for(String key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
        map.clear(); //객체 전체 삭제
        System.out.println("총 Entry 수 : " +map.size());
    }
}
