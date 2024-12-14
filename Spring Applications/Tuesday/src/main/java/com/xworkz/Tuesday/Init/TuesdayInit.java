package com.xworkz.Tuesday.Init;

import com.xworkz.Tuesday.Component.TuesdayComponent;
import com.xworkz.Tuesday.Config.TuesdayConfig;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class TuesdayInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{TuesdayConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("for handelling dynamic resources by the server");
        return new String[]{"/"};
    }


    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        System.out.println("for handelling static resources by the server itself");
        configurer.enable();
    }
}
