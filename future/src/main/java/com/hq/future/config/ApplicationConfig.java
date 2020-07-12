package com.hq.future.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ApplicationConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/")
//                .addResourceLocations("classpath:/templates/html/");
        //访问  /static/下的即为 /statice/下的目录
//        registry.addResourceHandler("res")
//                .addResourceLocations("classpath:/templates/res");
    }
}
