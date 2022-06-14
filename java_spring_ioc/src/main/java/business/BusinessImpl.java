package business;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessImpl implements IBusiness {
    private IDao dao; // loose coupling
    public BusinessImpl(IDao dao) { // better than @Autowired + @Qualifier("dao")
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

    /*
    * Inject inside dao variable an object of
    * a class who implements IDao interface
    * */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}