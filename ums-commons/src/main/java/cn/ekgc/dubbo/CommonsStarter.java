package cn.ekgc.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommonsStarter
{
    public static void main( String[] args )
    {
        SpringApplication.run(CommonsStarter.class, args);

        System.out.println( "Hello CommonsStarter!" );
    }
}
