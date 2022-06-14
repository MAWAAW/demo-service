package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        /*
        * get data from database
        * */
        double data = Math.random()*10;
        return data;
    }
}