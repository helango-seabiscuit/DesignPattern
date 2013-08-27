package Beans.model;

public class PostgresDAOFactory extends DAOFactory {

	@Override
	public PersonDAO getPersonDAO() {
		// TODO Auto-generated method stub
		return new PostgresDAO();
	}

}
