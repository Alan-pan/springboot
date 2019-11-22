package com.zgjy.handlestype;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

@HandlesTypes({X.class})
public class TestHandlesTypes implements ServletContainerInitializer {

    public void onStartup(Set<Class<?>> webAppInitializerClasses, ServletContext servletContext) throws ServletException {
        System.out.println("HandlesTypes---"+webAppInitializerClasses.size());
    }
}