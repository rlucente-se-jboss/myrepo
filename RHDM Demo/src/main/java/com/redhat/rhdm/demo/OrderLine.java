package com.redhat.rhdm.demo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class OrderLine implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Article")
	private com.redhat.rhdm.demo.Article article;
	@org.kie.api.definition.type.Label(value = "Quantity")
	private int quantity;

	public OrderLine() {
	}

	public com.redhat.rhdm.demo.Article getArticle() {
		return this.article;
	}

	public void setArticle(com.redhat.rhdm.demo.Article article) {
		this.article = article;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public OrderLine(com.redhat.rhdm.demo.Article article, int quantity) {
		this.article = article;
		this.quantity = quantity;
	}

}