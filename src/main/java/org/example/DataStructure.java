package org.example;

import java.time.Period;
import java.util.*;

public class DataStructure {
    public static void main(String[] args) {
        DataStructure dataStructure = new DataStructure();
        dataStructure.workWithMap();
    }

    public void workWithMap() {
        // key value pair both can be object
        // Each key can map to at most one value
        Map<Student,Integer> students = new HashMap<>();
        Student razu = new Student("Razu", "01762700100");
        students.put(razu,50);
        students.put(razu,60); // it replaces the first one
        students.put(new Student("Sazu","01753433622"),1000);
        System.out.println(students);
        System.out.println(students.get(razu));
        students.entrySet().forEach(x-> System.out.println(x));
    }
    public void workWithSet() {
        // Does not allow duplicate
        // Does not maintain order
        Set<Student> studentSet = new HashSet<>();
        // Set<Student> studentset = new TreeSet<>(); // maintain order
        Student student = new Student("Nime","01726400100");
        studentSet.add(new Student("Razu","01762700100"));
        studentSet.add(new Student("Razu","01762700100"));
        studentSet.add(student);
        studentSet.add(student);
        System.out.println(studentSet.size());
        studentSet.forEach(System.out::println);
        System.out.println(studentSet.remove(student));
        System.out.println(studentSet.remove(new Student("Razu","01762700100")));
        System.out.println("After Remove");
        studentSet.forEach(System.out::println);

    }

    public void workWithLinkedlist() {
        LinkedList<Student> students = new LinkedList<>();
        students.add(new Student("Razu", "01838021074"));
        students.add(new Student("Sazu", "01726598733"));
        ListIterator<Student> listIterator = students.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next().getName());
        }
        for (Student student : students) {
            System.out.println(student.getName());
        }
    }

    public void workWithQueue() {
        // First in first out
        Queue<Student> superMarket = new LinkedList<>();
        superMarket.add(new Student("razu","01762700100"));
        superMarket.add(new Student("sazu","01762700111"));
        superMarket.add(new Student("nazu","01762711100"));
        System.out.println(superMarket.peek()); // it didn't remove the item
        System.out.println(superMarket.size());
        Student pollStudent = superMarket.poll(); // it removes the student
        System.out.println(pollStudent);
        System.out.println(superMarket.size());


    }

    public void workWithStacks() {
        // Last in First out
        Stack<Integer> stack = new Stack<>();
        stack.push(500);
        stack.push(300);
        stack.push(400);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        Integer popValue = stack.pop();
        System.out.println(popValue);
        System.out.println(stack.size());

    }


    public void workWithlist() {
        //Allow Duplicates
        // Not fixed in size like arrays
        //fast for data retrivals
        // Various implementation - Arraylist, -Stack, -Vector, -others
        List colors = new ArrayList(); // Allow any data type
        colors.add("Blue");
        colors.add(1);
        colors.add(new Object());
        //colors.forEach(System.out::println);
        System.out.println(colors);


        List<String> colors2 = new ArrayList(); // data type fixed\
        colors2.add("Red");
        // colors2.add(3); //not allow
        colors2.add("Green");
        for(String color : colors2) {
            System.out.println(color);
        }
        for (int i=0; i<colors2.size();i++) {
            System.out.println(colors2.get(i));
        }

    }

    public void twoDimensionArray() {
        int[][] values= new int[2][3]; // [row][column]
        int setValue=0;
        for(int i=0; i<2;i++) {
            for(int j=0;j<3;j++) {
                values[i][j]=setValue;
                setValue++;
            }
        }
        System.out.println(Arrays.deepToString(values));

        int [][] values2 = new int[][] {
                {3,6,9},
                {8,5,2}};
        System.out.println(Arrays.deepToString(values2));
    }
    public void theArray(){
        // Size is fixed
        String[] colors = new String[5];
        colors[0] = "red";
        colors[1] = "blue";
        System.out.println(Arrays.toString(colors));

        int[] numbers = {100,2000};
        System.out.println(Arrays.toString(numbers));
        for (int i =0; i<colors.length;i++) {
            System.out.println(colors[i]);
        }
        // Enhance for loop
        for (int number :numbers) {
            System.out.println(number);
        }
        // use stream
        Arrays.stream(colors).forEach(System.out::println);


    }
}
