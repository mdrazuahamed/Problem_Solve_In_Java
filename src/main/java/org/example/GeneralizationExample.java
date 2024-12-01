package org.example;
public class GeneralizationExample {
    public static void main(String[] args) {
        Object obj[] = new Object[3];
        obj[0] = "hi";
        obj[1] = "Bye";
        obj[2] = 10;
        String str;
        for (int i=0;i<3;i++) {
            str = (String)obj[i];
            System.out.println(str);
        }
    }
}
