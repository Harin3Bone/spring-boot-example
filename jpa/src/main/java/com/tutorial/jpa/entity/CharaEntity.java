package com.tutorial.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "Character")
@Data
public class CharaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "name",unique = true)
	private String name;
	
	@Column(name = "class")
	private String clss;
	
	@Column(name = "label")
	private String label;
	
	@Column(name = "level")
	private int lv;
}
