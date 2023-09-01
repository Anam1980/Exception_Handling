package org.example;

import jdk.jshell.spi.ExecutionControl;

public class UnderAgeException extends Exception{

    UnderAgeException(){
        super();
    }
    UnderAgeException(String msg){
        super(msg);
    }
}
