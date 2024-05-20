package com.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {

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

        UserPoint userPoint = new UserPoint();
        UserInput userInput = new UserInput();
        LottoNumber lottoNumber = new LottoNumber();
        LottoResult lottoResult = new LottoResult();

        while (true) {
            System.out.println("1.로또 추첨 시작 2.로또 설명 3.나가기");
            int presentPoint = userPoint.getPoint();
            System.out.println("현재 나의 포인트 : " + presentPoint);
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    if (userPoint.getPoint() < 10) {
                        System.out.println("포인트가 부족합니다. 게임을 종료합니다.");
//                        lottoNumber.getLottoNumber();
                        System.exit(0);
                    }

                    System.out.println("게임 시작");

                    int point = userPoint.useLotto();
                    System.out.println("남은 포인트: " + point);

                    int[] userArray = userInput.choose();
                    int[] numbers = lottoNumber.createLottoNumber();

//                    System.out.print("생성된 번호: ");
//                    for (int number : numbers) {
//                        System.out.print(number + " ");
//                    }
//                    System.out.println();

                    int cnt = lottoResult.checkResult(userArray, numbers);
                    lottoResult.resultView(cnt);
                    break;

                case 2:
                    System.out.println("게임 설명: 로또 번호를 선택하고 추첨하여 당첨 결과를 확인하세요.");
                    break;

                case 3:
                    System.out.println("See you again~~");
                    System.exit(0);

                default:
                    System.out.println("올바른 메뉴를 선택하세요.");
                    break;
            }
        }


    }

}

