package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int one = 1;
        int two = 2;
        int result = Max.max(one, two);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To2To6Then6() {
        int one = 4;
        int two = 2;
        int tree = 6;
        int result = Max.max(one, two, tree);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To5To2To2hen5() {
        int one = 5;
        int two = 5;
        int tree = 2;
        int four = 2;
        int result = Max.max(one, two, tree, four);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }
}
