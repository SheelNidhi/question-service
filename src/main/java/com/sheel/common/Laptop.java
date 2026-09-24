package com.sheel.common;

public class Laptop implements  Computer
{
    @Override
    public void compile() {
        System.out.println("Laptop compiling ");
    }
    public String getString(){
        return "laptop";
    }
}
