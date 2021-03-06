package com.dapast1289.microservice.member.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable();
        http
                .authorizeRequests()
                .antMatchers("/swagger-ui.html")
                .permitAll();
        http
                .authorizeRequests()
                .antMatchers("/**")
                .authenticated();
        http.httpBasic();
    }
}
