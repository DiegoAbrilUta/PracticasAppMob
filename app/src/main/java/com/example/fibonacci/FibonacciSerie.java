package com.example.fibonacci;

public class FibonacciSerie {
    public String Fibonacci(int rng){
        String textFb = "";
        int a=0;
        int b=1;
        int c=0;
        for( int x=0;x<rng;x++){
            textFb=textFb+c+"\n";
            a=b;
            b=c;
            c=a+b;
        }
        return textFb;
    }
}

