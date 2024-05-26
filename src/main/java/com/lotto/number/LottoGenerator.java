package com.lotto.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoGenerator implements Runnable {

    private LottoNumber lottoNumber;

    public LottoGenerator() {
        this.lottoNumber = new LottoNumber();
    }

    @Override
    public void run() {

        while(true) {
            try {
                Thread.sleep(60000);
                lottoNumber.createLottoNumber();
                lottoNumber.getLottoNumber();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
