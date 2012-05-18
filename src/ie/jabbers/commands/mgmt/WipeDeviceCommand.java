package ie.jabbers.commands.mgmt;

import ie.jabbers.commands.ICommand;

public class WipeDeviceCommand implements ICommand{

	@Override
	public void execute() {
		System.out.println(WipeDeviceCommand.class.getSimpleName());
		
	}

}
