package com.cbn.visitor.example;

import java.util.ArrayList;

/**
 * 条目清单
 * 
 * @author boning
 *
 */
public class InventoryVisitor extends Visitor{
	private ArrayList<Equipment> list;
	
	public InventoryVisitor() {
		list = new ArrayList<>();
	}
	public int size(){
		return list.size();
	}
	
	@Override
	public void visitHardDisk(HardDisk disk) {
		list.add(disk);
	}

	@Override
	public void visitMainBoard(MainBoard board) {
		list.add(board);
	}

	@Override
	public void visitCpu(Cpu cpu) {
		list.add(cpu);
	}

	@Override
	public void visitCase(Case case1) {
		list.add(case1);
	}

	@Override
	public void visitIntegratedBoard(IntegrateBoard board) {
		list.add(board);
	}

}
