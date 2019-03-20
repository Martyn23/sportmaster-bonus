package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiseTest {
    @Test
            void calculateLowBonus() {
        BonusServise service = new BonusServise();
        int bonus = service.calculate(1_000, 4_000);
        assertEquals(50, bonus);

    }
    @Test
    void calculateMiddleBonus() {
        BonusServise service = new BonusServise();
        int bonus = service.calculate(1_000, 50_000);
        assertEquals(70, bonus);

    }
    @Test
    void calculateHighBonus() {
        BonusServise service = new BonusServise();
        int bonus = service.calculate(1_000, 250_000);
        assertEquals(100, bonus);
    }
}