package com.ltx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Created by toonew on 2017/1/3.
 */
@RestController
@RequestMapping("/hello")
public class Hello {

    @Autowired
    private GirlProperties girlProperties;

    //    @RequestMapping(value = "/say", method = RequestMethod.POST)
    @GetMapping(value = "/say")
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
        return "id:" + id;
//        return "Hello Spring Boot!  " + girlProperties.getCupSize();
    }
}
