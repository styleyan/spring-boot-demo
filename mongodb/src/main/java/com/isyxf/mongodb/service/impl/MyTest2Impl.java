package com.isyxf.mongodb.service.impl;

import com.isyxf.mongodb.service.MyTest;
import org.springframework.stereotype.Component;

@Component("barMyTest")
public class MyTest2Impl implements MyTest {
    @Override
    public String format() {
        return "first  My Test2";
    }
}
