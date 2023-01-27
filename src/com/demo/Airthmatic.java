package com.demo;

public class Airthmatic {
    public int add(int a , int b){
        return a+b;

    }
    public int sub(int a , int b){
        return a-b;

    }
    public int mul(int a , int b){
        return a*b;
    }

    public int div(int a , int b){
        return a/b;
    }
    public int rem(int a , int b){
        return a%b;
    }

    public static void main(String[] args){
        Airthmatic airobj = new Airthmatic();
        System.out.println("Adding two number "+airobj.add(5,3));
        System.out.println("substraction two number "+airobj.sub(5,3));
        System.out.println("multiple two number "+airobj.mul(5,3));
        System.out.println("division two number "+airobj.div(5,3));
        System.out.println("remender two number "+airobj.rem(5,3));
    }
}




