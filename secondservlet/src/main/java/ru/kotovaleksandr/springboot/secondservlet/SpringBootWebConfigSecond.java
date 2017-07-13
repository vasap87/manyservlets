package ru.kotovaleksandr.springboot.secondservlet;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;

import javax.servlet.*;
import java.io.IOException;


/**
 * Created by alexkotov on 27.06.17.
 */
@SpringBootApplication
public class SpringBootWebConfigSecond implements EmbeddedServletContainerCustomizer {


    @SuppressWarnings("serial")
    @Bean
    public Servlet dispatcherServlet() {
        return new GenericServlet() {
            @Override
            public void service(ServletRequest req, ServletResponse res)
                    throws ServletException, IOException {
                res.setContentType("text/plain");
                res.getWriter().append("Servlet two");
            }
        };
    }


    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(8889);
    }
}
