package factory;

import dao.PersonDao;

public class DaoFactory {
    public static PersonDao getPersonDao(){
        return new PersonDao();
    }
}
