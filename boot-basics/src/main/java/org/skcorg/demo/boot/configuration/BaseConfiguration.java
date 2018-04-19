package org.skcorg.demo.boot.configuration;

import org.skcorg.demo.boot.properties.SkcProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableConfigurationProperties(SkcProperties.class)
public class BaseConfiguration {
	@Bean
	InternalResourceViewResolver viewResolverRegistry() {
		return new InternalResourceViewResolver();
	}
}
