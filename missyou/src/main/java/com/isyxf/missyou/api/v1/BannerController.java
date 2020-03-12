package com.isyxf.missyou.api.v1;

import com.isyxf.missyou.sample.hero.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BannerController {
    @Autowired
    private Skill skill;
    @Autowired

    /**
     * 返回字符串
     * @return
     */
    @GetMapping("/test")
    public String test() {
        skill.d();
        return "233";
    }

    /**
     * 返回字符串
     * @return
     */
    @PostMapping("/test2")
    public String test2(@RequestBody String str) {
        return str;
    }
}
