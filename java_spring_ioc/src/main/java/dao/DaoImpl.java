package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        /*
        * get data from database
        * */
        System.out.println("Database version...");
        double data = Math.random()*10;
        return data;
    }
}