package com.company.lw02.customExceptions;

/**
 * Created with IntelliJ IDEA.
 * User: vova
 * Date: 4/3/14
 * Time: 12:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class ParamsException extends Exception {
    public ParamsException() {}

    public ParamsException(String message){
        super(message);
    }
}
