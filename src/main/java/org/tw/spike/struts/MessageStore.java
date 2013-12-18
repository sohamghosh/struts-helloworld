package org.tw.spike.struts;

public class MessageStore {

    private String message;

    public MessageStore(String userName) {
        this.message = "Hello Struts user, " + userName;
    }

    public String getMessage() {
        return message;
    }
}
