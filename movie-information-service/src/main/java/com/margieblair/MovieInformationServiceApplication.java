package com.margieblair;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MovieInformationServiceApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(MovieInformationServiceApplication.class, args);
		} catch (BeanCreationException ex) {
			System.out.println("NO BEANS HERE FOOL");
		}
	}

}
