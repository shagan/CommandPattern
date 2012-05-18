package ie.jabbers.commands.mgmt;

import ie.jabbers.commands.ICommand;

public class LockDeviceCommand implements ICommand{

	@Override
	public void execute() {
		System.out.println(LockDeviceCommand.class.getSimpleName());

	}

}
