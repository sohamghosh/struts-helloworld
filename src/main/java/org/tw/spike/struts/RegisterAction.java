package org.tw.spike.struts;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

    private Person personBean;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public Person getPersonBean() {
        return personBean;
    }

    public void setPersonBean(Person personBean) {
        this.personBean = personBean;
    }
}
