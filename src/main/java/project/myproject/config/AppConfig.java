package project.myproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import project.myproject.service.StudentService;
import project.myproject.service.impl.StudentServiceImpl;
import project.myproject.service.impl.StudentServiceImpl2;

@Configuration
public class AppConfig {
	
	@Bean(name="beanobject")
    public StudentService helloWorld() {
        return new StudentServiceImpl();
    }

	
	@Bean(name="beanobject2")
    public StudentService helloWorld2() {
        return new StudentServiceImpl2();
    }
}
