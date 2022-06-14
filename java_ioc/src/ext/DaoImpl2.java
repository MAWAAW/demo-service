package ext;

import dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        /*
         * get data from sensors
         * */
        double data = Math.random()*100;
        return data;
    }
}