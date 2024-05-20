package com.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoNumber {
    int[] numbers = new int[6];
    List<Integer> list = new ArrayList<>(); // 중복을 방지하기 위해 리스트 사용
    Random random = new Random();

    public int[] createLottoNumber() {
        while (list.size() < 6) {
            int number = random.nextInt(45) + 1; // 1부터 45 사이의 랜덤 숫자 생성

            // 중복 검사
            if (!list.contains(number)) {
                list.add(number); // 중복이 아니면 리스트에 추가
            }
        }

        // 리스트를 배열로 변환
        for (int i = 0; i < list.size(); i++) {
            numbers[i] = list.get(i);
        }

        return numbers;
    }

    public void getLottoNumber() {
        for (int number : numbers) {
            System.out.print(number + " ");

        }
    }

}
