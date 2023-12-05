package com.example.javabasic.pack;

import com.example.javabasic.pack.a.User;

public class PackageMain2 {
    public static void main(String[] args) {
        User userA = new User();
        com.example.javabasic.pack.b.User userB = new com.example.javabasic.pack.b.User();
    }
}
