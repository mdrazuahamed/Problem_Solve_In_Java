package org.example.genericExample;

public class genericMethodExample {
    static <E> void show(E[] list) {
        for (E x:list) {
            System.out.println(x);
        }
    }
    static <E> void showVariableArgument(E... list) {
        for (E x:list) {
            System.out.println(x);
        }
    }

    static <E extends Number> void showExtend(E[] list) {
        for (E x:list) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        show(new String[]{"Hi","Bye","Go"});
        show(new Integer[]{10,20,40,50});
        // showExtend(new String[]{"Hi"}); //not possible because String didn't extend number
        showExtend(new Integer[]{50,30,20});
        showVariableArgument(100,200,300);
    }
}
