package cn.ekgc.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParentStarter
{
    public static void main( String[] args )
    {
        SpringApplication.run(ParentStarter.class, args);
        System.out.println( "Hello ParentStarter!" );
    }
}
