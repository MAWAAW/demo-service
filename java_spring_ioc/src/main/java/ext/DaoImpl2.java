package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        /*
         * get data from sensors
         * */
        System.out.println("Sensors version...");
        double data = Math.random()*100;
        return data;
    }
}