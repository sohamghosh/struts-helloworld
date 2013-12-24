package org.tw.spike.struts;

import com.opensymphony.xwork2.ActionSupport;

public class JsonAction extends ActionSupport {

    private String name;
    private String city;

    @Override
    public String execute() throws Exception {
        System.out.println("Name: " + name + ", City: " + city);
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
