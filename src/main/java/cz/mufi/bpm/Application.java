package cz.mufi.bpm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.http.MediaType;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//ConfigurableApplicationContext ctx =  
				SpringApplication.run(Application.class, args);

        //RepositoryRestConfiguration restConfiguration = ctx.getBean(RepositoryRestConfiguration.class);

        //restConfiguration.setDefaultMediaType(MediaType.APPLICATION_JSON);
	}
	
//	 @Override
//	    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
//	        super.configureRepositoryRestConfiguration(config);
//	        config.setReturnBodyOnCreate(true);
//	    }
}
