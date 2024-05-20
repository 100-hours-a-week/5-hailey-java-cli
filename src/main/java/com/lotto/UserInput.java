package com.lotto;

import java.util.Scanner;

public class UserInput {
    int[] userArray = new int[7];

    public int[] choose() {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < userArray.length; i++) {
            System.out.println(i + "번째 번호를 입력해주세요.");
            userArray[i] = sc.nextInt();
        }

        return userArray;
    }
}
