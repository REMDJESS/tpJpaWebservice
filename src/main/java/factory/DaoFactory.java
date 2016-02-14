package factory;

import dao.*;

public class DaoFactory {
    
    private DaoFactory(){   
    }
    
    public static PersonDao getPersonDao(){
        return new PersonDao();
    }
    
    public static HomeDao getHomeDao(){
        return new HomeDao();
    }
}
