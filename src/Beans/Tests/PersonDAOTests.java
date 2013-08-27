package Beans.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Beans.model.MySQLDAOFactory;
import Beans.model.Database;
import Beans.model.Person;
import Beans.model.MySQLPersonDAO;
import Beans.model.PersonDAO;

public class PersonDAOTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Database.getInstance().connect();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Database.getInstance().disconnect();
	}

	@Before
	public void setUp() throws Exception {
		PersonDAO pDao = new MySQLPersonDAO();
		pDao.deletePerson("");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public void testCreatePerson(){
		Person p1 = new Person();
		p1.setName("p1");
		p1.setPassword("password");
		
//		PersonDAO personDao= MySQLDAOFactory.getPersonDAO();
//		personDao.addPerson(p1);
//		
//		Person gPerson = personDao.getPerson(p1.getId());
//		
//		assertEquals("Contains same person", gPerson, p1);
	}	
	
}
