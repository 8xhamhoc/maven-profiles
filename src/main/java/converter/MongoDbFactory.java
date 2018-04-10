package converter;

import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.support.PersistenceExceptionTranslator;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.core.MongoDbUtils;
import org.springframework.data.mongodb.core.MongoExceptionTranslator;

public class MongoDbFactory implements org.springframework.data.mongodb.MongoDbFactory, InitializingBean {

    private String databaseName;
    private Mongo mongo;
    private PersistenceExceptionTranslator exceptionTranslator = new MongoExceptionTranslator();

    public void afterPropertiesSet() throws Exception {
        String connectionString = "mongodb://swisscard:swisscard123@mongo-dev.smartdev.vn:27017/";
        MongoClientURI mongoClientURI = new MongoClientURI(connectionString);
        this.databaseName = "swisscard";
        mongo = new MongoClient(mongoClientURI);
    }

    public DB getDb() throws DataAccessException {
        return getDb(databaseName);
    }

    public DB getDb(String s) throws DataAccessException {
        return MongoDbUtils.getDB(mongo, databaseName, UserCredentials.NO_CREDENTIALS);
    }

    public PersistenceExceptionTranslator getExceptionTranslator() {
        return exceptionTranslator;
    }
}
