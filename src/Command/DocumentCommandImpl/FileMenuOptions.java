package Command.DocumentCommandImpl;

import java.util.HashMap;
import java.util.Map;

//INVOKER Object
public class FileMenuOptions {
	
	Map<String,ActionCommand> fileCommands;
	
	public FileMenuOptions(Document doc) {
		// TODO Auto-generated constructor stub
		fileCommands = new HashMap<String,ActionCommand>();
		DocumentOpenCommand docOpen = new DocumentOpenCommand(doc);
		fileCommands.put("open", docOpen);
		DocumentCloseCommand docClose = new DocumentCloseCommand(doc);
		fileCommands.put("close", docClose);
		DocumentSaveCommand docSave = new DocumentSaveCommand(doc);
		fileCommands.put("save", docSave);
		
	}
	
	public void doCommand(String command){
		ActionCommand comm = fileCommands.get(command);
		if(comm!=null)
		comm.execute();
		else
		System.out.println("Not a expected command");
	}

}
