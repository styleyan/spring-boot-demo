package com.isyxf.missyou;

import com.isyxf.missyou.sample.hero.Skill;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class LOLApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new SpringApplicationBuilder(LOLApplication.class).web(WebApplicationType.NONE).run(args);

        Skill skill = (Skill)context.getBean("irlia");
        skill.d();
    }
}
