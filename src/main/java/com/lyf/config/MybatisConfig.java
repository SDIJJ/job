package com.lyf.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * Created by fangjiejie on 2017/6/17.
 */
@Configuration//设置为配置类
@EnableTransactionManagement//标注提交事务
public class MybatisConfig implements TransactionManagementConfigurer{//继承事务管理配置类
    @Autowired
    DataSource dataSource;//自动装配数据源application.yml
    @Bean("sqlSessionFactory")//建立sqlSessionFactory工厂
    SqlSessionFactory getSqlSessionFactory(){
        SqlSessionFactoryBean sb=new SqlSessionFactoryBean();//创建工厂实例
        sb.setDataSource(dataSource);//将数据源塞进工厂
        sb.setTypeAliasesPackage("com.lyf.model");//工厂扫描model包
        try {
            return sb.getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    @Bean//得到sqlsessionFactory模板
    SqlSessionTemplate getSqlSessionTemplate(SqlSessionFactory sqlSessionFactory){
        return new SqlSessionTemplate(sqlSessionFactory);
    }
    @Override//平台事务管理
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }
}
