package com.lotto.result;

public class LottoResult{

    public int checkResult(int[] numbers, int[] userArray) {
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
        if (numbers[6] == userArray[6]) {
            System.out.println("보너스 번호를 맞추셨습니다!!!!!!");
            return true;
        } else {
            return false;
        }
    }
}