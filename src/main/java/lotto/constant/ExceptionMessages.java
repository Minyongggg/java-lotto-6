package lotto.constant;

import static lotto.constant.GameOptions.LOTTO_MAX_NUMBER;
import static lotto.constant.GameOptions.LOTTO_MIN_NUMBER;
import static lotto.constant.GameOptions.LOTTO_NUMBER_COUNT;
import static lotto.constant.GameOptions.LOTTO_PRICE;

public enum ExceptionMessages {
    PURCHASE_AMOUNT_FORMAT_EXCEPTION_MESSAGE("구입금액은 양의 정수여야 합니다."),
    WINNING_NUMBER_FORMAT_EXCEPTION_MESSAGE("당첨 번호는 ,로 구분된 양의 정수의 배열이어야 합니다."),
    BONUS_NUMBER_FORMAT_EXCEPTION_MESSAGE("보너스 번호는 양의 정수여야 합니다."),
    MIN_PURCHASE_AMOUNT_EXCEPTION_MESSAGE("로또 구입 금액은 " + LOTTO_PRICE + " 이상이어야 합니다."),
    PURCHASE_AMOUNT_DIVISIBILITY_EXCEPTION_MESSAGE("로또 구입 금액은 " + LOTTO_PRICE + "로 나누어 떨어져야 합니다."),
    WINNING_NUMBER_COUNT_EXCEPTION_MESSAGE("당첨 번호의 개수는 " + LOTTO_NUMBER_COUNT + "개여야 합니다."),
    WINNING_NUMBER_RANGE_EXCEPTION_MESSAGE("당첨 번호는 " + LOTTO_MIN_NUMBER + " ~ " + LOTTO_MAX_NUMBER + " 사이의 값이어야 합니다."),
    WINNING_NUMBER_DUPLICATION_EXCEPTION_MESSAGE("당첨 번호는 중복될 수 없습니다.");


    private String value;

    private ExceptionMessages(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
