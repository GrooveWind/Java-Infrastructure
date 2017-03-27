package me.wind.groove.infrastructure.jmx;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * Created by admin on 2017/3/27.
 */
public class App {

    private static final String domain = "me.wind.groove.infrastructure.jmx";

    public static void main(String[] args) throws Exception {
        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName = new ObjectName(domain + ":type=Hello");
        Hello hello = new Hello();
        mbs.registerMBean(hello, objectName);

        System.out.println("Waiting forever...");

        /** 把线程停在这里，通过JConsle可以查看MBean相关状态，也可以直接对方法进行调用 */
        Thread.sleep(Integer.MAX_VALUE);

    }

}
