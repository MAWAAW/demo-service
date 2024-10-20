package business;

import dao.IDao;

public class BusinessImpl implements IBusiness {
    private IDao dao;

    /*
     * Inject inside dao variable an object of
     * a class who implements IDao interface
     * */
    public BusinessImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double compute() {
        /*
        * get data from DAO and run a
        * complex algorithm to compute something
        * */
        double result = dao.getData();
        result = result + Math.random()*Math.PI;
        return result;
    }
}