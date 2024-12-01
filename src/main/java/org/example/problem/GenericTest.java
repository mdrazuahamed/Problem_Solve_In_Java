package org.example.problem;

import org.example.GenericArray;
import org.example.GenericSingle;
import org.example.Student;

public class GenericTest {
    public static void main(String[] args) {
        GenericSingle<Student> genericSingle = new GenericSingle<>();
        Student student = new Student("Razu","01736132720");
        genericSingle.setObj(student);
        System.out.println(genericSingle.getObj().toString());


        GenericArray<Student> genericArray = new GenericArray<>();
        Student rahim = new Student("Rahim","01736132000");
        Student karim = new Student("karim","01736132111");
        genericArray.append(rahim);
        genericArray.print();
        genericArray.append(karim);
        genericArray.print();
    }
}
