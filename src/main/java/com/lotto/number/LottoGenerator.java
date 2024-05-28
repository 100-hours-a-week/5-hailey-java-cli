package com.lotto.number;

public class LottoGenerator implements Runnable {

    private LottoNumber lottoNumber;
    private static volatile String[] currentLottoNumbers;
    private static volatile boolean running = true;

    public LottoGenerator() {
        this.lottoNumber = new LottoNumber();
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(60000); // 1분 대기
                lottoNumber.createLottoNumber();
                lottoNumber.getLottoNumber();
                currentLottoNumbers = lottoNumber.getArray().clone();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static String[] getCurrentLottoNumbers() {
        return currentLottoNumbers;
    }

    public static void stop() {
        running = false;
    }

}
