package com.example.javabasic.class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[][] students = {{"학생1", "15", "90"}, {"학생2", "16", "80"}};

        for (String[] student : students) {
            System.out.println("이름:" + student[0] + " 나이:" + student[1] + " 성적:" + student[2]);
        }
    }
}