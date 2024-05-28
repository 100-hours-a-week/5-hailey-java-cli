package com.lotto.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoNumber extends Number {

    List<Integer> list = new ArrayList<>();
    Random random = new Random();

    public String[] createLottoNumber() {
        list.clear();

        while (list.size() < 6) {
            int number = random.nextInt(45) + 1;

            if (!list.contains(number)) {
                list.add(number);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            array[i] = String.valueOf(list.get(i));
        }

        return array;
    }

    public void getLottoNumber() {
        System.out.println("이번 로또 번호는 ~~~");
        for (int i=0; i<6; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public String[] getArray() {
        return array;
    }

}
