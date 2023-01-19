package 자동차만들기;

public abstract class Car {
    int speed;
    int fuelval; //연비
    int fueltank; //연료탱크
    int seat;
    String name;

    abstract void setMode(boolean isMode);

    //이동횟수 구하기 : 입력값으로 승객의 수가 필요
    int getMovingCnt(int passCnt){
        if(passCnt % seat != 0) return(passCnt / seat) +1 ;
        return passCnt / seat;
    }
    // 총 이동 비용
    int getTotalCost(int dist, int moveCnt ){
        return(dist / fuelval * 2000) * moveCnt;
    }
    // 총 주유 횟수
    int getRefuelCnt(int dist, int moveCnt) {
        if (((dist * moveCnt) / fuelval) % fueltank != 0)
            return (((dist * moveCnt)/ fuelval) /fueltank)+1;
        else return (((dist * moveCnt)/ fuelval) /fueltank);
    }
    // 총 소요 시간
    double getMovingTime(int dist, int moveCnt) {
        return(double) dist * moveCnt / speed;
    }

}
