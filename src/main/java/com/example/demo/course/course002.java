package com.example.demo.course;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class course002 {
	@Id
	private int id;
	private String name;
	private String place;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	@Override
	public String toString() {
		return "course [id=" + id + ", name=" + name + ", place=" + place + "]";
	}
	public course002() {
		super();
	}
	public course002(int id, String name, String place) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
	}
	public void setPlace(String place) {
		this.place = place;
	}

}
