package Adapters;

import java.rmi.RemoteException;

import Abstract.*;
import Entities.*;
import Entities.Player;
import MernisServiceReference.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService{

	@SuppressWarnings("deprecation")
	@Override
	public Boolean CheckIfRealPerson(Player player) {
				KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(), player.getBirthYear());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
