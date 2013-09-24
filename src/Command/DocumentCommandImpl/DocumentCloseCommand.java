package Command.DocumentCommandImpl;


//Concrete Command implementers
public class DocumentCloseCommand implements ActionCommand {
	
	Document doc;
	public DocumentCloseCommand(Document doc){
		this.doc = doc;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		doc.close();
	}

}
