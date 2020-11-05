package com.innowise.darya.action;

import com.innowise.darya.service.BookService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloAction extends ActionSupport {

    @Autowired
    private BookService bookService;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }


}
