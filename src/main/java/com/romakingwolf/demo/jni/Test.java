package com.romakingwolf.demo.jni;

/**
 * Created by shilei on 17/9/15.
 */
public class Test {

    private String message = "Hello World!";

    public String getMessage() {
        System.out.println(message);
        return message;
    }

    public String getMessage(String prefix) {
        System.out.println(prefix + message);
        return prefix + message;
    }

}
