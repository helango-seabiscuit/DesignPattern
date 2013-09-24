package Command.DocumentCommandImpl;

public class ClientDocumentAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc = new Document("Sample.txt");
		FileMenuOptions fileOptions = new FileMenuOptions(doc);
		fileOptions.doCommand("open");
		fileOptions.doCommand("save");
		fileOptions.doCommand("close");
		fileOptions.doCommand("exit");

	}

}
