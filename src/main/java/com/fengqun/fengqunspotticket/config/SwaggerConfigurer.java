package com.fengqun.fengqunspotticket.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: LCM
 * @Date: 2019/7/20 1:34
 */
@Configuration
@EnableSwagger2
public class SwaggerConfigurer {

    @Bean //把方法的返回值注入ioc容器中
    public Docket api(){
        return  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.fengqun.fengqunspotticket.controller"))
                .paths(PathSelectors.any())
                .build();
    }




    private ApiInfo apiInfo(){
        return   new ApiInfoBuilder()
                .title("景区购票项目Api接口测试文档")
                .description("xxxxxxxxx")
                .version("1.0")
                .build();


    }

}
