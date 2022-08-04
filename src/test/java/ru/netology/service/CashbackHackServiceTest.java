package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemain() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainAboveThousand() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1200);
        int expected = 800;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainEqualsThousand() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}