package domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Status {

    WAITING("WAITING", "� ��������", false),

    IN_PROGRESS("IN_PROGRESS", "� ������", false),

    TESTING("TESTING", "������������", false),

    CLOSED("CLOSED", "�������", false);

    private final String code;

    private final String name;

    private final boolean finalStatus;
}
