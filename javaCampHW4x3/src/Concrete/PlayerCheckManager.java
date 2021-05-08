package Concrete;
import Abstract.*;
import Entities.*;

public class PlayerCheckManager implements PlayerCheckService{
		@Override
		public Boolean CheckIfRealPerson(Player player) {
			return true;
	}
}
