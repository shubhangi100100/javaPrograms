package com.iris.springIOCDemo;

public class laptop {
private int ram;
private String company;

public laptop() {
	System.out.print("i m parameterised constructor");
}
public laptop(int ram, String company) {
	
	
	this.ram = ram;
	this.company = company;
}
public void setRam(int ram) {
	this.ram = ram;
}
public void setCompany(String company) {
	this.company = company;
}
public void printDetails() {
	System.out.println("ram: " +ram+ " company: "+company);
	
}


}
