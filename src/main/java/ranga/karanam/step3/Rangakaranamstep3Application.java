package ranga.karanam.step3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//this is a spring context file
//enables autoconfiguration
//enables component scan (scans the classes in package ranga.karanam.step3)
public class Rangakaranamstep3Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Rangakaranamstep3Application.class, args);
	   //all the things that are needed for a rest service  - how did they get configured automatically?
	
	   for (String beanName: ctx.getBeanDefinitionNames())
	   {
		   System.out.println(beanName);
		   // there are a host of things that are getting configured for us automatically
	       //this is autoconfiguration
	       
		   // at app start up 
		   // 1. spring boot framework triggers autoconfig
		   // 2. loop thru classes on the classpath
		   // 3. i have a spring web on classpath 
		   //    - then i would need to configure a dispatcher servlet
	   }
	
	}

}
