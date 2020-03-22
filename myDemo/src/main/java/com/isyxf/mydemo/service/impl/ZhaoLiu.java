package com.isyxf.mydemo.service.impl;

import com.isyxf.mydemo.service.Hero;
import org.springframework.stereotype.Component;

//@Component
public class ZhaoLiu implements Hero {
    @Override
    public void say() {
        System.out.println("我是赵六");
    }
}
