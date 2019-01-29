package com.master.spring.restful.webservices.locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by paduris on 12/16/18.
 */

@RestController
public class LocaleTestController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello,World test";
    }


    @GetMapping(path = "/hello-world-bean")
    public Message helloWorldBean() {
        Message bean = new Message("Hello Suresh");
        return bean;
    }

    @GetMapping(path = "/hello-world/{name}")
    public Message helloWorldPathVariable(@PathVariable String name) {
        Message bean = new Message("Hello " + name);
        return bean;
    }


    /**
     * Locale Example for reference
     *
     * @param name
     * @param
     * @return
     */
    @GetMapping(path = "/hello-world/locale/{name}")
    public String helloWorldLocale(@PathVariable String name) {
        return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());

    }

}
