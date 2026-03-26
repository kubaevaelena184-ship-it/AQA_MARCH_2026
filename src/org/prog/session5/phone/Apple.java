package org.prog.session5.phone;

public class Apple implements IPhone{

    @Override
    public void call(){
        System.out.println("Apple is calling...");
    }
    @Override
    public void unlock(){
        System.out.println("Apple unlocks by faceID");
    }
}
