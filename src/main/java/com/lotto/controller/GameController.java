package com.lotto.controller;

import com.lotto.result.LottoResult;
import com.lotto.result.UserPoint;
import com.lotto.number.BonusLottoNumber;
import com.lotto.number.LottoNumber;
import com.lotto.number.UserNumber;
import com.lotto.view.View;

public class GameController {
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
        while (true) {
            view.printMenu(userPoint.getPoint());
            int menu = view.getMenuChoice();
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
                    System.exit(0);
                    break;
                default:
                    view.printMessage("올바른 메뉴를 선택하세요.");
                    break;
            }
        }
    }

    private void playLottoGame() {
        if (userPoint.getPoint() < 10) {
            view.printMessage("포인트가 부족합니다. 게임을 종료합니다.");
            lottoNumber.getLottoNumber();
            System.exit(0);
        }

        view.printMessage("게임 시작");

        int point = userPoint.usePoint();
        view.printMessage("남은 포인트: " + point);

        int[] numbers = lottoNumber.createLottoNumber();
        int[] userArray = userNumber.choose();

        int cnt = lottoResult.checkResult(numbers, userArray);
        userPoint.winningResult(cnt); // 포인트 업데이트
    }

    private void playBonusLottoGame() {
        if (userPoint.getPoint() < 20) {
            view.printMessage("포인트가 부족합니다. 게임을 종료합니다.");
            bonusLottoNumber.getLottoNumber();
            System.exit(0);
        }

        view.printMessage("게임 시작");

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

