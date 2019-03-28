package com.lyf.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by fangjiejie on 2017/6/17.
 */
@Configuration//设置为配置类
@AutoConfigureAfter(MybatisConfig.class)//在。。。之后配置
public class MybatisMapperScannerConfig {
    @Bean
    MapperScannerConfigurer setMapperScannerConfigurer(){//映射扫描配置
        MapperScannerConfigurer mc=new MapperScannerConfigurer();
        mc.setBasePackage("com.lyf.mapper");//扫描mapper包
        mc.setSqlSessionFactoryBeanName("sqlSessionFactory");//设置sqlSessionFactory
        return mc;
    }
}
