package ie.jabbers.commands;

import java.util.ArrayList;
import java.util.List;

public class CommandHandler {

	private List<ICommand> history = new ArrayList<ICommand>();


	public void storeAndExecute(ICommand cmd) {
		this.history.add(cmd); // optional 
		cmd.execute();        
	}
}


