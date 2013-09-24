package Command.DocumentCommandImpl;

//Concrete Command implementers

public class DocumentOpenCommand implements ActionCommand {
	
	Document doc;
	public DocumentOpenCommand(Document doc){
		this.doc = doc;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		doc.open();
	}

}
