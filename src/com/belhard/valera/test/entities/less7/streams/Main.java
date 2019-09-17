package com.belhard.valera.test.entities.less7.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>() {{
            add("aaahh");
            add("aaa");
            add("bbb");
            add("abcdef");
            add("");
            add("a");
            add("aaahhw35");
        }};

        String result = list.stream().filter(s -> s.length() < 5).collect(Collectors.joining(" "));

        System.out.println(result);
    }
}