package Beans.model;

import java.util.List;

public interface PersonDAO {

	public abstract void addPerson(Person person);

	public abstract Person getPerson(int id);

	public abstract List<Person> getAllPeople();

	public abstract void updatePerson(Person person);

	public abstract boolean deletePerson(String id);

}