package com.tdd.chap02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordStrengthMeterTest {

    @Test
    void name() {

    }

    @Test
    void meetsAllCriteria_Then_Strong() {
        // 코드 작성해야함.
        PasswordStrengthMeter meter = new PasswordStrengthMeter();
        PasswordStrength result = meter.meter("ab12!@AB");
        assertEquals(PasswordStrength.STRONG, result);

        PasswordStrength result2 = meter.meter("abc1!Add");
        assertEquals(PasswordStrength.STRONG, result2);
    }

    @Test
    void meets

}
