package com.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoNumber extends Number{

    List<Integer> list = new ArrayList<>();
    Random random = new Random();

    public int[] createLottoNumber() {
        while (list.size() < 6) {
            int number = random.nextInt(45) + 1;

            if (!list.contains(number)) {
                list.add(number);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }

        return array;
    }

    public void getLottoNumber() {
        System.out.println("이번 로또 번호는 ~~~");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


}
