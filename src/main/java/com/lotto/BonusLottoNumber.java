package com.lotto;

public class BonusLottoNumber extends LottoNumber{

    private int bonusNumber;
    private boolean isBonusGenerated = false;

    @Override
    public int[] createLottoNumber() {
        super.createLottoNumber(); // 부모 클래스의 메서드 호출

        // 보너스 번호 생성
        if (!isBonusGenerated) { // 보너스 번호가 생성되지 않은 경우에만 생성
            bonusNumber = random.nextInt(45) + 1;
            isBonusGenerated = true;
        }

        // 기존 배열에 보너스 번호를 추가하기 위해 새로운 배열 생성
        System.arraycopy(array, 0, bonusArray, 0, array.length); // 기존 배열 복사
        bonusArray[6] = bonusNumber; // 마지막에 보너스 번호 추가

        return bonusArray;
    }

    @Override
    public void getLottoNumber() {
        super.getLottoNumber();
        System.out.println("보너스 번호: " + bonusNumber);

    }
}
