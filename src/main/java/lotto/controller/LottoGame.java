package lotto.controller;

import static lotto.constant.GameOptions.MAX_NUMBER;
import static lotto.constant.GameOptions.MIN_NUMBER;
import static lotto.constant.GameOptions.NUMBER_COUNT;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class LottoGame {
    
    private List<Integer> pickLottoNumbers() {
        return Randoms.pickUniqueNumbersInRange(MIN_NUMBER.getValue(), MAX_NUMBER.getValue(),
                        NUMBER_COUNT.getValue()).stream()
                .sorted()
                .toList();
    }
}
