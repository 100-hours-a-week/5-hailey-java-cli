package com.lotto.number;

import java.util.ArrayList;
import java.util.Scanner;

public class UserNumber extends Number {
    Scanner sc = new Scanner(System.in);

    ArrayList<String[]> users = new ArrayList<>();

    public String[] choose() {
        String[] userArray = new String[8];

        System.out.println("이름을 입력해주세요.");
        userArray[0] = sc.nextLine();
        System.out.println("전화 번호 뒷자리를 입력해주세요");
        userArray[1] = sc.nextLine();

        //유저가 입력한 값 배열에 넣어주기
        for (int i = 2; i < userArray.length; i++) {
            System.out.println((i-1) + "번째 번호를 입력해주세요.");
            userArray[i] = String.valueOf(sc.nextInt());
            sc.nextLine(); // 남은 개행 문자 소비
        }

//        //유저가 입력한 값 출력
//        for (int i = 0; i < userArray.length; i++) {
//            System.out.print(userArray[i] + " ");
//        }

        // 배열을 복사하여 리스트에 추가
        users.add(userArray.clone());

//        // 리스트의 값 출력
//        for (String[] user : users) {
//            for (String s : user) {
//                System.out.print(s + " ");
//            }
//            System.out.println();
//        }

        return userArray;
    }

    public ArrayList<String[]> getUsers() {
        return users;
    }

    public void clearUsers() {
        users.clear();
    }
}