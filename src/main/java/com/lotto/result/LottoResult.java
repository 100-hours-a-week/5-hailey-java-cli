package com.lotto.result;

public class LottoResult{

    public int checkResult(int[] numbers, int[] userArray) {
        if (numbers.length != 6 && numbers.length != 7) {
            throw new IllegalArgumentException("로또 번호 배열의 길이는 6이어야 합니다.");
        }

        if (userArray.length != 6 && userArray.length != 7) {
            throw new IllegalArgumentException("사용자 번호 배열의 길이는 6이어야 합니다.");
        }

        int cnt = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = 0; j < userArray.length-1; j++) {
                if (numbers[i] == userArray[j]) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public boolean bonusCheckResult(int[] numbers, int[] userArray) {
        if (numbers.length != 7) {
            throw new IllegalArgumentException("로또 번호 배열의 길이는 7이어야 합니다. (보너스 번호 포함)");
        }
        if (userArray.length != 7) {
            throw new IllegalArgumentException("사용자 번호 배열의 길이는 7이어야 합니다. (보너스 번호 포함)");
        }

        if (numbers[6] == userArray[6]) {
            System.out.println("보너스 번호를 맞추셨습니다!!!!!!");
            return true;
        } else {
            return false;
        }
    }
}
