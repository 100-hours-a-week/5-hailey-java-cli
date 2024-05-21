package com.lotto;

import java.util.Scanner;

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

        Scanner sc = new Scanner(System.in);

        UserNumber userNumber = new UserNumber();
        LottoNumber lottoNumber = new LottoNumber();
        BonusLottoNumber bonusLottoNumber = new BonusLottoNumber();
        UserPoint userPoint = new UserPoint();
        LottoResult lottoResult = new LottoResult();

        while (true) {

            System.out.println("1.로또 추첨 2.두배 이벤트 로또 추첨 3.로또 설명 4.나가기");

            int presentPoint = userPoint.getPoint();
            System.out.println("현재 나의 포인트 : " + presentPoint);

            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    if (userPoint.getPoint() < 10) {
                        System.out.println("포인트가 부족합니다. 게임을 종료합니다.");
                        lottoNumber.getLottoNumber();
                        System.exit(0);
                    }

                    System.out.println("게임 시작");

                    int point = userPoint.usePoint();
                    System.out.println("남은 포인트: " + point);

                    int[] numbers = lottoNumber.createLottoNumber();
                    lottoNumber.getLottoNumber();
                    int[] userArray = userNumber.choose();

                    int cnt = lottoResult.checkResult(numbers, userArray);
                    userPoint.winningResult(cnt); // 포인트 업데이트

                    lottoNumber.getLottoNumber();
                    break;

                case 2:
                    if (userPoint.getPoint() < 20) {
                        System.out.println("포인트가 부족합니다. 게임을 종료합니다.");
                        bonusLottoNumber.getLottoNumber();
                        System.exit(0);
                    }

                    System.out.println("게임 시작");

                    int doublePoint = userPoint.useDoublePoint();
                    System.out.println("남은 포인트: " + doublePoint);

                    int[] bonusNumbers = bonusLottoNumber.createLottoNumber();
                    int[] userBonusArray = userNumber.bonusChoose();

                    int bonusCnt = lottoResult.checkResult(bonusNumbers, userBonusArray);
                    boolean bonusCheck = lottoResult.bonusCheckResult(bonusNumbers, userBonusArray);

                    userPoint.winningResult(bonusCnt); // 포인트 업데이트
                    userPoint.bonusPoint(bonusCheck);

                    bonusLottoNumber.getLottoNumber();

                    break;

                case 3:
                    System.out.println("게임 설명: 로또 번호를 선택하고 추첨하여 당첨 결과를 확인하세요.");
                    break;

                case 4:
                    System.out.println("See you again~~");
                    System.exit(0);

                default:
                    System.out.println("올바른 메뉴를 선택하세요.");
                    break;
            }
        }
    }
}
