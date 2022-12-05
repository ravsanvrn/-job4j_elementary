package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when43to98then707() {
        double expected = 7.07D;
        int x1 = 4;
        int y1 = 3;
        int x2 = 9;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when05to11then412() {
        double expected = 4.12D;
        int x1 = 0;
        int y1 = 5;
        int x2 = 1;
        int y2 = 1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when31to47then608() {
        double expected = 6.08D;
        int x1 = 3;
        int y1 = 1;
        int x2 = 4;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenXYToXYThenOUT() {
        double expected = 655.93D;
        int x1 = 74;
        int y1 = 95;
        int x2 = -14;
        int y2 = 745;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}