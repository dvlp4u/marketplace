package com.marketplace.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("ste")
			.password("ste")
			.roles("ADMIN")
			.and()
			.withUser("user")
			.password("user")
			.roles("USER");
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors();
		http.authorizeRequests()
			.antMatchers("/jsp/utenti/**","/jsp/add/**","/jsp/delete/**").hasRole("ADMIN")
//			.antMatchers("/???").hasAnyRole("USER","ADMIN")
			.antMatchers("/","home","/jsp/prodotti/**").permitAll()
			.and().logout()
     			.logoutUrl("/logout")
     			.logoutSuccessUrl("/")
			.and().formLogin();		
	}
	
@Bean
public PasswordEncoder getPasswordEncoder() {
	return NoOpPasswordEncoder.getInstance();
}

}
