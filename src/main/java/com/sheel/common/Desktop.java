package com.sheel.common;

public class Desktop implements Computer{
    @Override
    public void compile() {
        System.out.println("compiling desktop");
    }
    public String getString(){
        return "Desktop";
    }
}
