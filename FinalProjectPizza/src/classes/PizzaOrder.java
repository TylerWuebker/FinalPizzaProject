package classes;

import java.util.List;
import java.util.Scanner;

public class PizzaOrder {
	
	private String cName;
	private String cAddress;
	private String cOrder;
	private double cTotal;
	private String cNumber;
	
	
	public String getcName() {
		return cName;
	}
	
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	public String getcAddress() {
		return cAddress;
	}
	
	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}
	
	public double getcTotal() {
		return cTotal;
	}
	
	public void setcTotal(double cTotal) {
		this.cTotal = cTotal;
	}
	
	public String getcNumber() {
		return cNumber;
	}
	
	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}
	
	public String getcOrder() {
		return cOrder;
	}

	public void setcOrder(String cOrder) {
		this.cOrder = cOrder;
	}
	
	public PizzaOrder() {
		
	}
	
	public PizzaOrder(String cName, String cAddress, String cOrder, String cNumber, double cTotal) {
		this.cName = cName;
		this.cAddress = cAddress;
		this.cOrder = cOrder;
		this.cNumber = cNumber;
		this.cTotal = cTotal;
	}
	
	public void display() {
		System.out.println("**********");
		System.out.println("Name: " + this.cName + " \n Address: " + this.cAddress + " \n Phone Number: " + this.cNumber + " \n Order Description: " + this.cOrder +  " \n Total Order: $" + this.cTotal);
		System.out.println("**********");
		
	}
	
	
}
