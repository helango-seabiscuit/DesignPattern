package Command.DocumentCommandImpl;

//Concrete Command implementers
public class DocumentSaveCommand implements ActionCommand {
	
	Document doc;
	public DocumentSaveCommand(Document doc){
		this.doc = doc;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		doc.save();
	}

}
