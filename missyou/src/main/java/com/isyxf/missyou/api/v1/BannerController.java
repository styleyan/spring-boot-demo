package com.isyxf.missyou.api.v1;

import org.springframework.web.bind.annotation.*;

@RestController
public class BannerController {
    /**
     * 返回字符串
     * @return
     */
    @GetMapping("/test")
    public String test(@RequestParam String str) {
        System.out.println("223323");
        System.out.println("2343wwer");
        return str;
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
