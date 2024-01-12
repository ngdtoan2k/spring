package com.rs.retailstore.config;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class SecurityConfig {
//    @Bean
//    public UserDetailsService userDetailsService(DataSource dataSource){
//        UserDetails user = User.builder()
//                .username("userc")
//                .password("$2a$10$LOZKsbxtwxEI0Re8XHk4tO/Es5PnVw9BVqaVUqKbHjCL1OwFXo4KW")
//                .roles("USER")
//                .build();
//        UserDetails admin = User.builder()
//                .username("adminc")
//                .password("$2a$10$2lomTy1/aJGxlhj3EINhRewVdMpTvjtGriQrovqk3prYJU9eNvMx.")
//                .roles("USER","ADMIN")
//                .build();
//        JdbcUserDetailsManager users = new JdbcUserDetailsManager(dataSource);
//        users.createUser(user);
//        users.createUser(admin);
//        return users;
//    }
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
//    @Bean
//    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.csrf().disable()
//                    .authorizeRequests()
//                    .requestMatchers("/v1/register").permitAll()
//                .requestMatchers("/v1/greeing").authenticated()
//                .and().formLogin()
//                .and().httpBasic();
//        return  httpSecurity.build();
//    }
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                 .authorizeHttpRequests(requests -> requests
//                        .requestMatchers("/v1/greeing")/*.hasAnyRole("SCHUELER", "LEHRER", "VERWALTUNG")
//                         .anyRequest()*/.authenticated()
//                )
//                .formLogin(form -> form
//                        .loginPage("/v1/register")
//                        .permitAll()
//                )
//                .logout((logout) -> logout.permitAll());
//
//        return http.build();
//    }

}
