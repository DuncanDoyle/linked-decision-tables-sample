package com.myteam.my_first_project;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Applicant implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private long id;
	private java.lang.String name;
	private java.lang.String surname;

	private com.myteam.my_first_project.CreditScore creditScore;

	private int income;

	private int consumerDebt;

	private int medical;

	private int rentOrMortgage;

	public Applicant() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getSurname() {
		return this.surname;
	}

	public void setSurname(java.lang.String surname) {
		this.surname = surname;
	}

	public com.myteam.my_first_project.CreditScore getCreditScore() {
		return this.creditScore;
	}

	public void setCreditScore(
			com.myteam.my_first_project.CreditScore creditScore) {
		this.creditScore = creditScore;
	}

	public int getIncome() {
		return this.income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public int getConsumerDebt() {
		return this.consumerDebt;
	}

	public void setConsumerDebt(int consumerDebt) {
		this.consumerDebt = consumerDebt;
	}

	public int getMedical() {
		return this.medical;
	}

	public void setMedical(int medical) {
		this.medical = medical;
	}

	public int getRentOrMortgage() {
		return this.rentOrMortgage;
	}

	public void setRentOrMortgage(int rentOrMortgage) {
		this.rentOrMortgage = rentOrMortgage;
	}

	public Applicant(long id, java.lang.String name, java.lang.String surname,
			com.myteam.my_first_project.CreditScore creditScore, int income,
			int consumerDebt, int medical, int rentOrMortgage) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.creditScore = creditScore;
		this.income = income;
		this.consumerDebt = consumerDebt;
		this.medical = medical;
		this.rentOrMortgage = rentOrMortgage;
	}

}