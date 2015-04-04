package be.kazaag.swagger;

import com.wordnik.swagger.jaxrs.config.BeanConfig;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * JaxRS application
 */
@ApplicationPath("/")
public class App extends Application {

    public App(){
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setVersion("1.0.0");
        beanConfig.setBasePath("http://localhost:8080/jaxrs-swagger/");
        beanConfig.setResourcePackage("be.kazaag.swagger");
        beanConfig.setScan(true);
    }


}
