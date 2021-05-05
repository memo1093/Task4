package Concrete;

import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbuckCustomerManager extends BaseCustomerManager {
	
	private CustomerCheckService customerCheckService;
	
	public StarbuckCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	public void Save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			
			super.Save(customer);
		}
		else {
			System.out.println("Invalid person informations! Please check your informations.");
		}
	}

}
