package com.scz.gof.mediator;

public interface Mediator {

    void register(String dname, Department d);
    void command(String dname);

}
