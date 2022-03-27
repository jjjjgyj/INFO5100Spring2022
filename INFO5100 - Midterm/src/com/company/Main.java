package com.company;

public class Main {

    public static void main(String[] args) {
    // QUESTION 1 - Deep copy shallow copy
        Student shallowCopyStudent = new Student();
        Student deepCopyStudent = new Student(shallowCopyStudent);
        deepCopyStudent.setGpa(4.0);
        deepCopyStudent.setName("deepCopy");
        deepCopyStudent.setStudentID(19283346);
        System.out.println("Shallow Copy Student: " + shallowCopyStudent.name + " | " + shallowCopyStudent.studentID + " | " + shallowCopyStudent.gpa);
        System.out.println("Deep Copy Student: " + deepCopyStudent.name  + " | " + deepCopyStudent.studentID + " | "  + deepCopyStudent.gpa);

    // QUESTION 2 - Write difference between abstract class and interface.
        // 1. abstract class cannot have concrete codes in it, interface can.
        // 2. abstract class cannot be instantiated, a class that implements an interface can.
        // 3. a class can extend only one abstract class , but can implement multiple interfaces

    // QUESTION 3 - Write java program uses abstract classes and methods
        Psychiatrist p = new Psychiatrist();
        Sad sad = new Sad();
        Happy happy = new Happy();
        p.examine(sad);
        p.observe(sad);
        p.examine(happy);
        p.observe(happy);

    // QUESTION 4 - Write java program uses interface classes and methods
        Context contextAdd = new Context(new AddOperation());
        System.out.println(contextAdd.execute(5, 15)); // Expects 20
        Context contextSubtract = new Context(new SubtractOperation());
        System.out.println(contextSubtract.execute(50, 40)); // Expects 10
        Context contextMultiply = new Context(new MultiplyOperation());
        System.out.println(contextMultiply.execute(4, 25)); // Expects 100

    // QUESTION 5 - Singleton: Create a singleton class for Camera  there  would  be  just  one  instance  of  Camera

        Camera cam1 = Camera.getInstance();

        cam1.setCameraName("Camera 1");

        Camera cam2 = Camera.getInstance();
        System.out.println(cam1.getCameraName());
        System.out.println(cam2.getCameraName());

        cam2.setCameraName("Camera 2");
        System.out.println(cam1.getCameraName());
        System.out.println(cam2.getCameraName());

    // QUESTION 6 - Given a string s, find the length of the longest substring without repeating characters.
        String s = "abcabcbb";
        LongestSubstring ls = new LongestSubstring();
        System.out.println(ls.findLongestSubtring(s));

    }
}
