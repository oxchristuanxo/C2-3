package A.pojo;

import com.A.Country;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import static com.A.Add.insertTest;
import static com.A.Httpapi.*;
import java.io.IOException;
import java.io.InputStream;

public class Test1 {
    public static void main(String[] args) throws IOException {
        Country country=new Country();
        country.setCountry ("US");
        insertTest(country);
    }

}

