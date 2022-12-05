package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class MainTest {
    @Test
    public void whenActionThenResult() {
        int excepted = 1;
        int result = 1;
        assertThat(result).isEqualTo(excepted);
    }


    //1. Проверка целочисленных значений.
    @Test
    public void whenEquals() {
        int result = 1;
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    //2. Проверка чисел с плавающей точкой.
    @Test
    public void whenFloatPoint() {
        float result = 1.0000001F;
        float expected = 1F;
        assertThat(result).isCloseTo(expected, offset(0.01F));
    }

    //3. Равенство массивов.
    @Test
    public void whenArray() {
        int[] result = {1, 2, 3};
        int[] expected = {1, 2, 3};
        assertThat(result).containsExactly(expected);
    }

}
