package com.lotto.result;

import com.lotto.number.LottoGenerator;
import com.lotto.number.UserNumber;

public class ResultGenerator implements Runnable{

    private UserNumber userNumber;
    private LottoResult lottoResult;
    private static volatile boolean running = true;

    public ResultGenerator(UserNumber userNumber) {
        this.userNumber = userNumber;
        this.lottoResult = new LottoResult();
    }

    @Override
    public void run() {
        try {
            while (running) {
                Thread.sleep(61000);
                String[] lottoNumbers = LottoGenerator.getCurrentLottoNumbers();

                if (lottoNumbers != null && lottoNumbers.length == 6) {
                    for (String[] userArray : userNumber.getUsers()) {
                        int count = lottoResult.checkResult(lottoNumbers, userArray);
                        System.out.println(userArray[0] + "(" + userArray[1] + ")" + "님의 결과: " + count + "개 맞추셨습니다.");
                    }
                    userNumber.clearUsers(); //유저 기록 초기화
                }
            }


        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void stop() {
        running = false;
    }

}
