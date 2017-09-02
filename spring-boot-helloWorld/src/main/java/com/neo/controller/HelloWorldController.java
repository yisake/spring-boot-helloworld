package com.neo.controller;

import java.util.Date;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class HelloWorldController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
    @Value("${application.message:1234556677}")  
    private String message = "hi,hello world......"; 	
	
    @RequestMapping("/hello")
    public String hello() {
    	logger.info("##Return hello world...");
    	logger.error("##Error test");
    	logger.warn("##Warn test");
        return "Hello World";
    }
    
    @RequestMapping("/index")
    public String index(Map<String,Object> model ) {
        model.put("time",new Date());  
        model.put("message",this.message);
        logger.info("##Return web jsp...");
        return "web";
    }
    
    @RequestMapping("/")
    public String web(Map<String,Object> model) {
        model.put("time",new Date());  
        model.put("message",this.message);
        return "web";//返回的内容就是templates下面文件的名称 
    }
    
    @RequestMapping("/freeMark")
    public String child( ) {
    	return "child";
    }
    
    @RequestMapping("/freeMarkInclude")
    public String include_base ( ) {
    	return "include_base";
    }
}