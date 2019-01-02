package cm.config;

import cm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{
       /*http
                .authorizeRequests()
                .antMatchers("/css/**","/static/**").permitAll()
                .antMatchers("/","/cm/pc/admin/login").permitAll()
                .anyRequest().authenticated()
                .antMatchers("/cm/pc/teacher/**").hasRole("TEACHER")
                .antMatchers("/cm/pc/student/**").hasRole("STUDENT")
                .antMatchers("/cm/pc/admin/**").hasRole("ADMIN");
        http
                .formLogin()
                .loginPage("/cm/pc/admin/login")
                .loginProcessingUrl("/cm/pc/admin/login/submit")
                //.usernameParameter("account")
                //.passwordParameter("password")
                //.successHandler(new LoginSuccessHandler())
                .defaultSuccessUrl("/cm/pc/admin/teacherList")
                .successForwardUrl("/cm/pc/admin.login/submit");

                //.failureUrl("/adminLoginError")
                //.permitAll();
        http
                .logout()
                .logoutSuccessUrl("/cm/login")
                .permitAll();*/

        http    /*.formLogin()                    //  定义当需要用户登录时候，转到的登录页面。
                .loginPage("/login")
                .loginProcessingUrl("/login/submit")
                .and()*/
                .authorizeRequests()        // 定义哪些URL需要被保护、哪些不需要被保护
                .antMatchers("/","/login","/login/submit").permitAll()
                .antMatchers("/static/**","/css/**").permitAll()
                .antMatchers("/cm/**").permitAll()
                .antMatchers("/cm/pc/admin/**").hasRole("admin")
                .antMatchers("/cm/teacher/**").hasRole("teacher")
                .antMatchers("/cm/student/**").hasRole("student")
                .anyRequest()               // 任何请求,登录后可以访问
                .authenticated()
                //.antMatchers("/cm/pc/admin/**").hasRole("ADMIN")

                .and()
                .cors()
                .and()
                .csrf().disable();

    }

    @Override
    public void configure(WebSecurity web) throws Exception{
        web
                .ignoring()
                .antMatchers("/css/*.css","/js/*.js");
    }

    @Autowired
    AdminService adminService;
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("admin").password("admin").roles("ADMIN");
        //.userDetailsService(adminService);
    }
}