package gr.hua.dit.MyApplication.Security;

import com.vaadin.flow.spring.security.VaadinWebSecurityConfigurerAdapter;
import gr.hua.dit.MyApplication.Views.LoginView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;

import javax.sql.DataSource;

import static org.springframework.security.config.Customizer.withDefaults;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends VaadinWebSecurityConfigurerAdapter {

  @Autowired
  private DataSource dataSource;

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    // Set default security policy that permits Vaadin internal requests and
    // denies all other
    //http.authorizeRequests().antMatchers("/api/**").permitAll().anyRequest().authenticated();
    http.cors().and().csrf().disable().authorizeRequests().antMatchers("/api/**").hasRole("ADMIN").and()
            .httpBasic(withDefaults());

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

  //@Override
  /*protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.inMemoryAuthentication().withUser("user").password("{noop}userpass").roles("USER");
  }*/
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