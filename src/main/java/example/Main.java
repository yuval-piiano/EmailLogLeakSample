package example;
import java.util.Map;
import java.util.HashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient;
import com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder;
import com.amazonaws.services.simpleemail.model.Body;
import com.amazonaws.services.simpleemail.model.Content;
import com.amazonaws.services.simpleemail.model.Destination;
import com.amazonaws.services.simpleemail.model.Message;
import com.amazonaws.services.simpleemail.model.SendEmailRequest; 

public class Main {
    private static final Logger logger = LogManager.getLogger("HelloWorld");
    
    private static void writeEmail(Map<String,String> data) {
        logger.info(data.get("email"));
    }

    private static void writeId(Map<String,String> data) {
       logger.info(data.get("id"));
    }

    public static void main(String[] args) {
        //Lombok test - output a field via lombok

        Customer c = new Customer();
        c.setEmailAddress("email@org.example");
        c.setId(1L);
        Map<String, String> data = new HashMap<String, String>();
        data.put("email",c.getEmailAddress());
        data.put("id", c.getId().toString());

        writeEmail(data);
        writeId(data);


    }
}