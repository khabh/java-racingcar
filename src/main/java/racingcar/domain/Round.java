package racingcar.domain;

import static racingcar.constant.ExceptionMessage.INVALID_ROUND_FORMAT;
import static racingcar.constant.ExceptionMessage.INVALID_ROUND_RANGE;

public class Round {

    private static final int MIN_ROUND_COUNT = 1;

    private int count;

    public Round(String count) {
        this.count = tryConvertRoundCount(count);
        validateCountRange();
    }

    private void validateCountRange() {
        if (count < MIN_ROUND_COUNT) {
            throw INVALID_ROUND_RANGE.getException();
        }
    }

    private int tryConvertRoundCount(String count) {
        try {
            return Integer.parseInt(count);
        } catch(NumberFormatException e) {
            throw INVALID_ROUND_FORMAT.getException();
        }
    }

    public boolean isRemain() {
        return count > 0;
    }

    public void decreaseCount() {
        count--;
    }
}
