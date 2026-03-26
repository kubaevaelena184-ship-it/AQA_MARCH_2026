package org.prog.session5.phone;

public class Android implements IPhone{

    @Override
    public void call(){
        System.out.println("Android is calling...");
    }
    @Override
    public void unlock(){
        System.out.println("Android unlocks by fingerprint");
    }
}
