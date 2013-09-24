package Composite.StructureBlock;

public class StructureBlockTest {

	public static void main(String[] args) {
		Structure s = new Structure();
		Block b1 = new Block();
		Block b2 = new Block();
		Block b3 = new Block();
		Block b4 = new Block();
		
		s.addBlock(b1);
		s.addBlock(b2);
		s.addBlock(b3);
		s.addBlock(b4);
		s.assemble();
	}

}
