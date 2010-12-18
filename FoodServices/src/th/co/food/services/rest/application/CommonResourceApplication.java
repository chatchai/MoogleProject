package th.co.food.services.rest.application;

import org.restlet.Application;
import org.restlet.Restlet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * @author Chatchai Pimtun (Admin)
 *
 */
public class CommonResourceApplication extends Application {

    /**
     * Creates a root Restlet that will receive all incoming calls.
     */
    @Override
    public synchronized Restlet createRoot() {
        // Create a router Restlet that defines routes.
    	System.out.println( " AoeResourceApplication into createRoot"); 
    	final   ApplicationContext springContext = new ClassPathXmlApplicationContext(
                 new String[] {
                		 "th/co/food/services/rest/config/applicationContext-common.xml",
                		 "th/co/food/services/rest/config/applicationContext-hibernate.xml",
                		 "th/co/food/services/rest/config/applicationContext-root-router.xml"
                         });
   
    	/*Guard guard = new Guard(getContext(),  
    	        ChallengeScheme.HTTP_BASIC, "Tutorial");  */
    	//guard.getSecrets().put("aoe", "aoe".toCharArray());  
    	
    	// Create a Directory able to return a deep hierarchy of files  
    	/*Directory directory = new Directory(getContext(), ROOT_URI);  
    	guard.setNext(directory);  
    	return guard; */ 
    	///guard.setNext(co.th.vlink.moogle.rest.resource.QuizsResource.class);

        // Add a route for the MailRoot resource
        
    	org.restlet.ext.spring.SpringRouter router = (org.restlet.ext.spring.SpringRouter)springContext.getBean("root");
    	
    	//router.attachDefault(guard);
        return router;
    	//return guard;
    }
     
}
