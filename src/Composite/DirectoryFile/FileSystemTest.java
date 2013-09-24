package Composite.DirectoryFile;

public class FileSystemTest {

	public static void main(String[] args) {
		File f1 = new File("A");
		File f2 = new File("B");
		File f3 = new File("C");
		
		Directory d = new Directory("inner1");
		d.addFile(f1);
		d.addFile(f2);
		d.addFile(f3);
		
		Directory main = new Directory("main");
		main.addFile(d);
		File f4 = new File("D");
		main.addFile(f4);
		
		main.ls();
		

	}

}
