package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K212Square3dot48() {
        double expected = 3.48D;
        int p = 8;
        double k = 2.12D;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP21K3dot21Square6dot52() {
        double expected = 6.52D;
        int p = 12;
        double k = 3.21D;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}