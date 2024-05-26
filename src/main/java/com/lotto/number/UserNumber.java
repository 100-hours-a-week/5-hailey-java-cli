package com.lotto.number;

import java.util.Scanner;

public class UserNumber extends Number {
    Scanner sc = new Scanner(System.in);

    public String[] choose() {

        System.out.println("이름을 입력해주세요.");
        userArray[0] = sc.nextLine();
        System.out.println("전화 번호 뒷자리를 입력해주세요");
        userArray[1] = sc.nextLine();

        for (int i = 2; i < userArray.length; i++) {
            System.out.println((i-1) + "번째 번호를 입력해주세요.");
            userArray[i] = String.valueOf(sc.nextInt());
        }

        for (int i = 0; i < userArray.length; i++) {
            System.out.print(userArray[i] + " ");
        }

        return userArray;
    }

    public String[] bonusChoose() {

        for (int i = 0; i < bonusArray.length-1; i++) {
            System.out.println((i+1) + "번째 번호를 입력해주세요.");
            bonusArray[i] = String.valueOf(sc.nextInt());
        }

        System.out.println("보너스 번호를 입력해주세요.");
        bonusArray[6] = String.valueOf(sc.nextInt());

        return bonusArray;
    }
}