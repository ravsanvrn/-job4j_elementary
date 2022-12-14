package ru.job4j.condition;

public class Max {

    public static int max(int one, int two) {
        return one > two ? one : two;
    }

    public static int max(int one, int two, int three) {
        int temp = max(one, two);
        return temp > three ? temp : three;
    }

    public static int max(int one, int two, int three, int four) {
        int temp = max(one, two, three);
        return temp > four ? temp : four;
    }
}
