package ex1;

public class Ex_Customer {
	private int    customerID;
	private String customerName;
	private String customerGrade;
	private int    bonusPoint;
	private double bonusRatio;
	
	// Default Constructor
	public Ex_Customer(){
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	// Constructor Overloding
	public Ex_Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price){
		bonusPoint += price*bonusRatio;
		return bonusPoint;
	}
	
	public String showCustomerInfo(){
		return customerID + " / " + customerName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
}
