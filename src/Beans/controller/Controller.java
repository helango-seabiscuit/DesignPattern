package Beans.controller;

import Beans.model.*;
import Beans.view.LoginFormEvent;
import Beans.view.LoginListener;
import Beans.view.View;

public class Controller implements LoginListener {
	private View view;
	private Model model;
	private PersonDAO personDao;
	
	public Controller(View view, Model model) {
		this.view = view;
		this.model = model;
	}

	@Override
	public void loginPerformed(LoginFormEvent event) {
		System.out.println("Login event received: " + event.getName() + "; " + event.getPassword());
		Person person = new Person();
		person.setName(event.getName());
		person.setPassword(event.getPassword());
		DAOFactory.getDAOFactory(DAOFactory.MYSQL).getPersonDAO().addPerson(person);
		
	}
	
	
}
