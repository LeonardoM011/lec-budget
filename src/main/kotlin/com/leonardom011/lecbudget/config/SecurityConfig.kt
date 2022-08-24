package com.leonardom011.lecbudget.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.http.SessionCreationPolicy
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.factory.PasswordEncoderFactories
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.provisioning.InMemoryUserDetailsManager
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {

        http
            .cors()
            .and()
            .csrf().disable()
            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            .and()
            .authorizeRequests()
        //  .mvcMatchers(HttpMethod.GET, "/api/checkup/paged/**").hasAuthority("SCOPE_admin")
            .anyRequest().permitAll()
            .and()
            .oauth2Client()
        return http.build()
    }

    fun userDetailsService(): UserDetailsService {
        return InMemoryUserDetailsManager().apply {
            createUser(
                User.withUsername("leo")
                        // password: leo
                    .password("{bcrypt}\$2a\$12\$paeFJFG08WMxTy.aSumw5OCyBNsSMXOCwq6hhkRatSiR1kqoxTrQ.")
                    .authorities("ROLE_admin")
                    .build()
            )
            createUser(
                User.withUsername("blaza")
                        // password: 123456
                    .password("{bcrypt}\$2a\$12\$xZueBDKMog/tDpMfkQ7LIu9emKsG9kPTnB7FgARvNbSaNqhOIP2iC")
                    .authorities("ROLE_user")
                    .build()
            )
        }
    }

    @Bean
    fun passwordEncoder(): PasswordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder()
}