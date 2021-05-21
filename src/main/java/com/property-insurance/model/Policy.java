package com.property_insurance.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Policy implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.math.BigInteger id;
	private String memberId;
	private java.lang.Double deductible;
	private java.lang.Double transportationExpenseCoverage;
	private java.lang.Double oemPartsCoverage;
	private java.lang.Double carLiabilityCoverage;
	private java.lang.Double comprehensiveCoverage;
	private java.lang.Double collisionCoverage;
	private java.lang.Double medicalPaymentsCoverage;
	private java.lang.Double personalInjuryProtection;

	private long timeLimitDays;

	private java.lang.Double uninsuradeAndUnderinsuredMotoristCoverage;

	public Policy() {
	}

	public java.math.BigInteger getId() {
		return this.id;
	}

	public void setId(java.math.BigInteger id) {
		this.id = id;
	}

	public java.lang.Double getDeductible() {
		return this.deductible;
	}

	public void setDeductible(java.lang.Double deductible) {
		this.deductible = deductible;
	}

	public java.lang.Double getTransportationExpenseCoverage() {
		return this.transportationExpenseCoverage;
	}

	public void setTransportationExpenseCoverage(
			java.lang.Double transportationExpenseCoverage) {
		this.transportationExpenseCoverage = transportationExpenseCoverage;
	}

	public java.lang.Double getOemPartsCoverage() {
		return this.oemPartsCoverage;
	}

	public void setOemPartsCoverage(java.lang.Double oemPartsCoverage) {
		this.oemPartsCoverage = oemPartsCoverage;
	}

	public java.lang.Double getCarLiabilityCoverage() {
		return this.carLiabilityCoverage;
	}

	public void setCarLiabilityCoverage(java.lang.Double carLiabilityCoverage) {
		this.carLiabilityCoverage = carLiabilityCoverage;
	}

	public java.lang.Double getComprehensiveCoverage() {
		return this.comprehensiveCoverage;
	}

	public void setComprehensiveCoverage(java.lang.Double comprehensiveCoverage) {
		this.comprehensiveCoverage = comprehensiveCoverage;
	}

	public java.lang.Double getCollisionCoverage() {
		return this.collisionCoverage;
	}

	public void setCollisionCoverage(java.lang.Double collisionCoverage) {
		this.collisionCoverage = collisionCoverage;
	}

	public java.lang.Double getMedicalPaymentsCoverage() {
		return this.medicalPaymentsCoverage;
	}

	public void setMedicalPaymentsCoverage(
			java.lang.Double medicalPaymentsCoverage) {
		this.medicalPaymentsCoverage = medicalPaymentsCoverage;
	}

	public java.lang.Double getPersonalInjuryProtection() {
		return this.personalInjuryProtection;
	}

	public void setPersonalInjuryProtection(
			java.lang.Double personalInjuryProtection) {
		this.personalInjuryProtection = personalInjuryProtection;
	}

	public java.lang.String getMemberId() {
		return this.memberId;
	}

	public void setMemberId(java.lang.String memberId) {
		this.memberId = memberId;
	}

	public long getTimeLimitDays() {
		return this.timeLimitDays;
	}

	public void setTimeLimitDays(long timeLimitDays) {
		this.timeLimitDays = timeLimitDays;
	}

	public java.lang.Double getUninsuradeAndUnderinsuredMotoristCoverage() {
		return this.uninsuradeAndUnderinsuredMotoristCoverage;
	}

	public void setUninsuradeAndUnderinsuredMotoristCoverage(
			java.lang.Double uninsuradeAndUnderinsuredMotoristCoverage) {
		this.uninsuradeAndUnderinsuredMotoristCoverage = uninsuradeAndUnderinsuredMotoristCoverage;
	}

	public Policy(java.math.BigInteger id, java.lang.String memberId,
			java.lang.Double deductible,
			java.lang.Double transportationExpenseCoverage,
			java.lang.Double oemPartsCoverage,
			java.lang.Double carLiabilityCoverage,
			java.lang.Double comprehensiveCoverage,
			java.lang.Double collisionCoverage,
			java.lang.Double medicalPaymentsCoverage,
			java.lang.Double personalInjuryProtection, long timeLimitDays,
			java.lang.Double uninsuradeAndUnderinsuredMotoristCoverage) {
		this.id = id;
		this.memberId = memberId;
		this.deductible = deductible;
		this.transportationExpenseCoverage = transportationExpenseCoverage;
		this.oemPartsCoverage = oemPartsCoverage;
		this.carLiabilityCoverage = carLiabilityCoverage;
		this.comprehensiveCoverage = comprehensiveCoverage;
		this.collisionCoverage = collisionCoverage;
		this.medicalPaymentsCoverage = medicalPaymentsCoverage;
		this.personalInjuryProtection = personalInjuryProtection;
		this.timeLimitDays = timeLimitDays;
		this.uninsuradeAndUnderinsuredMotoristCoverage = uninsuradeAndUnderinsuredMotoristCoverage;
	}

}