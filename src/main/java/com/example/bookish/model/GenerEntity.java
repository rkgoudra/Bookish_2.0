package com.example.bookish.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gener")
public class GenerEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	
	@Column(name="gener_name")
	private String gener_name;
	
	@Column(name="gener_status")
	private Integer gener_status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGener_name() {
		return gener_name;
	}

	public void setGener_name(String gener_name) {
		this.gener_name = gener_name;
	}

	public Integer getGener_status() {
		return gener_status;
	}

	public void setGener_status(Integer gener_status) {
		this.gener_status = gener_status;
	}

}
