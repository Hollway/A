package com.belhard.valera.test.entities.less7.functional;

public class Main {

    public static void main(String[] args) {

        /*int a = 15, b = 3;
        doOperation(new PlusOperation(), a, b);
        doOperation(new MinusOperation(), a, b);
        doOperation(new MultiOperation(), a, b);
        doOperation(new DivideOperation(), a, b);
        doOperation((x, y) -> (int)Math.pow(x, y)
                , a, b);*/

        IntOperation op = (x, y) -> (int) Math.pow(x, y);
        System.out.println(op.exec(10, 3));


//        doOperation((x, y) -> x + y, a, b);
    }

    private static void doOperation(IntOperation operation, int a, int b) {

        System.out.println(operation.exec(a, b));
    }

}