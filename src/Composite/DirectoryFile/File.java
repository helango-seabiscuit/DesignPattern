package Composite.DirectoryFile;

public class File implements AbstractFile {

	private String name;
	private StringBuffer sb;
	
	File(String name){
		this.name = name;
	}
	
	@Override
	public void ls() {
		System.out.println("File "+name);
	}

}
