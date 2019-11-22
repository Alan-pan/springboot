package com.zgjy;

import com.zgjy.handlestype.X;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.List;
import java.util.Set;

//@HandlesTypes({X.class})
//public class MyTomcatInit implements ServletContainerInitializer {
//    @Override
//    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
//        System.out.println("HandlesTypes---"+set.size());
//        System.out.println("SPI技术---ServletContainerInitializer---init");
//    }
//}


