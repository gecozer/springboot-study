package service.impl;

import service.IHello;

public class helloImpl implements IHello {
    public void sayHello(String name) {
        System.out.println(name+":hello");
    }

    public void sayGoodBye(String name) {
        System.out.println(name+":good bye");
    }
}
