package com.innowise.darya.action;

import com.innowise.darya.service.BookService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

//@Namespace("/bookshop")
//@Action(value = "hello", //
//        results = { //
//                @Result(name = "success", location = "/pages/hello.jsp")
//        } //
//)
//@Action(value="hello")
//@Result(name = "success", location = "/WEB-INF/pages/hello.jsp")
public class HelloAction extends ActionSupport {

    @Autowired
    private BookService bookService;

@Override
    public String execute() throws Exception {
        return SUCCESS;
    }


}
