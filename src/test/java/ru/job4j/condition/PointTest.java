package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when43to98then7dot07() {
        double expected = 7.07D;
        Point a = new Point(4, 3);
        Point b = new Point(9, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when05to11then4dot12() {
        double expected = 4.12D;
        Point a = new Point(0, 5);
        Point b = new Point(1, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when31to47then6dot08() {
        double expected = 6.08D;
        Point a = new Point(3, 1);
        Point b = new Point(4, 7);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenYToXYThenOUT() {
        double expected = 655.93D;
        Point a = new Point(74, 95);
        Point b = new Point(-14, 745);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenYToYToZThenOUT() {
        double expected = 660.20D;
        Point a = new Point(74, 95, 85);
        Point b = new Point(-14, 745, 10);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}