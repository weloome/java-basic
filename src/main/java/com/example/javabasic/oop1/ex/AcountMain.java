package com.example.javabasic.oop1.ex;

public class AcountMain {
    public static void main(String[] args) {
        Acount acount = new Acount();
        acount.balance = 10000;
        acount.withdraw(9000);
        acount.withdraw(2000);
        System.out.println("잔고: " + acount.balance);
    }
}
