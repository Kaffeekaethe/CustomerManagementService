package com.db.systel.bachelorproject2016.customermanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.db.systel.bachelorproject2016.customermanagementservice.api.CustomerManagementController;
import com.db.systel.bachelorproject2016.customermanagementservice.domainmodel.logic.CustomerManagementDAO;
/*
 * TODO: 
 * 
 * 
 * Accounts löschen
 * Sicherheit
 * 
 * Error handling:
 * 	Eingaben nicht korrekt
 *  Nutzername schon vergeben
 *  Ein Kunde mit solchen Daten existiert bereits --> haben Sie vielleicht einen Account?
 */

public class CustomerManagementService {

	public static CustomerManagementDAO customerManagementDAO;

	public static void main(String args[]) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

		customerManagementDAO = (CustomerManagementDAO) context.getBean("customerManagementDAO");

		SpringApplication.run(CustomerManagementController.class, args);

	}

}