package com.marlabs.collections.examples;

import java.io.Serializable;

@SuppressWarnings("serial")
public final class Product implements Serializable, Comparable<Product> {
	private String productId;
	private String productName;
	private double productCost;

	private Product() {
		System.out.println("From Default Cons");
	}

	/**
	 * @param productId
	 * @param productName
	 * @param productCost
	 */
	public Product(String productId, String productName, double productCost) {
		this();
		this.productId = productId;
		this.productName = productName;
		this.productCost = productCost;
	}

	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @return the productCost
	 */
	public double getProductCost() {
		return productCost;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName="
				+ productName + ", productCost=" + productCost + "]";
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
		long temp;
		temp = Double.doubleToLongBits(productCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((productId == null) ? 0 : productId.hashCode());
		result = prime * result
				+ ((productName == null) ? 0 : productName.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		System.out.println("From equals Method");
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Product)) {
			return false;
		}
		Product other = (Product) obj;
		if (Double.doubleToLongBits(productCost) != Double
				.doubleToLongBits(other.productCost)) {
			return false;
		}
		if (productId == null) {
			if (other.productId != null) {
				return false;
			}
		} else if (!productId.equals(other.productId)) {
			return false;
		}
		if (productName == null) {
			if (other.productName != null) {
				return false;
			}
		} else if (!productName.equals(other.productName)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Product o) {
		System.out.println("From compareTo Method");
		return this.productName.compareTo(o.productName);
	}

}
