package com.onesoft.Ac.Entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ac")
public class Ac {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String brand;
	private int price;
	private String colour;
	private boolean isquality;
	private String model;
	private int rating;
	private String capacity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isIsquality() {
		return isquality;
	}

	public void setIsquality(boolean isquality) {
		this.isquality = isquality;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Ac [id=" + id + ", brand=" + brand + ", price=" + price + ", colour=" + colour + ", isquality="
				+ isquality + ", model=" + model + ", rating=" + rating + ", capacity=" + capacity + "]";
	}

}
