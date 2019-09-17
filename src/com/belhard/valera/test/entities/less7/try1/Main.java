package com.belhard.valera.test.entities.less7.try1;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {


        Optional<String> opt = getStr();

//        System.out.println(opt);
        System.out.println(opt.orElse("b"));

    }

    public static Optional<String> getStr() {

        return Optional.ofNullable(null);
    }
}