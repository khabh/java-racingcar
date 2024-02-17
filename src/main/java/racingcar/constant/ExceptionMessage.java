package racingcar.constant;

public enum ExceptionMessage {

    INVALID_CAR_NAME_LENGTH("이름은 1자 이상 5자 이내로 입력해 주세요."),
    DUPLICATED_CAR_NAME("중복된 자동차 이름이 존재합니다."),
    INVALID_ROUND_RANGE("시도 횟수는 1 이상 입력해 주세요."),
    INVALID_ROUND_FORMAT("시도 횟수는 숫자만 입력해 주세요.");

    private final String message;

    ExceptionMessage(String message) {
        this.message = message;
    }

    public IllegalArgumentException getException() {
        return new IllegalArgumentException(message);
    }
}
