package com.cbn.visitor.example;
/**
 * 电脑专卖系统：
 * 本销售系统要做的事情是根据零件的单价对销售单上每一种配置计算出总价格。
 * 
 * 这个系统有两个等级结构，一个是访问者等级结构，以Visitor为根节点；另一个是被访问者等级结构，以Equipment为根节点。
 * 客户端Client对象通过调用具体访问者对象的行动方法，包括PriceVisitor的value方法和InventorVisitor的size方法，会访问聚集中的所有元素，并同时出发双重分派过程。
 * 在遍历过程中，访问者对象会积累状态，这些状态就是客户端需要的数据。
 * @author boning
 *
 */
public class Client {
	private static PriceVisitor pv;
	private static InventoryVisitor iv;
	private static Equipment equipment;
	public static void main(String[] args) {
		equipment = new Pc();
		pv = new PriceVisitor();
		iv = new InventoryVisitor();
		/**
		 * 访问者对象的装填积累
		 * PriceVisitor和InventorVisitor的用意就是在访问过程中积累状态。
		 * 前者积累的是零件的总价格
		 * 后者积累的是零件的总数
		 */
		
		equipment.accept(pv);//让价格访问者访问
		System.out.println("价格是："+pv.value());
		System.out.println();
		equipment.accept(iv);//让条目访问者进行访问
		System.out.println("个数是："+iv.size());
	}
}
