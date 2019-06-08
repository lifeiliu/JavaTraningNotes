package com.marlabs.collections.map;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Customer implements Serializable, Comparable<Customer> {
	private String customerId;
	private String customerName;
	private long pinCode;

	/**
	 * @param customerId
	 * @param customerName
	 * @param pinCode
	 */
	public Customer(String customerId, String customerName, long pinCode) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.pinCode = pinCode;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @return the pinCode
	 */
	public long getPinCode() {
		return pinCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName="
				+ customerName + ", pinCode=" + pinCode + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		System.out.println("From hashCode Method");
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result
				+ ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + (int) (pinCode ^ (pinCode >>> 32));
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		System.out.println("from equals Method");
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Customer)) {
			return false;
		}
		Customer other = (Customer) obj;
		if (customerId == null) {
			if (other.customerId != null) {
				return false;
			}
		} else if (!customerId.equals(other.customerId)) {
			return false;
		}
		if (customerName == null) {
			if (other.customerName != null) {
				return false;
			}
		} else if (!customerName.equals(other.customerName)) {
			return false;
		}
		if (pinCode != other.pinCode) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Customer o) {
		System.out.println("CompareTo Method");
		return this.customerId.compareTo(o.customerId);
	}

	@Override
	protected void finalize() {
		System.out.println("I Am From finalize Method");
	}

}
