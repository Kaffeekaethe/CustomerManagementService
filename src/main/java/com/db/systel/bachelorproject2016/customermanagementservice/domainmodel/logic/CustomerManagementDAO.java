package com.db.systel.bachelorproject2016.customermanagementservice.domainmodel.logic;

import java.util.List;

import com.db.systel.bachelorproject2016.customermanagementservice.domainmodel.data.Account;
import com.db.systel.bachelorproject2016.customermanagementservice.domainmodel.data.Customer;
import com.db.systel.bachelorproject2016.customermanagementservice.domainmodel.data.CustomerContact;
/*
 * Passende Funktionen für die einzelnen Schnittstellen
 */
public interface CustomerManagementDAO {

	public Customer getCustomer(String username, String password, boolean fullInformation);

	public int insertCustomer(Customer customer);

	public String insertAccount(Account account);
	
	public List<CustomerContact> getContactInformation(List<Integer> customerIDs);
	
	public boolean deleteAccount(Integer customerID);
}
