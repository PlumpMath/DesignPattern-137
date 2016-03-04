package com.cbn.builder.person;

public class FatPersonBuilder extends Builder{
	private Product product;
	public  FatPersonBuilder() {
		product = new Product();
	}
	@Override
	public void builderHead() {
		product.addParts("添加胖人头");
	}

	@Override
	public void builderBody() {
		product.addParts("添加胖人身体");
	}

	@Override
	public void builderHands() {
		product.addParts("添加胖人手");
	}

	@Override
	public void builderFoots() {
		product.addParts("添加胖人脚");
	}

	@Override
	public Product retrieveProduct() {
		return product;
	}

}
