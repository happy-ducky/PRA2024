package spring;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@ComponentScan
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }

    @Bean
    public YAMLConfig config() {
        return new YAMLConfig();
    }

    @Bean
    public Printer fddz(){
        return new Printer();
    }

}
