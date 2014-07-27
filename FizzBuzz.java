package com.tw.twu.exercize;

public class FizzBuzz {
    public void FizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.FizzBuzz();
    }
}
