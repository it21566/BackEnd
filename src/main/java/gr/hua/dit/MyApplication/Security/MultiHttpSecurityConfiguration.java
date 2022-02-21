/*
package gr.hua.dit.MyApplication.Security;

import com.vaadin.flow.spring.security.VaadinWebSecurityConfigurerAdapter;
import gr.hua.dit.MyApplication.Views.LoginView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class MultiHttpSecurityConfiguration {
    */
/*@Autowired
    private DataSource dataSource;*//*

    */
/**
     * ONLY FOR /api/**
     * all api requests will have "Authorization" header which I can use to authenticate, if valid. no login needed
     *//*

    @Configuration
    @Order(1)
    public static class RestSecurityConfigurationAdapter extends WebSecurityConfigurerAdapter {
        @Override
        protected void configure(HttpSecurity http) throws Exception {

            http.cors().and().csrf().disable().authorizeRequests().antMatchers("/api/**").permitAll().anyRequest().authenticated();
            // these requests come with an "Authorization" header with a token
            // Use this token to create an Authentication for this request.

        }
    }

    */
/**
     * FOR ANYTHING EXCEPT /api/**
     * for any UI request, redirect to /login if user is not yet authenticated.
     *//*

    @Configuration
    @Order(2)
    public class SecurityConfig extends VaadinWebSecurityConfigurerAdapter {

        @Autowired
        private DataSource dataSource;

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            // Set default security policy that permits Vaadin internal requests and
            // denies all other
            //http.authorizeRequests().antMatchers("/api/**").permitAll().anyRequest().authenticated();
            super.configure(http);
            //http.csrf().disable();
            setLoginView(http, LoginView.class, "/logout");
        }

        @Override
        public void configure(WebSecurity web) throws Exception {
            super.configure(web);

            web.ignoring().antMatchers("/images/**");
            //web.ignoring().antMatchers("/api/**");
        }

        */
/*@Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
          auth.inMemoryAuthentication().withUser("user").password("{noop}userpass").roles("USER");
        }*//*

        @Override
        protected void configure(AuthenticationManagerBuilder auth) throws Exception {
            auth.jdbcAuthentication().dataSource(dataSource)
                    .passwordEncoder(passwordEncoder())
                    .usersByUsernameQuery(
                            "select username,password, enabled from user where username=?")
                    .authoritiesByUsernameQuery(
                            "select username, authority from authorities where username=?");
        }

        @Bean
        public PasswordEncoder passwordEncoder() {
            PasswordEncoder encoder = new BCryptPasswordEncoder();
            return encoder;
        }
    }
}*/
