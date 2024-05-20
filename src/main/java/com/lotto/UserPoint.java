package com.lotto;

public class UserPoint {
    int point = 10;

    public int useLotto() {
        point -= 10;

        return point;
    }

    public int getPoint() {
        return point;
    }
}
