package com.derbasov.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Map;

/**
 * @author yad
 */
@Controller
public class SampleController {
    @RequestMapping(value = "/persist", method = RequestMethod.GET)
    public @ResponseBody
    Map<String, Object> persist(@RequestParam("data") String data) {
        throw new NotImplementedException();
    }

    @RequestMapping(value = "/getRandomData", method = RequestMethod.GET)
    public @ResponseBody
    String getRandomData() {
        return "hello";
    }
}
