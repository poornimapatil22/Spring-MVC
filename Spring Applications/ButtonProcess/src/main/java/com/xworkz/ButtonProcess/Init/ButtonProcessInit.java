package com.xworkz.ButtonProcess.Init;

import com.xworkz.ButtonProcess.Config.ButtonProcessConfig;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ButtonProcessInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{ButtonProcessConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{ "/"};
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
