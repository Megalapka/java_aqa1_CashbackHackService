package ru.netology.service;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class JupiterCashbackHackServiceTest {
    @Test
    public void shouldRemain() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainAboveThousand() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1200);
        int expected = 800;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemainEqualsThousand() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

}