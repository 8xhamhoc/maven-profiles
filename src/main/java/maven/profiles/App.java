package maven.profiles;

import maven.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;

import java.util.List;

public class App {

    public static void main( String[] args ) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mongo-config.xml");
        MongoOperations mongoOperations = applicationContext.getBean("mongoTemplate", MongoOperations.class);

        /*User user = new User();
        user.setId("12345678");
        user.setAge(29);
        user.setName("Quang Phan");
        user.setDateOfBirth("1989-09-13");

        mongoOperations.save(user);*/

        List<User> users = mongoOperations.findAll(User.class);

        for (User user : users) {
            System.out.println("Username: " + user.getName());
        }

    }

}
