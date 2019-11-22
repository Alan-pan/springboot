package com.zgjy;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;

public class MyTomcatStart {
    public static void main(String[] args) throws ServletException {
        Tomcat tomcat=new Tomcat();
        tomcat.setPort(8888);
        tomcat.addWebapp("/","E://");
        try {
            tomcat.start();
            tomcat.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }
}
