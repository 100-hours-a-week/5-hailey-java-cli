package com.lotto;

import com.lotto.controller.GameController;
import com.lotto.number.LottoGenerator;
import com.lotto.number.UserNumber;
import com.lotto.result.ResultGenerator;
import com.lotto.view.View;

public class Main {
    public static void main(String[] args) {
        System.out.println("====================================================================================================");
        System.out.println("====================================================================================================");
        System.out.println("=========================== ██ ====== ██████  ████████ ████████  ██████ ============================");
        System.out.println("=========================== ██ ===== ██ == ██ == ██ ===== ██ == ██ == ██ ===========================");
        System.out.println("=========================== ██ ===== ██ == ██ == ██ ===== ██ == ██ == ██ ===========================");
        System.out.println("=========================== ██ ===== ██ == ██ == ██ ===== ██ == ██ == ██ ===========================");
        System.out.println("=========================== ████████  ██████ === ██ ===== ██ === ██████ ============================");
        System.out.println("====================================================================================================");
        System.out.println("====================================================================================================");

        UserNumber userNumber = new UserNumber();
        LottoGenerator lottoGenerator = new LottoGenerator();
        ResultGenerator resultGenerator = new ResultGenerator(userNumber);

        Thread lottoThread = new Thread(lottoGenerator);
        Thread resultThread = new Thread(resultGenerator);

        lottoThread.start();
        resultThread.start();

        View view = new View();
        GameController gameController = new GameController(view, userNumber);
        gameController.startGame();


    }
}
