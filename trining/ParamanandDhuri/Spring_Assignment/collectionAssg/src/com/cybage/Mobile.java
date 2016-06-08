package com.cybage;
										//Simple pojo class 
public class Mobile {
String model;
String company;
double price;
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "Mobile [model=" + model + ", company=" + company + ", price=" + price + "]";
}

}
