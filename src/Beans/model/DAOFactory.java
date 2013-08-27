package Beans.model;

public abstract class DAOFactory {

	
	public static final int MYSQL = 1;
	public static final int POSTGRES = 2;
	
	public abstract PersonDAO getPersonDAO() ;
	
	public static DAOFactory getDAOFactory(int type){
		switch(type){
		case MYSQL:return new MySQLDAOFactory();
		case POSTGRES:return new PostgresDAOFactory();
		default: return null;
		}
	}

}