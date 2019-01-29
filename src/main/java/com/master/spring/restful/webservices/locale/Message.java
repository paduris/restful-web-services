package com.master.spring.restful.webservices.locale;

/**
 * Created by paduris on 12/16/18.
 */
public class Message {

    private String message;

    public Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }
}
