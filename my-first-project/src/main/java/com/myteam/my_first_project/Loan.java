package com.myteam.my_first_project;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Loan implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Amount")
	private int amount;

	private boolean approved;

	public Loan() {
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isApproved() {
		return this.approved;
	}

	public void setApproved(boolean approved) {
		this.approved = approved;
	}

	public Loan(int amount, boolean approved) {
		this.amount = amount;
		this.approved = approved;
	}

}