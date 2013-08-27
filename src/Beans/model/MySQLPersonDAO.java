package Beans.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class MySQLPersonDAO implements PersonDAO {
	
	/* (non-Javadoc)
	 * @see Beans.model.PersonDAO#addPerson(Beans.model.Person)
	 */
	@Override
	public void addPerson(Person person){
		try{
		Connection con = Database.getInstance().getCon();
		String perSql = "INSERT into Person(name,password) values (?,?)";
		PreparedStatement ps = con.prepareStatement(perSql);
		ps.setString(1, person.getName());
		ps.setString(2, person.getPassword());
		ps.executeUpdate();
		}catch(SQLException ex){
			System.out.println("Eror in inserting record :"+ex);
		}
		
	}
	
	/* (non-Javadoc)
	 * @see Beans.model.PersonDAO#getPerson(int)
	 */
	@Override
	public Person getPerson(int id){
		return null;
	}
	
	/* (non-Javadoc)
	 * @see Beans.model.PersonDAO#getAllPeople()
	 */
	@Override
	public List<Person> getAllPeople(){
		return Collections.EMPTY_LIST;
	}
	
	/* (non-Javadoc)
	 * @see Beans.model.PersonDAO#updatePerson(Beans.model.Person)
	 */
	@Override
	public void updatePerson(Person person){
		
	}
	
	/* (non-Javadoc)
	 * @see Beans.model.PersonDAO#deletePerson(java.lang.String)
	 */
	@Override
	public boolean deletePerson(String id){
		return true;
	}

}
