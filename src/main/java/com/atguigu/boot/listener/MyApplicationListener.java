package com.atguigu.boot.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author Mr.Chen
 * @version 1.0
 **/
public class MyApplicationListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println(" MyApplicationListener...onApplicationEvent...");

    }
}
