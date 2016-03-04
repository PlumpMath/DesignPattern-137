package com.cbn.builder.person;

public class ThinPersonBuilder extends Builder{
	private Product product;
	public  ThinPersonBuilder() {
		product = new Product();
	}
	@Override
	public void builderHead() {
		product.addParts("添加瘦人头");
	}

	@Override
	public void builderBody() {
		product.addParts("添加瘦人身体");
	}

	@Override
	public void builderHands() {
		product.addParts("添加瘦人手");
	}

	@Override
	public void builderFoots() {
		product.addParts("添加瘦人脚");
	}

	@Override
	public Product retrieveProduct() {
		return product;
	}

}
