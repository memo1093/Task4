package Adapters;

import java.rmi.RemoteException;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		long nationalityId = Long.parseLong(customer.getNationalityId());
		boolean result;
		try {
			result = client.TCKimlikNoDogrula(nationalityId ,customer.getFirstName().toUpperCase() ,customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear()) ;
		
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			result = false;
			e.printStackTrace();
		}
		return result;
	}

	

}
