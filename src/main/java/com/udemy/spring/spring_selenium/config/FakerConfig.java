package com.udemy.spring.spring_selenium.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FakerConfig {


    //bean is manual configuration
    // component is automatic configuration
    // both are spring managed beans

    // classes for external libraries
    // @Bean
    // @Configuration
    // --> why? because you cannot modify 3rd party classes source code. Instead we create an instance and request spring to manage it for us.

    // Bean Lifecycle
    // Set constructor & field values  -->  setBeanName (BeanNameAware)  -->  setBeanClassLoader(BeanClassLoaderAware)  --> setBeanFatory (BeanFactoryAware)  --> @PostConstruct --> afterProperties (initializingBean) --> Bean is ready to be used!!  -->  @PreDestroy  --> destroy (DisposableBean)
    @Bean
    public Faker getFaker(){
        return new Faker();
    }


}
