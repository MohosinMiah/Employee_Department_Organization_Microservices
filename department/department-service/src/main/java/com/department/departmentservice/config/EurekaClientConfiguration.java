// package com.department.departmentservice.config;

// import com.netflix.discovery.AbstractDiscoveryClientOptionalArgs;
// import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
// import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// @EnableDiscoveryClient
// public class EurekaClientConfiguration {

//     // Define a bean for AbstractDiscoveryClientOptionalArgs
//     @Bean
//     @ConditionalOnMissingBean(AbstractDiscoveryClientOptionalArgs.class)
//     public AbstractDiscoveryClientOptionalArgs discoveryClientOptionalArgs() {
//         return new AbstractDiscoveryClientOptionalArgs() {};
//     }
// }
