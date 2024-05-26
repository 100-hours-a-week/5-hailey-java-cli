package com.lotto;

import com.lotto.controller.GameController;
import com.lotto.number.LottoGenerator;
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

        LottoGenerator lottoGenerator = new LottoGenerator();
        Thread generator = new Thread(lottoGenerator);
        generator.start();



        View view = new View();
        GameController gameController = new GameController(view);
        gameController.startGame();


    }
}
