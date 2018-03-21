package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import com.example.demo.examplebeans.FakeDataSource;
import com.example.demo.examplebeans.FakeJmsSource;

@Configuration
/*note: non boot projects usually go with propertysources approach. Application.prop file is used by boot initiated projects.
 * @PropertySources({ @PropertySource("classpath:datasource.properties"),
		@PropertySource("classpath:fakejmssource.properties") })*/
public class PropertyConfig {
	/*@Autowired
	Environment env;
*/
	@Value("${demo.username}") // maps properties values to local variables.
	private String name;
	@Value("${demo.password}")
	private String password;
	@Value("${demo.url}")
	private String url;

	@Value("${demo.jms.username}")
	private String jmsUserName;
	@Value("${demo.jms.password}")
	private String jmsPassword;
	@Value("${demo.jms.url}")
	private String jmsUrl;
	
	@Bean
	public FakeDataSource getFakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setName(name);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		return fakeDataSource;
	}
	@Bean
	public FakeJmsSource getFakeJmsSource() {
		FakeJmsSource fakeJmsSource = new FakeJmsSource();
		fakeJmsSource.setUsername(jmsUserName);
		fakeJmsSource.setPassword(jmsPassword);
		fakeJmsSource.setUrl(jmsUrl);
		return fakeJmsSource;
	}

	/* note: used by legacy non boot projects. Application.prop is read by Spring boot directly to fetch any prop key.
	 * @Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer; // "PropertySourcesPlaceholderConfigurer" reads the properties
														// file.

	}*/
}
