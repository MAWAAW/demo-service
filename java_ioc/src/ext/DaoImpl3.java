package ext;

import dao.IDao;

public class DaoImpl3 implements IDao {
    @Override
    public double getData() {
        /*
         * get data from API
         * */
        double data = Math.random()*1000;
        return data;
    }
}