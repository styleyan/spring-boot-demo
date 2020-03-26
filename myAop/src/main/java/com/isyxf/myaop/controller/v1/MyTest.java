package com.isyxf.myaop.controller.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Y.jer
 */
@RestController
public class MyTest {
    @GetMapping("/api/say")
    public String say() {
        return "233ee";
    }

    @GetMapping("/api/say2")
    public String say2() {
        return "233ee";
    }

    @GetMapping("/api/say3")
    public Object myTest() {
        Map map = new HashMap();
        map.put("aaa", "23323");

        return map;
    }

    @GetMapping("/api/opTest")
    public String poTest() {
        return "opTest";
    }

    @GetMapping("/api/opTest2")
    public void poTest2() {
       throw  new RuntimeException("有异常");
    }
}
