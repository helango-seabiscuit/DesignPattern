package Composite.DirectoryFile;

import java.util.ArrayList;
import java.util.List;

public class Directory implements AbstractFile {

	private List<AbstractFile> files;
	private String name;
	
	Directory(String name){
		files = new ArrayList<AbstractFile>();
		this.name = name;
	}
	@Override
	public void ls() {
		System.out.println("Displaying Directory "+name);
		
		for(AbstractFile file:files)
			file.ls();
		
	}
	
	public void addFile(AbstractFile file){
		files.add(file);
	}
	
	public void removeFile(AbstractFile file){
		files.remove(file);
	}

}
