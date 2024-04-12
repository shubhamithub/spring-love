/*
 * package com.shubhamithub.config;
 * 
 * import javax.servlet.ServletContext; import javax.servlet.ServletException;
 * import javax.servlet.ServletRegistration; import
 * javax.servlet.ServletRegistration.Dynamic;
 * 
 * import
 * org.springframework.context.annotation.AnnotationConfigApplicationContext;
 * import org.springframework.web.WebApplicationInitializer; import
 * org.springframework.web.context.support.
 * AnnotationConfigWebApplicationContext; import
 * org.springframework.web.context.support.XmlWebApplicationContext; import
 * org.springframework.web.servlet.DispatcherServlet;
 * 
 * public class LoveCalculatorApplicationInitializerfirstApproach implements
 * WebApplicationInitializer {
 * 
 * @Override public void onStartup(ServletContext servletContext) throws
 * ServletException {
 * 
 * 
 * XmlWebApplicationContext webApplicationContext = new
 * XmlWebApplicationContext();
 * webApplicationContext.setConfigLocation("classpath:spring-servlet.xml");
 * 
 * 
 * AnnotationConfigWebApplicationContext webApplicationContext = new
 * AnnotationConfigWebApplicationContext();
 * webApplicationContext.register(LoveCalculatorAppConfig.class);
 * 
 * // create a dispatcher servlet object DispatcherServlet dispatcherServlet =
 * new DispatcherServlet(webApplicationContext); // register dispatcher servlet
 * with servlet context ServletRegistration.Dynamic myCustomDispathcerServlet =
 * servletContext.addServlet("myDispatcherServlet", dispatcherServlet);
 * 
 * myCustomDispathcerServlet.setLoadOnStartup(1);
 * myCustomDispathcerServlet.addMapping("/mywebsite.com/*"); }
 * 
 * }
 */