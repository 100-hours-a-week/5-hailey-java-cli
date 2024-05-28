package com.lotto.controller;

import com.lotto.number.LottoGenerator;
import com.lotto.number.UserNumber;
import com.lotto.result.ResultGenerator;
import com.lotto.view.View;

public class GameController {
    private boolean running = true;

    private View view;
    private UserNumber userNumber;

    public GameController(View view, UserNumber userNumber) {
        this.view = view;
        this.userNumber = userNumber;
    }

    public void startGame() {
        while (running) {
            view.printMenu();
            int menu = view.getMenuChoice();
            try {
                switch (menu) {
                    case 1:
                        playLottoGame();
                        break;
                    case 2:
                        view.printLottoExplanation();
                        break;
                    case 3:
                        view.printMessage("See you again~~");
                        running = false;
                        stopAllThreads();
                        break;
                    default:
                        view.printMessage("올바른 메뉴를 선택하세요.");
                        break;
                }
            } catch (IllegalArgumentException e) {
                view.printMessage("에러: " + e.getMessage());
            }
        }
        view.printMessage("게임이 종료되었습니다.");
    }

    private void playLottoGame() {

        view.printMessage("*** 1부터 45 중에 선택해주세요. (중복x) ***");

        userNumber.choose();

    }

    private void stopAllThreads() {
        LottoGenerator.stop();
        ResultGenerator.stop();
    }
}
