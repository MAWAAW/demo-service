package view;

import business.IBusiness;
import dao.IDao;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class View {
    public static void main(String[] args) throws Exception {
        // Static injection of dependencies => with new
        // Dynamic injection of dependencies => We specify which DAO should be used in config.txt
        Scanner scanner=new Scanner(new File("config.txt"));

        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName); // ClassNotFoundException
        IDao dao=(IDao) cDao.newInstance(); // InstantiationException, IllegalAccessException

        String businessClassName=scanner.nextLine();
        Class cBusiness=Class.forName(businessClassName);
        IBusiness business=(IBusiness) cBusiness.newInstance();

        Method method= cBusiness.getMethod("setDao",IDao.class);
        method.invoke(business,dao);

        System.out.println("Result=>"+business.compute());
    }
}