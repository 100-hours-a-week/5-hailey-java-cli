package com.lotto;

public class LottoResult {
    int cnt = 0;

    public int checkResult(int[] numbers, int[] userArray) {
        for (int i = 0; i < numbers.length; i++) {
            for(int j=1; j<userArray.length; j++) {
                if(numbers[i] == userArray[j]) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public void resultView(int cnt) {
        if(cnt == 0 || cnt == 1) {
            System.out.println("아쉽게도 당첨되지 않았습니다.");
        } else if (cnt == 2) {
            System.out.println("축하드립니다. 6등입니다.");
        } else if (cnt == 3) {
            System.out.println("축하드립니다. 5등입니다.");
        } else if (cnt == 4) {
            System.out.println("축하드립니다. 4등입니다.");
        } else if (cnt == 5) {
            System.out.println("축하드립니다. 3등입니다.");
        } else if (cnt == 6) {
            System.out.println("축하드립니다. 2등입니다.");
        }
    }
}
