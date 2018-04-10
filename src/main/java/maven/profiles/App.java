package maven.profiles;

import com.csam.wsc.swisscard.dip.cache.dao.entity.SwisscardTransaction;
import com.csam.wsc.swisscard.dip.cache.dao.repository.SwisscardTransactionRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {

    public static void main( String[] args ) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("mongo-config.xml");
        SwisscardTransactionRepository swisscardTransactionRepository =
                applicationContext.getBean("swisscardTransactionRepository", SwisscardTransactionRepository.class);

        List<SwisscardTransaction> swisscardTransactions = swisscardTransactionRepository.findAll();
        System.out.println("====Size: " + swisscardTransactions.size());

    }

}
