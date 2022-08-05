package ru.netology.service;

import org.junit.Test;


import static org.junit.Assert.*;

public class CashbackHackServiceTest {

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



///API JUnit Jupiter

    @org.junit.jupiter.api.Test
    public void ngShouldRemain() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void ngShouldRemainAboveThousand() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1200);
        int expected = 800;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void ngShouldRemainEqualsThousand() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

}