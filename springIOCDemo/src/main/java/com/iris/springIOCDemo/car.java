package com.iris.springIOCDemo;

public class car {
private int carNumber;
private String carModel;
private Engine Obj3;


public car(int carNumber, String carModel, Engine Obj3) {
	
	this.carNumber = carNumber;
	this.carModel = carModel;
	this.Obj3 = Obj3;
}


@Override
public String toString() {
	return "car [carNumber=" + carNumber + ", carModel=" + carModel + ", Obj3=" + Obj3 + "]";
}



}
