package com.isyxf.missyou.sample.hero.impl;

import com.isyxf.missyou.sample.hero.Skill;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary
public class Lrelia implements Skill {
    public Lrelia() {
        System.out.println("hello, Y.jer Lrelia");
    }

    @Override
    public void d() {
        System.out.println("Lrelia Q");
    }
    @Override
    public void w() {
        System.out.println("Lrelia W");
    }
    @Override
    public void e() {
        System.out.println("Lrelia E");
    }
    @Override
    public void r() {
        System.out.println("Lrelia R");
    }
}
