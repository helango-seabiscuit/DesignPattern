package Beans.model;

public class MySQLDAOFactory extends DAOFactory {

	/* (non-Javadoc)
	 * @see Beans.model.DAOFactory#getPersonDAO()
	 */
	@Override
	public PersonDAO getPersonDAO(){
		return new MySQLPersonDAO();
	}
	

}
