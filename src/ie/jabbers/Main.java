package ie.jabbers;

import ie.jabbers.commands.CommandHandler;
import ie.jabbers.commands.ICommand;
import ie.jabbers.commands.mgmt.LockDeviceCommand;
import ie.jabbers.commands.mgmt.WipeDeviceCommand;

public class Main {
	public static void main(String args[]) {

		ICommand lockDevice = new LockDeviceCommand();
		ICommand wipeDevice = new WipeDeviceCommand();

		CommandHandler s = new CommandHandler();

		try {

			s.storeAndExecute(lockDevice);
			s.storeAndExecute(wipeDevice);

		} catch (Exception e) {
			System.out.println("Arguments required.");
		}
	}
}
