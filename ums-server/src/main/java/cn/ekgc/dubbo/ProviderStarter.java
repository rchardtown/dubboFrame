package cn.ekgc.dubbo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("cn.ekgc.dubbo.dao")
@SpringBootApplication
public class ProviderStarter
{
    public static void main( String[] args )
    {
        SpringApplication.run(ProviderStarter.class, args);
    }
}
