/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * 
 */
public class Cars {
	private int carNum;
	private String carModel;
	private String carBrand;
	private int price;
	/**
	 * @return the carNum
	 */
	public int getCarNum() {
		return carNum;
	}
	/**
	 * @param carNum the carNum to set
	 */
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	/**
	 * @return the carModel
	 */
	public String getCarModel() {
		return carModel;
	}
	/**
	 * @param carModel the carModel to set
	 */
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	/**
	 * @return the carBrand
	 */
	public String getCarBrand() {
		return carBrand;
	}
	/**
	 * @param carBrand the carBrand to set
	 */
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Cars [carNum=" + carNum + ", carModel=" + carModel + ", carBrand=" + carBrand + ", price=" + price
				+ "]";
	}/**
	 * 
	 */
	public Cars() {
		// TODO Auto-generated constructor stub
	}

}
