package com.survivalcoding;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class WizardTest {

    @Test
    @DisplayName("마법사, 지팡이 생성 테스트")
    void testWizard() {
        Wand wand = new Wand("지팡이", 50);
        Wizard wizard = new Wizard(50, 50, "마법사", wand);
        assertEquals(50, wizard.getHp());
        assertEquals(50, wizard.getMp());
        assertEquals("마법사", wizard.getName());
        assertEquals(50, wizard.getWand().getPower());
        assertEquals("지팡이", wizard.getWand().getName());

        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName("펑");
        });

        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setName(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setWand(null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            wizard.setMp(-1);
        });

        wizard.setHp(-1);
        assertEquals(0, wizard.getHp());


    }


}