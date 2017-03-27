package me.wind.groove.infrastructure.jmx;

/**
 * Created by admin on 2017/3/27.
 */
public class Hello implements HelloMBean {

    @Override
    public void sayHello() {
        System.out.println("Hello JMX");
    }

    @Override
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }

}
