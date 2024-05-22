package com.lotto.number;

import java.util.Scanner;

public class UserNumber extends Number {
    Scanner sc = new Scanner(System.in);

    public int[] choose() {

        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + "번째 번호를 입력해주세요.");
            array[i] = sc.nextInt();
        }

        return array;
    }

    public int[] bonusChoose() {

        for (int i = 0; i < bonusArray.length-1; i++) {
            System.out.println((i+1) + "번째 번호를 입력해주세요.");
            bonusArray[i] = sc.nextInt();
        }

        System.out.println("보너스 번호를 입력해주세요.");
        bonusArray[6] = sc.nextInt();

        return bonusArray;
    }
}