package com.microservice.loans.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Loans extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long loanId;

	@Column(nullable = false)
	private String mobileNumber;

	@Column(nullable = false, unique = true)
	private String loanNumber;

	@Column(nullable = false)
	private String loanType;

	@Column(nullable = false)
	private int totalLoan;

	@Column(nullable = false)
	private int amountPaid;

	@Column(nullable = false)
	private int outstandingAmount;

	// Default Constructor
	public Loans() {
	}

	// Parameterized Constructor
	public Loans(Long loanId, String mobileNumber, String loanNumber, String loanType, int totalLoan, int amountPaid, int outstandingAmount) {
		this.loanId = loanId;
		this.mobileNumber = mobileNumber;
		this.loanNumber = loanNumber;
		this.loanType = loanType;
		this.totalLoan = totalLoan;
		this.amountPaid = amountPaid;
		this.outstandingAmount = outstandingAmount;
	}

	// Getters and Setters
	public Long getLoanId() {
		return loanId;
	}

	public void setLoanId(Long loanId) {
		this.loanId = loanId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getLoanNumber() {
		return loanNumber;
	}

	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public int getTotalLoan() {
		return totalLoan;
	}

	public void setTotalLoan(int totalLoan) {
		this.totalLoan = totalLoan;
	}

	public int getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}

	public int getOutstandingAmount() {
		return outstandingAmount;
	}

	public void setOutstandingAmount(int outstandingAmount) {
		this.outstandingAmount = outstandingAmount;
	}

	// toString Method
	@Override
	public String toString() {
		return "Loans{" +
				"loanId=" + loanId +
				", mobileNumber='" + mobileNumber + '\'' +
				", loanNumber='" + loanNumber + '\'' +
				", loanType='" + loanType + '\'' +
				", totalLoan=" + totalLoan +
				", amountPaid=" + amountPaid +
				", outstandingAmount=" + outstandingAmount +
				'}';
	}
}
