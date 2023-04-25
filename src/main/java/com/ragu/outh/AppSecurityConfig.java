//package com.ragu.outh;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//
//@Configuration
//@EnableAuthorizationServer
//public class AppSecurityConfig extends WebSecurityConfigurerAdapter {
//	@Override
//	protected void configure(AuthenticationManagerBuilder oauth) throws Exception {
//		oauth.inMemoryAuthentication()
//		.withUser("admin").
//		password("admin").
//		roles("ADMIN");}
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.csrf().disable();
//		http.authorizeRequests().antMatchers("/user").hasAnyRole("ADMIN").antMatchers("/oAuth/user").fullyAuthenticated().and().httpBasic();}
//	@Override
//	public void configure(WebSecurity web) throws Exception{
//		web.ignoring().antMatchers("/h2-console/**");}
//	@SuppressWarnings("deprecation")
//	@Bean
//	public static NoOpPasswordEncoder paswordEncoder() {
//		return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();}
//}
