//package com.lotto.result;
//
//public class UserPoint {
//    int point = 40;
//
//    public int usePoint() {
//        point -= 10;
//        return point;
//    }
//
//    public int useDoublePoint() {
//        point -= 20;
//        return point;
//    }
//
//    public int getPoint() {
//        return point;
//    }
//
//    public void bonusPoint(boolean bonusCnt) {
//        if(bonusCnt) {
//            point += 100;
//        }
//    }
//
//
//    public void winningResult(int cnt) {
//        switch (cnt) {
//            case 0:
//            case 1:
//                System.out.println("아쉽게도 당첨되지 않았습니다.");
//                break;
//            case 2:
//                System.out.println("축하드립니다. 5등입니다.");
//                point += 20;
//                break;
//            case 3:
//                System.out.println("축하드립니다. 4등입니다.");
//                point += 30;
//                break;
//            case 4:
//                System.out.println("축하드립니다. 3등입니다.");
//                point += 40;
//                break;
//            case 5:
//                System.out.println("축하드립니다. 2등입니다.");
//                point += 50;
//                break;
//            case 6:
//                System.out.println("축하드립니다. 1등입니다. 얏호 ~ ");
//                point += 60;
//                break;
//        }
//    }
//}
