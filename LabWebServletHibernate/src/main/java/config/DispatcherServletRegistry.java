package config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletRegistry 
				extends AbstractAnnotationConfigDispatcherServletInitializer {
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}
	//6969ddddd
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {SpringMvcJavaConfiguration.class};
	}
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
}
