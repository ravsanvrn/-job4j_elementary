package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFrom4To65Then1054() {
        int start = 4;
        int finish = 65;
        int result = Counter.sumByEven(start, finish);
        int expected = 1054;
        assertThat(result).isEqualTo(expected);
    }
}