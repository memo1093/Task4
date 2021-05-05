package Main;

import java.time.LocalDate;

import Adapters.MernisServiceAdapter;
import Concrete.BaseCustomerManager;
import Concrete.StarbuckCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
			BaseCustomerManager customerManager = new StarbuckCustomerManager(new MernisServiceAdapter());
			Customer customer = new Customer (1,"Mehmet","Akyer",LocalDate.of(1994, 9, 26),"123456789101");
			customerManager.Save(customer);
	}

}
