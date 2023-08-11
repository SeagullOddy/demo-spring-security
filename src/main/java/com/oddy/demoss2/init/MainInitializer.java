package com.oddy.demoss2.init;

import com.oddy.demoss2.config.MainConfig;
import com.oddy.demoss2.config.SecurityConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// 使用 Java Config 来配置 DispatcherServlet，相当于 web.xml 中的配置
// 目的是使用 Controller 替代 Servlet 进行开发
public class MainInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

  @Override
  protected Class<?>[] getRootConfigClasses() {
    return new Class[]{MainConfig.class, SecurityConfig.class};
  }

  @Override
  protected Class<?>[] getServletConfigClasses() {
    return new Class[0];
  }

  // 将 DispatcherServlet 映射到根目录
  @Override
  protected String[] getServletMappings() {
    return new String[]{"/"};
  }

}
