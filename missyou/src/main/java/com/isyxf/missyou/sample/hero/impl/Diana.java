package com.isyxf.missyou.sample.hero.impl;

import com.isyxf.missyou.sample.hero.Skill;
import org.springframework.stereotype.Component;

//@Component
public class Diana implements Skill {
    public Diana() {
        System.out.println("hello, Y.jer Diana");
    }
    @Override
    public void d() {
        System.out.println("Diana Q");
    }
    @Override
    public void w() {
        System.out.println("Diana W");
    }
    @Override
    public void e() {
        System.out.println("Diana E");
    }
    @Override
    public void r() {
        System.out.println("Diana R");
    }
}
