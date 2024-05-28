package com.lotto.view;

import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);

    public void printMenu() {
        System.out.println("====================================================================================================");
        System.out.println("1.로또 추첨 2.로또 설명 3.나가기");
        System.out.println("====================================================================================================");
    }

    public int getMenuChoice() {
        return sc.nextInt();
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printLottoExplanation() {
        System.out.println("1. 본인의 이름과 전화번호 뒷자리를 입력해주세요.");
        System.out.println("2. 1-45중 숫자를 6개를 선택해주세요.");
        System.out.println("3. 로또 번호는 3분 마다 갱신됩니다.");
        System.out.println("4. 3분 후 결과가 발표됩니다.");
        System.out.println("GOOD LUCK! ʕっ•ᴥ•ʔっ");
    }
}
