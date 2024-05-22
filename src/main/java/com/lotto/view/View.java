package com.lotto.view;

import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);

    public void printMenu(int presentPoint) {
        System.out.println("====================================================================================================");
        System.out.println("1.로또 추첨 2.보너스 로또 추첨 3.로또 설명 4.나가기");
        System.out.println("현재 나의 포인트 : " + presentPoint);
        System.out.println("====================================================================================================");
    }

    public int getMenuChoice() {
        return sc.nextInt();
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printLottoExplanation() {
        System.out.println("1. 숫자는 기본적으로 6개를 선택하며, 1-45중 선택해주세요");
        System.out.println("2. 게임을 시작하고 모든 포인트가 소멸될때까지 로또번호는 동일합니다. 나가면 로또번호는 재생성됩니다.");
        System.out.println("   즉! 로또 당첨 결과를 보면서 추측이 가능하다는 점! ʕっ•ᴥ•ʔっ");
        System.out.println("3. 포인트를 모두 잃고 나면 로또 번호가 공개됩니다.");
        System.out.println("** 로또 추첨");
        System.out.println("1회당 10포인트 차감");
        System.out.println("** 보너스 로또 추첨");
        System.out.println("1회당 20포인트 차감");
        System.out.println("보너스 번호는 1-45 중 하나이며 별도의 번호로 취급합니다.");
        System.out.println("보너스 번호를 맞출시 100포인트 추가!");
    }
}
