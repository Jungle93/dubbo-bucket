package com.jungle;

import com.jungle.config.DubboConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 */

public class DubboProviderApplication {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(DubboConfig.class);
        acac.start();
        System.in.read();
    }
}
