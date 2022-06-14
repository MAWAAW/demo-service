package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao3")
public class DaoImpl3 implements IDao {
    @Override
    public double getData() {
        /*
         * get data from API
         * */
        System.out.println("API version...");
        double data = Math.random()*1000;
        return data;
    }
}