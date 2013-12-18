package org.tw.spike.struts;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

    private String userName;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return new MessageStore(userName);
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
