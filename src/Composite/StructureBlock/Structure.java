package Composite.StructureBlock;

import java.util.ArrayList;
import java.util.List;

public class Structure implements Group {
	
	private List<Group> groups;

	Structure(){
		groups = new ArrayList<Group>();
	}
	@Override
	public void assemble() {
		for(Group group:groups)
			group.assemble();
		
	}
	
	public void addBlock(Block b ){
		groups.add(b);
	}
	
	public void removeBlock(Block b){
		groups.remove(b);
	}

}
