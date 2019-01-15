package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class HelloWorld  implements ApplicationContextAware, BeanNameAware, BeanFactoryAware {
    private Quote quote;
    private ApplicationContext applicationContext;
    private String msg = "helloworld";
    public HelloWorld(){

    }

    HelloWorld(Quote quote) {
        this.quote = quote;
    }

    public String getMessage() {
        return msg;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Quote quote= (Quote) applicationContext.getBean("quoteB");

        System.out.println("from application context aware "+quote.getQuotation());

    }

    public void setBeanName(String s) {
        System.out.println("Bean name is "+s);

    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        Quote quote= (Quote) beanFactory.getBean("quoteB");
        System.out.println("FRom Bean FActory"+quote.getQuotation());

    }
}
