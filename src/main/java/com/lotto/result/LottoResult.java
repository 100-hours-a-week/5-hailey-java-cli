package com.lotto.result;

public class LottoResult{

    public int checkResult(String[] numbers, String[] userArray) {
        if (numbers.length != 6) {
            throw new IllegalArgumentException("로또 번호 배열의 길이는 6이어야 합니다.");
        }

        if (userArray.length != 8) {
            throw new IllegalArgumentException("사용자 번호 배열의 길이는 8이어야 합니다.");
        }

        int cnt = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 2; j < userArray.length-1; j++) {
                if (numbers[i].equals(userArray[j])) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
