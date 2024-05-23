package com.lotto.controller;

import com.lotto.result.LottoResult;
import com.lotto.result.UserPoint;
import com.lotto.number.BonusLottoNumber;
import com.lotto.number.LottoNumber;
import com.lotto.number.UserNumber;
import com.lotto.view.View;

public class GameController {

    private static final int LOTTO_NECESSARY_POINT = 10;
    private static final int BONUS_NECESSARY_POINT = 20;
    private boolean running = true;

    private View view;
    private UserNumber userNumber;
    private LottoNumber lottoNumber;
    private BonusLottoNumber bonusLottoNumber;
    private UserPoint userPoint;
    private LottoResult lottoResult;

    public GameController(View view) {
        this.view = view;
        this.userNumber = new UserNumber();
        this.lottoNumber = new LottoNumber();
        this.bonusLottoNumber = new BonusLottoNumber();
        this.userPoint = new UserPoint();
        this.lottoResult = new LottoResult();
    }

    public void startGame() {
        while (running) {
            view.printMenu(userPoint.getPoint());
            int menu = view.getMenuChoice();
            try {
                switch (menu) {
                    case 1:
                        playLottoGame();
                        break;
                    case 2:
                        playBonusLottoGame();
                        break;
                    case 3:
                        view.printLottoExplanation();
                        break;
                    case 4:
                        view.printMessage("See you again~~");
                        running = false;
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
        if (userPoint.getPoint() < LOTTO_NECESSARY_POINT) {
            view.printMessage("포인트가 부족합니다. 게임을 종료합니다.");
            lottoNumber.getLottoNumber();
            running = false;
            return;
        }

        view.printMessage("*** 1부터 45 중에 선택해주세요. (중복x) ***");

        int point = userPoint.usePoint();
        view.printMessage("남은 포인트: " + point);

        int[] numbers = lottoNumber.createLottoNumber();
        int[] userArray = userNumber.choose();

        int cnt = lottoResult.checkResult(numbers, userArray);
        userPoint.winningResult(cnt); // 포인트 업데이트
    }

    private void playBonusLottoGame() {
        if (userPoint.getPoint() < BONUS_NECESSARY_POINT) {
            view.printMessage("포인트가 부족합니다. 게임을 종료합니다.");
            bonusLottoNumber.getLottoNumber();
            running = false;
            return;
        }

        view.printMessage("*** 1부터 45 중에 선택해주세요. (중복x, 보너스 번호는 중복될 수 있습니다.) ***");

        int doublePoint = userPoint.useDoublePoint();
        view.printMessage("현재 남은 포인트: " + doublePoint);

        int[] bonusNumbers = bonusLottoNumber.createLottoNumber();
        int[] userBonusArray = userNumber.bonusChoose();

        int bonusCnt = lottoResult.checkResult(bonusNumbers, userBonusArray);
        boolean bonusCheck = lottoResult.bonusCheckResult(bonusNumbers, userBonusArray);

        userPoint.winningResult(bonusCnt); // 포인트 업데이트
        userPoint.bonusPoint(bonusCheck);
    }
}

