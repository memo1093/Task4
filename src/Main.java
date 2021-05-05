

import java.time.LocalDate;


import Concrete.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.Save(new Customer(1,"Mehmet","Akyer",LocalDate.of(1994, 9,26),"10093302738" ));
		
	}

}
