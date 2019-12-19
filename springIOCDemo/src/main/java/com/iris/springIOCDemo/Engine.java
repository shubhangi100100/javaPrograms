package com.iris.springIOCDemo;

public class Engine {
private int cc;
private String make;
public Engine(int cc, String make) {
	
	this.cc = cc;
	this.make = make;
}
@Override
public String toString() {
	return "Engine [cc=" + cc + ", make=" + make + "]";
}

}
