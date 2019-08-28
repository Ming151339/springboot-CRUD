package com.fengqun.fengqunspotticket.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: LCM
 * @Date: 2019/7/20 1:31
 */
@Configuration
@MapperScan("com.fengqun.fengqunspotticket.dao")
public class MybatisPlusConfigurer {
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
